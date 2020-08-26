package typings.graphqlRelay.mod

import typings.graphqlRelay.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardConnectionArgs_ extends js.Object {
  var after: Type = js.native
  var first: Type = js.native
}

object ForwardConnectionArgs_ {
  @scala.inline
  def apply(after: Type, first: Type): ForwardConnectionArgs_ = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardConnectionArgs_]
  }
  @scala.inline
  implicit class ForwardConnectionArgs_Ops[Self <: ForwardConnectionArgs_] (val x: Self) extends AnyVal {
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
    def setAfter(value: Type): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst(value: Type): Self = this.set("first", value.asInstanceOf[js.Any])
  }
  
}

