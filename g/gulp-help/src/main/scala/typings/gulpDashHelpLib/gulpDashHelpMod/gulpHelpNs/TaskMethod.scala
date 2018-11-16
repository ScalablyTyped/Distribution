package typings
package gulpDashHelpLib.gulpDashHelpMod.gulpHelpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskMethod extends js.Object {
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def apply(name: java.lang.String): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def apply(name: java.lang.String, deps: js.Array[java.lang.String]): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def apply(
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
  def apply(
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
  def apply(name: java.lang.String, fn: gulpLib.gulpMod.GulpClientNs.TaskCallback): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def apply(name: java.lang.String, fn: gulpLib.gulpMod.GulpClientNs.TaskCallback, option: TaskOptions): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def apply(name: java.lang.String, help: gulpDashHelpLib.HelpOption): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def apply(name: java.lang.String, help: gulpDashHelpLib.HelpOption, deps: js.Array[java.lang.String]): js.Any = js.native
  /**
           * Define a task.
           *
           * @param name the name of the task. Tasks that you want to run from the command line should not have spaces in them.
           * @param help Custom help message as a string. If you want to hide the task from the help menu, supply false
           * @param deps an array of tasks to be executed and completed before your task will run.
           * @param fn the function that performs the task's operations. Generally this takes the form of gulp.src().pipe(someplugin()).
           * @param option task options
           */
  def apply(
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
  def apply(
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
  def apply(
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
  def apply(
    name: java.lang.String,
    help: gulpDashHelpLib.HelpOption,
    fn: gulpLib.gulpMod.GulpClientNs.TaskCallback,
    option: TaskOptions
  ): js.Any = js.native
}

