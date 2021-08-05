package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcPeeringConnectivity extends StObject {
  
  /** The name of the VPC network to peer with the Cloud SQL private network. */
  var vpc: js.UndefOr[String] = js.undefined
}
object VpcPeeringConnectivity {
  
  inline def apply(): VpcPeeringConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectivity]
  }
  
  extension [Self <: VpcPeeringConnectivity](x: Self) {
    
    inline def setVpc(value: String): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
  }
}
