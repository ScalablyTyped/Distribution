package typings.gulpNodemon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends _Option {
  var tasks: js.UndefOr[
    js.Array[String] | (js.Function1[/* changedFiles */ js.Array[String], js.Array[String]])
  ] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTasksVarargs(value: String*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasksFunction1(value: /* changedFiles */ js.Array[String] => js.Array[String]): Self = this.set("tasks", js.Any.fromFunction1(value))
    @scala.inline
    def setTasks(value: js.Array[String] | (js.Function1[/* changedFiles */ js.Array[String], js.Array[String]])): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
  }
  
}

