package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Stepper/Stepper.StepperClasskey>> */
trait PartialClassNameMapSteppe extends StObject {
  
  var alternativeLabel: js.UndefOr[String] = js.undefined
  
  var horizontal: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapSteppe {
  
  @scala.inline
  def apply(): PartialClassNameMapSteppe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSteppe]
  }
  
  @scala.inline
  implicit class PartialClassNameMapSteppeMutableBuilder[Self <: PartialClassNameMapSteppe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternativeLabel(value: String): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeLabelUndefined: Self = StObject.set(x, "alternativeLabel", js.undefined)
    
    @scala.inline
    def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
