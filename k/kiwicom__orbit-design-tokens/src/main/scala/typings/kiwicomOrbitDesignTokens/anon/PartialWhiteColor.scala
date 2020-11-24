package typings.kiwicomOrbitDesignTokens.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.WhiteColor> */
@js.native
trait PartialWhiteColor extends js.Object {
  
  var normal: js.UndefOr[String] = js.native
  
  var normalActive: js.UndefOr[String] = js.native
  
  var normalHover: js.UndefOr[String] = js.native
}
object PartialWhiteColor {
  
  @scala.inline
  def apply(): PartialWhiteColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWhiteColor]
  }
  
  @scala.inline
  implicit class PartialWhiteColorOps[Self <: PartialWhiteColor] (val x: Self) extends AnyVal {
    
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
