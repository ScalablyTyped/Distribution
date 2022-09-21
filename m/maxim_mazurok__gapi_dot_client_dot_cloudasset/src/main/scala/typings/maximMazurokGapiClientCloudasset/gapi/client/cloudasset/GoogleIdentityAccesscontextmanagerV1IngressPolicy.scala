package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1IngressPolicy extends StObject {
  
  /** Defines the conditions on the source of a request causing this IngressPolicy to apply. */
  var ingressFrom: js.UndefOr[GoogleIdentityAccesscontextmanagerV1IngressFrom] = js.undefined
  
  /** Defines the conditions on the ApiOperation and request destination that cause this IngressPolicy to apply. */
  var ingressTo: js.UndefOr[GoogleIdentityAccesscontextmanagerV1IngressTo] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1IngressPolicy {
  
  inline def apply(): GoogleIdentityAccesscontextmanagerV1IngressPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1IngressPolicy]
  }
  
  extension [Self <: GoogleIdentityAccesscontextmanagerV1IngressPolicy](x: Self) {
    
    inline def setIngressFrom(value: GoogleIdentityAccesscontextmanagerV1IngressFrom): Self = StObject.set(x, "ingressFrom", value.asInstanceOf[js.Any])
    
    inline def setIngressFromUndefined: Self = StObject.set(x, "ingressFrom", js.undefined)
    
    inline def setIngressTo(value: GoogleIdentityAccesscontextmanagerV1IngressTo): Self = StObject.set(x, "ingressTo", value.asInstanceOf[js.Any])
    
    inline def setIngressToUndefined: Self = StObject.set(x, "ingressTo", js.undefined)
  }
}
