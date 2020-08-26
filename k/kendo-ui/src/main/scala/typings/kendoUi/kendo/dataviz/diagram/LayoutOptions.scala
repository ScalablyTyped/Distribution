package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutOptions extends js.Object {
  var alignContent: js.UndefOr[String] = js.native
  var alignItems: js.UndefOr[String] = js.native
  var justifyContent: js.UndefOr[String] = js.native
  var lineSpacing: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var orientation: js.UndefOr[String] = js.native
  var spacing: js.UndefOr[Double] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
}

object LayoutOptions {
  @scala.inline
  def apply(): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  implicit class LayoutOptionsOps[Self <: LayoutOptions] (val x: Self) extends AnyVal {
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
    def setAlignContent(value: String): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    @scala.inline
    def setAlignItems(value: String): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    @scala.inline
    def setJustifyContent(value: String): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    @scala.inline
    def setLineSpacing(value: Double): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineSpacing: Self = this.set("lineSpacing", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

