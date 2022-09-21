package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteRequestMirrorPolicy extends StObject {
  
  /**
    * The destination the requests will be mirrored to. The weight of the destination will be ignored.
    */
  var destination: js.UndefOr[SchemaHttpRouteDestination] = js.undefined
}
object SchemaHttpRouteRequestMirrorPolicy {
  
  inline def apply(): SchemaHttpRouteRequestMirrorPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRequestMirrorPolicy]
  }
  
  extension [Self <: SchemaHttpRouteRequestMirrorPolicy](x: Self) {
    
    inline def setDestination(value: SchemaHttpRouteDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
