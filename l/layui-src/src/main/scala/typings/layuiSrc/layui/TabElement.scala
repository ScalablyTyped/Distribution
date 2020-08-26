package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabElement extends js.Object {
  var bodyElem: String = js.native
  var headerElem: String = js.native
}

object TabElement {
  @scala.inline
  def apply(bodyElem: String, headerElem: String): TabElement = {
    val __obj = js.Dynamic.literal(bodyElem = bodyElem.asInstanceOf[js.Any], headerElem = headerElem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabElement]
  }
  @scala.inline
  implicit class TabElementOps[Self <: TabElement] (val x: Self) extends AnyVal {
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
    def setBodyElem(value: String): Self = this.set("bodyElem", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderElem(value: String): Self = this.set("headerElem", value.asInstanceOf[js.Any])
  }
  
}

