package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyColor extends js.Object {
  var bodyColor: js.UndefOr[String] = js.native
  var bodyFontSize: js.UndefOr[Double] = js.native
  var titleFontSize: js.UndefOr[Double] = js.native
}

object BodyColor {
  @scala.inline
  def apply(): BodyColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyColor]
  }
  @scala.inline
  implicit class BodyColorOps[Self <: BodyColor] (val x: Self) extends AnyVal {
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
    def setBodyColor(value: String): Self = this.set("bodyColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyColor: Self = this.set("bodyColor", js.undefined)
    @scala.inline
    def setBodyFontSize(value: Double): Self = this.set("bodyFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyFontSize: Self = this.set("bodyFontSize", js.undefined)
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
  }
  
}

