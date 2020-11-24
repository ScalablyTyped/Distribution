package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/MobileStepper.MobileStepperClassKey>> */
@js.native
trait PartialStyleRulesMobileSt extends js.Object {
  
  var dot: js.UndefOr[CSSProperties] = js.native
  
  var dotActive: js.UndefOr[CSSProperties] = js.native
  
  var dots: js.UndefOr[CSSProperties] = js.native
  
  var positionBottom: js.UndefOr[CSSProperties] = js.native
  
  var positionStatic: js.UndefOr[CSSProperties] = js.native
  
  var positionTop: js.UndefOr[CSSProperties] = js.native
  
  var progress: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesMobileSt {
  
  @scala.inline
  def apply(): PartialStyleRulesMobileSt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesMobileSt]
  }
  
  @scala.inline
  implicit class PartialStyleRulesMobileStOps[Self <: PartialStyleRulesMobileSt] (val x: Self) extends AnyVal {
    
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
    def setDot(value: CSSProperties): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setDotActive(value: CSSProperties): Self = this.set("dotActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotActive: Self = this.set("dotActive", js.undefined)
    
    @scala.inline
    def setDots(value: CSSProperties): Self = this.set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    
    @scala.inline
    def setPositionBottom(value: CSSProperties): Self = this.set("positionBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionBottom: Self = this.set("positionBottom", js.undefined)
    
    @scala.inline
    def setPositionStatic(value: CSSProperties): Self = this.set("positionStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionStatic: Self = this.set("positionStatic", js.undefined)
    
    @scala.inline
    def setPositionTop(value: CSSProperties): Self = this.set("positionTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionTop: Self = this.set("positionTop", js.undefined)
    
    @scala.inline
    def setProgress(value: CSSProperties): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
