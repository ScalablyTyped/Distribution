package typings.jqueryBootstrapWizard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var bootstrapWizard: Wizard
}
object JQueryStatic {
  
  inline def apply(bootstrapWizard: Wizard): JQueryStatic = {
    val __obj = js.Dynamic.literal(bootstrapWizard = bootstrapWizard.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setBootstrapWizard(value: Wizard): Self = StObject.set(x, "bootstrapWizard", value.asInstanceOf[js.Any])
  }
}
