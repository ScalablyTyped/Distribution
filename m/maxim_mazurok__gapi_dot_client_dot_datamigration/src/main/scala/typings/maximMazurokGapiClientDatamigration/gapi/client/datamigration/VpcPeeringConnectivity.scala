package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcPeeringConnectivity extends StObject {
  
  /** The name of the VPC network to peer with the Cloud SQL private network. */
  var vpc: js.UndefOr[String] = js.native
}
object VpcPeeringConnectivity {
  
  @scala.inline
  def apply(): VpcPeeringConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectivity]
  }
  
  @scala.inline
  implicit class VpcPeeringConnectivityMutableBuilder[Self <: VpcPeeringConnectivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpc(value: String): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
  }
}
