package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plan extends StObject {
  
  var parentContext: Context
  
  var rootRequest: Request
}
object Plan {
  
  inline def apply(parentContext: Context, rootRequest: Request): Plan = {
    val __obj = js.Dynamic.literal(parentContext = parentContext.asInstanceOf[js.Any], rootRequest = rootRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
  
  extension [Self <: Plan](x: Self) {
    
    inline def setParentContext(value: Context): Self = StObject.set(x, "parentContext", value.asInstanceOf[js.Any])
    
    inline def setRootRequest(value: Request): Self = StObject.set(x, "rootRequest", value.asInstanceOf[js.Any])
  }
}
