package typings.kiwicomOrbitDesignTokens.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.StatusColor> */
@js.native
trait PartialStatusColor extends js.Object {
  
  var dark: js.UndefOr[String] = js.native
  
  var darkActive: js.UndefOr[String] = js.native
  
  var darkHover: js.UndefOr[String] = js.native
  
  var darker: js.UndefOr[String] = js.native
  
  var light: js.UndefOr[String] = js.native
  
  var lightActive: js.UndefOr[String] = js.native
  
  var lightHover: js.UndefOr[String] = js.native
  
  var normal: js.UndefOr[String] = js.native
  
  var normalActive: js.UndefOr[String] = js.native
  
  var normalHover: js.UndefOr[String] = js.native
}
object PartialStatusColor {
  
  @scala.inline
  def apply(): PartialStatusColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatusColor]
  }
  
  @scala.inline
  implicit class PartialStatusColorOps[Self <: PartialStatusColor] (val x: Self) extends AnyVal {
    
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
    def deleteDark: Self = this.set("dark", js.undefined)
    
    @scala.inline
    def setDarkActive(value: String): Self = this.set("darkActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkActive: Self = this.set("darkActive", js.undefined)
    
    @scala.inline
    def setDarkHover(value: String): Self = this.set("darkHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkHover: Self = this.set("darkHover", js.undefined)
    
    @scala.inline
    def setDarker(value: String): Self = this.set("darker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarker: Self = this.set("darker", js.undefined)
    
    @scala.inline
    def setLight(value: String): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
    
    @scala.inline
    def setLightActive(value: String): Self = this.set("lightActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightActive: Self = this.set("lightActive", js.undefined)
    
    @scala.inline
    def setLightHover(value: String): Self = this.set("lightHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightHover: Self = this.set("lightHover", js.undefined)
    
    @scala.inline
    def setNormal(value: String): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
    
    @scala.inline
    def setNormalActive(value: String): Self = this.set("normalActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalActive: Self = this.set("normalActive", js.undefined)
    
    @scala.inline
    def setNormalHover(value: String): Self = this.set("normalHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalHover: Self = this.set("normalHover", js.undefined)
  }
}
