package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpcConnectorInfo extends StObject {
  
  /**
    * Name of a VPC connector.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location in which the VPC connector is deployed.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a VPC connector.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaVpcConnectorInfo {
  
  inline def apply(): SchemaVpcConnectorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpcConnectorInfo]
  }
  
  extension [Self <: SchemaVpcConnectorInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
