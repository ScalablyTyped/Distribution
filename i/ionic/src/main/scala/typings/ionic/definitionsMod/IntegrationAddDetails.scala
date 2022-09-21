package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegrationAddDetails extends StObject {
  
  var enableArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  var env: IonicEnvironment
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var root: String
}
object IntegrationAddDetails {
  
  inline def apply(env: IonicEnvironment, root: String): IntegrationAddDetails = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationAddDetails]
  }
  
  extension [Self <: IntegrationAddDetails](x: Self) {
    
    inline def setEnableArgs(value: js.Array[String]): Self = StObject.set(x, "enableArgs", value.asInstanceOf[js.Any])
    
    inline def setEnableArgsUndefined: Self = StObject.set(x, "enableArgs", js.undefined)
    
    inline def setEnableArgsVarargs(value: String*): Self = StObject.set(x, "enableArgs", js.Array(value*))
    
    inline def setEnv(value: IonicEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
