package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EgressPolicy extends StObject {
  
  /** Defines conditions on the source of a request causing this EgressPolicy to apply. */
  var egressFrom: js.UndefOr[EgressFrom] = js.undefined
  
  /** Defines the conditions on the ApiOperation and destination resources that cause this EgressPolicy to apply. */
  var egressTo: js.UndefOr[EgressTo] = js.undefined
}
object EgressPolicy {
  
  inline def apply(): EgressPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EgressPolicy] (val x: Self) extends AnyVal {
    
    inline def setEgressFrom(value: EgressFrom): Self = StObject.set(x, "egressFrom", value.asInstanceOf[js.Any])
    
    inline def setEgressFromUndefined: Self = StObject.set(x, "egressFrom", js.undefined)
    
    inline def setEgressTo(value: EgressTo): Self = StObject.set(x, "egressTo", value.asInstanceOf[js.Any])
    
    inline def setEgressToUndefined: Self = StObject.set(x, "egressTo", js.undefined)
  }
}
