package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectIntegration extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object ProjectIntegration {
  
  inline def apply(): ProjectIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectIntegration]
  }
  
  extension [Self <: ProjectIntegration](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
