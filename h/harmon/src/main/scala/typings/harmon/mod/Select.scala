package typings.harmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select extends js.Object {
  var query: String = js.native
  def func(node: js.Any): js.Any = js.native
}

object Select {
  @scala.inline
  def apply(func: js.Any => js.Any, query: String): Select = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select]
  }
  @scala.inline
  implicit class SelectOps[Self <: Select] (val x: Self) extends AnyVal {
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
    def setFunc(value: js.Any => js.Any): Self = this.set("func", js.Any.fromFunction1(value))
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

