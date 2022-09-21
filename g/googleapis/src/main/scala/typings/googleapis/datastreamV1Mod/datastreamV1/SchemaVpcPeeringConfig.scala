package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpcPeeringConfig extends StObject {
  
  /**
    * Required. A free subnet for peering. (CIDR of /29)
    */
  var subnet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Fully qualified name of the VPC that Datastream will peer to. Format: `projects/{project\}/global/{networks\}/{name\}`
    */
  var vpc: js.UndefOr[String | Null] = js.undefined
}
object SchemaVpcPeeringConfig {
  
  inline def apply(): SchemaVpcPeeringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpcPeeringConfig]
  }
  
  extension [Self <: SchemaVpcPeeringConfig](x: Self) {
    
    inline def setSubnet(value: String): Self = StObject.set(x, "subnet", value.asInstanceOf[js.Any])
    
    inline def setSubnetNull: Self = StObject.set(x, "subnet", null)
    
    inline def setSubnetUndefined: Self = StObject.set(x, "subnet", js.undefined)
    
    inline def setVpc(value: String): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcNull: Self = StObject.set(x, "vpc", null)
    
    inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
  }
}
