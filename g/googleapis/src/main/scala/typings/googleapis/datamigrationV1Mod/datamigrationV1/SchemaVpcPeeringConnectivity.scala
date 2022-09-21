package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpcPeeringConnectivity extends StObject {
  
  /**
    * The name of the VPC network to peer with the Cloud SQL private network.
    */
  var vpc: js.UndefOr[String | Null] = js.undefined
}
object SchemaVpcPeeringConnectivity {
  
  inline def apply(): SchemaVpcPeeringConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpcPeeringConnectivity]
  }
  
  extension [Self <: SchemaVpcPeeringConnectivity](x: Self) {
    
    inline def setVpc(value: String): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcNull: Self = StObject.set(x, "vpc", null)
    
    inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
  }
}
