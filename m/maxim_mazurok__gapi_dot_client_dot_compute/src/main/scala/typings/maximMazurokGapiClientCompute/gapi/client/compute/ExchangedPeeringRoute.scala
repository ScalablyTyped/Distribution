package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangedPeeringRoute extends StObject {
  
  /** The destination range of the route. */
  var destRange: js.UndefOr[String] = js.undefined
  
  /**
    * True if the peering route has been imported from a peer. The actual import happens if the field networkPeering.importCustomRoutes is true for this network, and
    * networkPeering.exportCustomRoutes is true for the peer network, and the import does not result in a route conflict.
    */
  var imported: js.UndefOr[Boolean] = js.undefined
  
  /** The region of peering route next hop, only applies to dynamic routes. */
  var nextHopRegion: js.UndefOr[String] = js.undefined
  
  /** The priority of the peering route. */
  var priority: js.UndefOr[Double] = js.undefined
  
  /** The type of the peering route. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ExchangedPeeringRoute {
  
  inline def apply(): ExchangedPeeringRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangedPeeringRoute]
  }
  
  extension [Self <: ExchangedPeeringRoute](x: Self) {
    
    inline def setDestRange(value: String): Self = StObject.set(x, "destRange", value.asInstanceOf[js.Any])
    
    inline def setDestRangeUndefined: Self = StObject.set(x, "destRange", js.undefined)
    
    inline def setImported(value: Boolean): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setImportedUndefined: Self = StObject.set(x, "imported", js.undefined)
    
    inline def setNextHopRegion(value: String): Self = StObject.set(x, "nextHopRegion", value.asInstanceOf[js.Any])
    
    inline def setNextHopRegionUndefined: Self = StObject.set(x, "nextHopRegion", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
