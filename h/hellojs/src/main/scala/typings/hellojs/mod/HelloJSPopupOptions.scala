package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSPopupOptions extends js.Object {
  var height: Double = js.native
  var resizable: Double = js.native
  var scrollbars: Double = js.native
  var width: Double = js.native
}

object HelloJSPopupOptions {
  @scala.inline
  def apply(height: Double, resizable: Double, scrollbars: Double, width: Double): HelloJSPopupOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], scrollbars = scrollbars.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSPopupOptions]
  }
  @scala.inline
  implicit class HelloJSPopupOptionsOps[Self <: HelloJSPopupOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizable(value: Double): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollbars(value: Double): Self = this.set("scrollbars", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

