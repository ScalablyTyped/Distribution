package typings.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemePalette extends js.Object {
  
  var accent1Color: js.UndefOr[String] = js.native
  
  var accent2Color: js.UndefOr[String] = js.native
  
  var accent3Color: js.UndefOr[String] = js.native
  
  var alternateTextColor: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var canvasColor: js.UndefOr[String] = js.native
  
  var clockCircleColor: js.UndefOr[String] = js.native
  
  var disabledColor: js.UndefOr[String] = js.native
  
  var pickerHeaderColor: js.UndefOr[String] = js.native
  
  var primary1Color: js.UndefOr[String] = js.native
  
  var primary2Color: js.UndefOr[String] = js.native
  
  var primary3Color: js.UndefOr[String] = js.native
  
  var secondaryTextColor: js.UndefOr[String] = js.native
  
  var shadowColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object ThemePalette {
  
  @scala.inline
  def apply(): ThemePalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemePalette]
  }
  
  @scala.inline
  implicit class ThemePaletteOps[Self <: ThemePalette] (val x: Self) extends AnyVal {
    
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
    def setAccent1Color(value: String): Self = this.set("accent1Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccent1Color: Self = this.set("accent1Color", js.undefined)
    
    @scala.inline
    def setAccent2Color(value: String): Self = this.set("accent2Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccent2Color: Self = this.set("accent2Color", js.undefined)
    
    @scala.inline
    def setAccent3Color(value: String): Self = this.set("accent3Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccent3Color: Self = this.set("accent3Color", js.undefined)
    
    @scala.inline
    def setAlternateTextColor(value: String): Self = this.set("alternateTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateTextColor: Self = this.set("alternateTextColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setCanvasColor(value: String): Self = this.set("canvasColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasColor: Self = this.set("canvasColor", js.undefined)
    
    @scala.inline
    def setClockCircleColor(value: String): Self = this.set("clockCircleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockCircleColor: Self = this.set("clockCircleColor", js.undefined)
    
    @scala.inline
    def setDisabledColor(value: String): Self = this.set("disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledColor: Self = this.set("disabledColor", js.undefined)
    
    @scala.inline
    def setPickerHeaderColor(value: String): Self = this.set("pickerHeaderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerHeaderColor: Self = this.set("pickerHeaderColor", js.undefined)
    
    @scala.inline
    def setPrimary1Color(value: String): Self = this.set("primary1Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary1Color: Self = this.set("primary1Color", js.undefined)
    
    @scala.inline
    def setPrimary2Color(value: String): Self = this.set("primary2Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary2Color: Self = this.set("primary2Color", js.undefined)
    
    @scala.inline
    def setPrimary3Color(value: String): Self = this.set("primary3Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary3Color: Self = this.set("primary3Color", js.undefined)
    
    @scala.inline
    def setSecondaryTextColor(value: String): Self = this.set("secondaryTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryTextColor: Self = this.set("secondaryTextColor", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
