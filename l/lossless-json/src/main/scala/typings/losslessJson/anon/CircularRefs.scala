package typings.losslessJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircularRefs extends js.Object {
  var circularRefs: js.UndefOr[Boolean] = js.native
}

object CircularRefs {
  @scala.inline
  def apply(): CircularRefs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircularRefs]
  }
  @scala.inline
  implicit class CircularRefsOps[Self <: CircularRefs] (val x: Self) extends AnyVal {
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
    def setCircularRefs(value: Boolean): Self = this.set("circularRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircularRefs: Self = this.set("circularRefs", js.undefined)
  }
  
}

