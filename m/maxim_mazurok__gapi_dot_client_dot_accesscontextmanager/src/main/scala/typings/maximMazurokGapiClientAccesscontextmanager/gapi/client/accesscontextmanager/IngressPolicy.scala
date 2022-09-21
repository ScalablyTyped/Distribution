package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngressPolicy extends StObject {
  
  /** Defines the conditions on the source of a request causing this IngressPolicy to apply. */
  var ingressFrom: js.UndefOr[IngressFrom] = js.undefined
  
  /** Defines the conditions on the ApiOperation and request destination that cause this IngressPolicy to apply. */
  var ingressTo: js.UndefOr[IngressTo] = js.undefined
}
object IngressPolicy {
  
  inline def apply(): IngressPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressPolicy]
  }
  
  extension [Self <: IngressPolicy](x: Self) {
    
    inline def setIngressFrom(value: IngressFrom): Self = StObject.set(x, "ingressFrom", value.asInstanceOf[js.Any])
    
    inline def setIngressFromUndefined: Self = StObject.set(x, "ingressFrom", js.undefined)
    
    inline def setIngressTo(value: IngressTo): Self = StObject.set(x, "ingressTo", value.asInstanceOf[js.Any])
    
    inline def setIngressToUndefined: Self = StObject.set(x, "ingressTo", js.undefined)
  }
}
