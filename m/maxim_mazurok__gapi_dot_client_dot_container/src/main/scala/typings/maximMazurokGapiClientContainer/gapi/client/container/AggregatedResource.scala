package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedResource extends StObject {
  
  var usableSubnetworks: UsableSubnetworksResource
}
object AggregatedResource {
  
  inline def apply(usableSubnetworks: UsableSubnetworksResource): AggregatedResource = {
    val __obj = js.Dynamic.literal(usableSubnetworks = usableSubnetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResource]
  }
  
  extension [Self <: AggregatedResource](x: Self) {
    
    inline def setUsableSubnetworks(value: UsableSubnetworksResource): Self = StObject.set(x, "usableSubnetworks", value.asInstanceOf[js.Any])
  }
}
