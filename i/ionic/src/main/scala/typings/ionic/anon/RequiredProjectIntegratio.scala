package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<ionic.ionic/definitions.ProjectIntegration> */
trait RequiredProjectIntegratio extends StObject {
  
  var enabled: Boolean
  
  var root: String
}
object RequiredProjectIntegratio {
  
  @scala.inline
  def apply(enabled: Boolean, root: String): RequiredProjectIntegratio = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredProjectIntegratio]
  }
  
  @scala.inline
  implicit class RequiredProjectIntegratioMutableBuilder[Self <: RequiredProjectIntegratio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
