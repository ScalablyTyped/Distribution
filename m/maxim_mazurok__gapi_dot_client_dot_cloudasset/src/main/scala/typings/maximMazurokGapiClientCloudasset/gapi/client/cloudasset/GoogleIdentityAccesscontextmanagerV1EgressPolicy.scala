package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1EgressPolicy extends StObject {
  
  /** Defines conditions on the source of a request causing this EgressPolicy to apply. */
  var egressFrom: js.UndefOr[GoogleIdentityAccesscontextmanagerV1EgressFrom] = js.undefined
  
  /** Defines the conditions on the ApiOperation and destination resources that cause this EgressPolicy to apply. */
  var egressTo: js.UndefOr[GoogleIdentityAccesscontextmanagerV1EgressTo] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1EgressPolicy {
  
  inline def apply(): GoogleIdentityAccesscontextmanagerV1EgressPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1EgressPolicy]
  }
  
  extension [Self <: GoogleIdentityAccesscontextmanagerV1EgressPolicy](x: Self) {
    
    inline def setEgressFrom(value: GoogleIdentityAccesscontextmanagerV1EgressFrom): Self = StObject.set(x, "egressFrom", value.asInstanceOf[js.Any])
    
    inline def setEgressFromUndefined: Self = StObject.set(x, "egressFrom", js.undefined)
    
    inline def setEgressTo(value: GoogleIdentityAccesscontextmanagerV1EgressTo): Self = StObject.set(x, "egressTo", value.asInstanceOf[js.Any])
    
    inline def setEgressToUndefined: Self = StObject.set(x, "egressTo", js.undefined)
  }
}
