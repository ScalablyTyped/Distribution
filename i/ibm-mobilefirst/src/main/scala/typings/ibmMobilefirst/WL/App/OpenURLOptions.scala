package typings.ibmMobilefirst.WL.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenURLOptions extends js.Object {
  var directories: js.UndefOr[Double] = js.native
  var location: js.UndefOr[Double] = js.native
  var menubar: js.UndefOr[Double] = js.native
  var resizable: js.UndefOr[Double] = js.native
  var scrollbars: js.UndefOr[Double] = js.native
  var status: js.UndefOr[Double] = js.native
  var toolbar: js.UndefOr[Double] = js.native
}

object OpenURLOptions {
  @scala.inline
  def apply(): OpenURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenURLOptions]
  }
  @scala.inline
  implicit class OpenURLOptionsOps[Self <: OpenURLOptions] (val x: Self) extends AnyVal {
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
    def setDirectories(value: Double): Self = this.set("directories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMenubar(value: Double): Self = this.set("menubar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenubar: Self = this.set("menubar", js.undefined)
    @scala.inline
    def setResizable(value: Double): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setScrollbars(value: Double): Self = this.set("scrollbars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbars: Self = this.set("scrollbars", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setToolbar(value: Double): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
  
}

