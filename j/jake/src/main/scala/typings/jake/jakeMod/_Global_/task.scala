package typings.jake.jakeMod._Global_

import typings.jake.jakeMod._Global_.jake.Task
import typings.jake.jakeMod._Global_.jake.TaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("task")
@js.native
object task extends js.Object {
  /**
    * @param name The name of the Task
    * @param prereqs Prerequisites to be run before this task
    * @param action The action to perform for this task
    * @param opts
    */
  def apply(name: String): Task = js.native
  def apply(name: String, action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]): Task = js.native
  def apply(
    name: String,
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
    opts: TaskOptions
  ): Task = js.native
  def apply(name: String, opts: TaskOptions): Task = js.native
  def apply(
    name: String,
    opts: TaskOptions,
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
  ): Task = js.native
  def apply(name: String, prereqs: js.Array[String]): Task = js.native
  def apply(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
  ): Task = js.native
  def apply(
    name: String,
    prereqs: js.Array[String],
    action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
    opts: TaskOptions
  ): Task = js.native
}

