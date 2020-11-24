package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Stepper/Stepper.StepperClasskey>> */
@js.native
trait PartialClassNameMapSteppe extends js.Object {
  
  var alternativeLabel: js.UndefOr[String] = js.native
  
  var horizontal: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var vertical: js.UndefOr[String] = js.native
}
object PartialClassNameMapSteppe {
  
  @scala.inline
  def apply(): PartialClassNameMapSteppe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSteppe]
  }
  
  @scala.inline
  implicit class PartialClassNameMapSteppeOps[Self <: PartialClassNameMapSteppe] (val x: Self) extends AnyVal {
    
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
    def setAlternativeLabel(value: String): Self = this.set("alternativeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternativeLabel: Self = this.set("alternativeLabel", js.undefined)
    
    @scala.inline
    def setHorizontal(value: String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
