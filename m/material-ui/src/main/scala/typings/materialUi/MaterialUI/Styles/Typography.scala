package typings.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typography extends js.Object {
  
  var fontStyleButtonFontSize: Double = js.native
  
  // font weight
  var fontWeightLight: Double = js.native
  
  var fontWeightMedium: Double = js.native
  
  var fontWeightNormal: Double = js.native
  
  var textDarkBlack: String = js.native
  
  var textDarkWhite: String = js.native
  
  var textFullBlack: String = js.native
  
  var textFullWhite: String = js.native
  
  var textLightBlack: String = js.native
  
  var textLightWhite: String = js.native
  
  var textMinBlack: String = js.native
}
object Typography {
  
  @scala.inline
  def apply(
    fontStyleButtonFontSize: Double,
    fontWeightLight: Double,
    fontWeightMedium: Double,
    fontWeightNormal: Double,
    textDarkBlack: String,
    textDarkWhite: String,
    textFullBlack: String,
    textFullWhite: String,
    textLightBlack: String,
    textLightWhite: String,
    textMinBlack: String
  ): Typography = {
    val __obj = js.Dynamic.literal(fontStyleButtonFontSize = fontStyleButtonFontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightNormal = fontWeightNormal.asInstanceOf[js.Any], textDarkBlack = textDarkBlack.asInstanceOf[js.Any], textDarkWhite = textDarkWhite.asInstanceOf[js.Any], textFullBlack = textFullBlack.asInstanceOf[js.Any], textFullWhite = textFullWhite.asInstanceOf[js.Any], textLightBlack = textLightBlack.asInstanceOf[js.Any], textLightWhite = textLightWhite.asInstanceOf[js.Any], textMinBlack = textMinBlack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  
  @scala.inline
  implicit class TypographyOps[Self <: Typography] (val x: Self) extends AnyVal {
    
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
    def setFontStyleButtonFontSize(value: Double): Self = this.set("fontStyleButtonFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightLight(value: Double): Self = this.set("fontWeightLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightMedium(value: Double): Self = this.set("fontWeightMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightNormal(value: Double): Self = this.set("fontWeightNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDarkBlack(value: String): Self = this.set("textDarkBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDarkWhite(value: String): Self = this.set("textDarkWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFullBlack(value: String): Self = this.set("textFullBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFullWhite(value: String): Self = this.set("textFullWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLightBlack(value: String): Self = this.set("textLightBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLightWhite(value: String): Self = this.set("textLightWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMinBlack(value: String): Self = this.set("textMinBlack", value.asInstanceOf[js.Any])
  }
}
