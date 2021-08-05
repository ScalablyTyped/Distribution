package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Wizard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWizard extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Wizard
  
  /* static member */
  var fn: Wizard
}
object TypeofWizard {
  
  inline def apply(extend: js.Object => Wizard, fn: Wizard): TypeofWizard = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWizard]
  }
  
  extension [Self <: TypeofWizard](x: Self) {
    
    inline def setExtend(value: js.Object => Wizard): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Wizard): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
