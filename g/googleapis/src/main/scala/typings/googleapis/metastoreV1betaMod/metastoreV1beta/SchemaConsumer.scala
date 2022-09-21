package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsumer extends StObject {
  
  /**
    * Output only. The URI of the endpoint used to access the metastore service.
    */
  var endpointUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service's endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet's primary range. The subnet is specified in the following form:`projects/{project_number\}/regions/{region_id\}/subnetworks/{subnetwork_id\}
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
}
object SchemaConsumer {
  
  inline def apply(): SchemaConsumer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsumer]
  }
  
  extension [Self <: SchemaConsumer](x: Self) {
    
    inline def setEndpointUri(value: String): Self = StObject.set(x, "endpointUri", value.asInstanceOf[js.Any])
    
    inline def setEndpointUriNull: Self = StObject.set(x, "endpointUri", null)
    
    inline def setEndpointUriUndefined: Self = StObject.set(x, "endpointUri", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
