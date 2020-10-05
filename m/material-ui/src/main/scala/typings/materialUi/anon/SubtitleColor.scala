package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubtitleColor extends js.Object {
  var fontWeight: js.UndefOr[Double] = js.native
  var subtitleColor: js.UndefOr[String] = js.native
  var titleColor: js.UndefOr[String] = js.native
}

object SubtitleColor {
  @scala.inline
  def apply(): SubtitleColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubtitleColor]
  }
  @scala.inline
  implicit class SubtitleColorOps[Self <: SubtitleColor] (val x: Self) extends AnyVal {
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
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setSubtitleColor(value: String): Self = this.set("subtitleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleColor: Self = this.set("subtitleColor", js.undefined)
    @scala.inline
    def setTitleColor(value: String): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
  }
  
}

