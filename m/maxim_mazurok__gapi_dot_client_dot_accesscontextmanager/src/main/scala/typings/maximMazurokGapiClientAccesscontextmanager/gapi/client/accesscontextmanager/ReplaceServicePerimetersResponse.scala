package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceServicePerimetersResponse extends StObject {
  
  /** List of the Service Perimeter instances. */
  var servicePerimeters: js.UndefOr[js.Array[ServicePerimeter]] = js.undefined
}
object ReplaceServicePerimetersResponse {
  
  inline def apply(): ReplaceServicePerimetersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceServicePerimetersResponse]
  }
  
  extension [Self <: ReplaceServicePerimetersResponse](x: Self) {
    
    inline def setServicePerimeters(value: js.Array[ServicePerimeter]): Self = StObject.set(x, "servicePerimeters", value.asInstanceOf[js.Any])
    
    inline def setServicePerimetersUndefined: Self = StObject.set(x, "servicePerimeters", js.undefined)
    
    inline def setServicePerimetersVarargs(value: ServicePerimeter*): Self = StObject.set(x, "servicePerimeters", js.Array(value :_*))
  }
}
