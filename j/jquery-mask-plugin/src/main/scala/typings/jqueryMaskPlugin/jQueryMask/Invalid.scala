package typings.jqueryMaskPlugin.jQueryMask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invalid extends js.Object {
  var e: String = js.native
  var p: Double = js.native
  var v: String = js.native
}

object Invalid {
  @scala.inline
  def apply(e: String, p: Double, v: String): Invalid = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalid]
  }
  @scala.inline
  implicit class InvalidOps[Self <: Invalid] (val x: Self) extends AnyVal {
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
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setP(value: Double): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

