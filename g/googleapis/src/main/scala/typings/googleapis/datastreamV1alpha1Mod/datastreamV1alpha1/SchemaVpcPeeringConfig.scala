package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpcPeeringConfig extends StObject {
  
  /**
    * Required. A free subnet for peering. (CIDR of /29)
    */
  var subnet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. fully qualified name of the VPC Datastream will peer to.
    */
  var vpcName: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setVpcName(value: String): Self = StObject.set(x, "vpcName", value.asInstanceOf[js.Any])
    
    inline def setVpcNameNull: Self = StObject.set(x, "vpcName", null)
    
    inline def setVpcNameUndefined: Self = StObject.set(x, "vpcName", js.undefined)
  }
}
