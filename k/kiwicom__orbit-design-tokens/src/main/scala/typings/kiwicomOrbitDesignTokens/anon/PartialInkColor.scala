package typings.kiwicomOrbitDesignTokens.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.InkColor> */
@js.native
trait PartialInkColor extends js.Object {
  
  var light: js.UndefOr[String] = js.native
  
  var lightActive: js.UndefOr[String] = js.native
  
  var lightHover: js.UndefOr[String] = js.native
  
  var lighter: js.UndefOr[String] = js.native
  
  var lighterActive: js.UndefOr[String] = js.native
  
  var lighterHover: js.UndefOr[String] = js.native
  
  var normal: js.UndefOr[String] = js.native
  
  var normalActive: js.UndefOr[String] = js.native
  
  var normalHover: js.UndefOr[String] = js.native
}
object PartialInkColor {
  
  @scala.inline
  def apply(): PartialInkColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInkColor]
  }
  
  @scala.inline
  implicit class PartialInkColorOps[Self <: PartialInkColor] (val x: Self) extends AnyVal {
    
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
    def setLighter(value: String): Self = this.set("lighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLighter: Self = this.set("lighter", js.undefined)
    
    @scala.inline
    def setLighterActive(value: String): Self = this.set("lighterActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLighterActive: Self = this.set("lighterActive", js.undefined)
    
    @scala.inline
    def setLighterHover(value: String): Self = this.set("lighterHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLighterHover: Self = this.set("lighterHover", js.undefined)
    
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
