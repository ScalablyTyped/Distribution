package typings.graphqlRelay.mod

import typings.graphqlRelay.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackwardConnectionArgs_ extends js.Object {
  var before: Type = js.native
  var last: Type = js.native
}

object BackwardConnectionArgs_ {
  @scala.inline
  def apply(before: Type, last: Type): BackwardConnectionArgs_ = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackwardConnectionArgs_]
  }
  @scala.inline
  implicit class BackwardConnectionArgs_Ops[Self <: BackwardConnectionArgs_] (val x: Self) extends AnyVal {
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
    def setBefore(value: Type): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast(value: Type): Self = this.set("last", value.asInstanceOf[js.Any])
  }
  
}

