package typings
package gulpDashHelpLib.gulpDashHelpMod.gulpHelpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GulpHelp
  extends orchestratorLib.orchestratorMod.namespaced {
  @JSName("dest")
  var dest_Original: gulpLib.gulpMod.GulpClientNs.DestMethod = js.native
  @JSName("src")
  var src_Original: gulpLib.gulpMod.GulpClientNs.SrcMethod = js.native
  @JSName("task")
  var task_Original: TaskMethod = js.native
  @JSName("watch")
  var watch_Original: gulpLib.gulpMod.GulpClientNs.WatchMethod = js.native
  def dest(getFolderPath: js.Function1[/* file */ vinylLib.vinylMod.File, java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def src(globs: js.Array[java.lang.String], opt: vinylDashFsLib.vinylDashFsMod.SrcOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(name: java.lang.String, deps: js.Array[java.lang.String]): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(
    name: java.lang.String,
    deps: js.Array[java.lang.String],
    fn: gulpLib.gulpMod.GulpClientNs.TaskCallback
  ): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(
    name: java.lang.String,
    deps: js.Array[java.lang.String],
    fn: gulpLib.gulpMod.GulpClientNs.TaskCallback,
    option: TaskOptions
  ): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(name: java.lang.String, fn: gulpLib.gulpMod.GulpClientNs.TaskCallback): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(name: java.lang.String, fn: gulpLib.gulpMod.GulpClientNs.TaskCallback, option: TaskOptions): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(name: java.lang.String, help: gulpDashHelpLib.HelpOption): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(name: java.lang.String, help: gulpDashHelpLib.HelpOption, deps: js.Array[java.lang.String]): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(
    name: java.lang.String,
    help: gulpDashHelpLib.HelpOption,
    deps: js.Array[java.lang.String],
    fn: gulpLib.gulpMod.GulpClientNs.TaskCallback
  ): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(
    name: java.lang.String,
    help: gulpDashHelpLib.HelpOption,
    deps: js.Array[java.lang.String],
    fn: gulpLib.gulpMod.GulpClientNs.TaskCallback,
    option: TaskOptions
  ): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(
    name: java.lang.String,
    help: gulpDashHelpLib.HelpOption,
    fn: gulpLib.gulpMod.GulpClientNs.TaskCallback
  ): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def task(
    name: java.lang.String,
    help: gulpDashHelpLib.HelpOption,
    fn: gulpLib.gulpMod.GulpClientNs.TaskCallback,
    option: TaskOptions
  ): js.Any = js.native
  def watch(globs: gulpLib.gulpMod.GulpClientNs.Globs): nodeLib.fsMod.FSWatcher = js.native
  def watch(
    globs: gulpLib.gulpMod.GulpClientNs.Globs,
    fn: undertakerLib.undertakerMod.UndertakerNs.TaskFunction
  ): nodeLib.fsMod.FSWatcher = js.native
  def watch(globs: gulpLib.gulpMod.GulpClientNs.Globs, opts: gulpLib.gulpMod.GulpClientNs.WatchOptions): nodeLib.fsMod.FSWatcher = js.native
  def watch(
    globs: gulpLib.gulpMod.GulpClientNs.Globs,
    opts: gulpLib.gulpMod.GulpClientNs.WatchOptions,
    fn: undertakerLib.undertakerMod.UndertakerNs.TaskFunction
  ): nodeLib.fsMod.FSWatcher = js.native
}

