package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductColor extends js.Object {
  
  var dark: String = js.native
  
  var darkActive: String = js.native
  
  var darkHover: String = js.native
  
  var darker: String = js.native
  
  var light: String = js.native
  
  var lightActive: String = js.native
  
  var lightHover: String = js.native
  
  var normal: String = js.native
  
  var normalActive: String = js.native
  
  var normalHover: String = js.native
}
object ProductColor {
  
  @scala.inline
  def apply(
    dark: String,
    darkActive: String,
    darkHover: String,
    darker: String,
    light: String,
    lightActive: String,
    lightHover: String,
    normal: String,
    normalActive: String,
    normalHover: String
  ): ProductColor = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], darkActive = darkActive.asInstanceOf[js.Any], darkHover = darkHover.asInstanceOf[js.Any], darker = darker.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], lightActive = lightActive.asInstanceOf[js.Any], lightHover = lightHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductColor]
  }
  
  @scala.inline
  implicit class ProductColorOps[Self <: ProductColor] (val x: Self) extends AnyVal {
    
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
    def setDark(value: String): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkActive(value: String): Self = this.set("darkActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkHover(value: String): Self = this.set("darkHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarker(value: String): Self = this.set("darker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: String): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightActive(value: String): Self = this.set("lightActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightHover(value: String): Self = this.set("lightHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: String): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalActive(value: String): Self = this.set("normalActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalHover(value: String): Self = this.set("normalHover", value.asInstanceOf[js.Any])
  }
}
