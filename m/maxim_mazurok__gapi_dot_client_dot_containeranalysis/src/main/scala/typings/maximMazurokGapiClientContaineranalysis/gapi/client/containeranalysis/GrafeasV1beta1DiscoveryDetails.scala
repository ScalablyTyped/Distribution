package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1beta1DiscoveryDetails extends StObject {
  
  /** Required. Analysis status for the discovered resource. */
  var discovered: js.UndefOr[Discovered] = js.undefined
}
object GrafeasV1beta1DiscoveryDetails {
  
  @scala.inline
  def apply(): GrafeasV1beta1DiscoveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1DiscoveryDetails]
  }
  
  @scala.inline
  implicit class GrafeasV1beta1DiscoveryDetailsMutableBuilder[Self <: GrafeasV1beta1DiscoveryDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscovered(value: Discovered): Self = StObject.set(x, "discovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveredUndefined: Self = StObject.set(x, "discovered", js.undefined)
  }
}
