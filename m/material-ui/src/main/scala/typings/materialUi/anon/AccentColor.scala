package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccentColor extends js.Object {
  var accentColor: js.UndefOr[String] = js.native
}

object AccentColor {
  @scala.inline
  def apply(): AccentColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccentColor]
  }
  @scala.inline
  implicit class AccentColorOps[Self <: AccentColor] (val x: Self) extends AnyVal {
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
    def setAccentColor(value: String): Self = this.set("accentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccentColor: Self = this.set("accentColor", js.undefined)
  }
  
}

