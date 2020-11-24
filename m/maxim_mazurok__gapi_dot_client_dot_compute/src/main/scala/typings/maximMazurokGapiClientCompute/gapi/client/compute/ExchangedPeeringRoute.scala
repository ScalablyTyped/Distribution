package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangedPeeringRoute extends js.Object {
  
  /** The destination range of the route. */
  var destRange: js.UndefOr[String] = js.native
  
  /**
    * True if the peering route has been imported from a peer. The actual import happens if the field networkPeering.importCustomRoutes is true for this network, and
    * networkPeering.exportCustomRoutes is true for the peer network, and the import does not result in a route conflict.
    */
  var imported: js.UndefOr[Boolean] = js.native
  
  /** The region of peering route next hop, only applies to dynamic routes. */
  var nextHopRegion: js.UndefOr[String] = js.native
  
  /** The priority of the peering route. */
  var priority: js.UndefOr[Double] = js.native
  
  /** The type of the peering route. */
  var `type`: js.UndefOr[String] = js.native
}
object ExchangedPeeringRoute {
  
  @scala.inline
  def apply(): ExchangedPeeringRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangedPeeringRoute]
  }
  
  @scala.inline
  implicit class ExchangedPeeringRouteOps[Self <: ExchangedPeeringRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestRange(value: String): Self = this.set("destRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestRange: Self = this.set("destRange", js.undefined)
    
    @scala.inline
    def setImported(value: Boolean): Self = this.set("imported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImported: Self = this.set("imported", js.undefined)
    
    @scala.inline
    def setNextHopRegion(value: String): Self = this.set("nextHopRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextHopRegion: Self = this.set("nextHopRegion", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
