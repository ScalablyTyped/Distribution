package typings.gulpHelp.mod

import typings.gulp.mod.DestMethod
import typings.gulp.mod.Globs
import typings.gulp.mod.SrcMethod
import typings.gulp.mod.TaskCallback
import typings.gulp.mod.WatchMethod
import typings.gulp.mod.WatchOptions
import typings.node.NodeJS.ReadWriteStream
import typings.node.fsMod.FSWatcher
import typings.orchestrator.mod.Orchestrator
import typings.undertaker.mod.TaskFunction
import typings.vinyl.mod.File
import typings.vinylFs.mod.DestOptions
import typings.vinylFs.mod.SrcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpHelp extends Orchestrator {
  @JSName("dest")
  var dest_Original: DestMethod = js.native
  @JSName("src")
  var src_Original: SrcMethod = js.native
  @JSName("task")
  var task_Original: TaskMethod = js.native
  @JSName("watch")
  var watch_Original: WatchMethod = js.native
  def dest(folder: String): ReadWriteStream = js.native
  def dest(folder: String, opt: DestOptions): ReadWriteStream = js.native
  def dest(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
  def src(globs: String): ReadWriteStream = js.native
  def src(globs: String, opt: SrcOptions): ReadWriteStream = js.native
  def src(globs: js.Array[String]): ReadWriteStream = js.native
  def src(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = js.native
  /**
    * Define a task.
    *
    * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
    * @param deps an array of tasks to be executed and completed before your task will run.
    * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
    * @param option task options
    */
  def task(name: String, deps: js.Array[String]): js.Any = js.native
  def task(name: String, deps: js.Array[String], fn: TaskCallback): js.Any = js.native
  def task(name: String, deps: js.Array[String], fn: TaskCallback, option: TaskOptions): js.Any = js.native
  def task(name: String, fn: TaskCallback): js.Any = js.native
  def task(name: String, fn: TaskCallback, option: TaskOptions): js.Any = js.native
  /**
    * Define a task.
    *
    * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
    * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
    * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
    * @param option task options
    */
  def task(name: String, help: HelpOption): js.Any = js.native
  /**
    * Define a task.
    *
    * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
    * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
    * @param deps an array of tasks to be executed and completed before your task will run.
    * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
    * @param option task options
    */
  def task(name: String, help: HelpOption, deps: js.Array[String]): js.Any = js.native
  def task(name: String, help: HelpOption, deps: js.Array[String], fn: TaskCallback): js.Any = js.native
  def task(name: String, help: HelpOption, deps: js.Array[String], fn: TaskCallback, option: TaskOptions): js.Any = js.native
  def task(name: String, help: HelpOption, fn: TaskCallback): js.Any = js.native
  def task(name: String, help: HelpOption, fn: TaskCallback, option: TaskOptions): js.Any = js.native
  def watch(globs: Globs): FSWatcher = js.native
  def watch(globs: Globs, fn: TaskFunction): FSWatcher = js.native
  def watch(globs: Globs, opts: WatchOptions): FSWatcher = js.native
  def watch(globs: Globs, opts: WatchOptions, fn: TaskFunction): FSWatcher = js.native
}

