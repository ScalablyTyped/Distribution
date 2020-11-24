package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MobileStepper/MobileStepper.MobileStepperClassKey>> */
@js.native
trait PartialClassNameMapMobile extends js.Object {
  
  var dot: js.UndefOr[String] = js.native
  
  var dotActive: js.UndefOr[String] = js.native
  
  var dots: js.UndefOr[String] = js.native
  
  var positionBottom: js.UndefOr[String] = js.native
  
  var positionStatic: js.UndefOr[String] = js.native
  
  var positionTop: js.UndefOr[String] = js.native
  
  var progress: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapMobile {
  
  @scala.inline
  def apply(): PartialClassNameMapMobile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapMobile]
  }
  
  @scala.inline
  implicit class PartialClassNameMapMobileOps[Self <: PartialClassNameMapMobile] (val x: Self) extends AnyVal {
    
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
    def setDot(value: String): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setDotActive(value: String): Self = this.set("dotActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotActive: Self = this.set("dotActive", js.undefined)
    
    @scala.inline
    def setDots(value: String): Self = this.set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    
    @scala.inline
    def setPositionBottom(value: String): Self = this.set("positionBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionBottom: Self = this.set("positionBottom", js.undefined)
    
    @scala.inline
    def setPositionStatic(value: String): Self = this.set("positionStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionStatic: Self = this.set("positionStatic", js.undefined)
    
    @scala.inline
    def setPositionTop(value: String): Self = this.set("positionTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionTop: Self = this.set("positionTop", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
