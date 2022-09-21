package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2VpcAccess extends StObject {
  
  /**
    * VPC Access connector name. Format: projects/{project\}/locations/{location\}/connectors/{connector\}
    */
  var connector: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Traffic VPC egress settings.
    */
  var egress: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2VpcAccess {
  
  inline def apply(): SchemaGoogleCloudRunV2VpcAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2VpcAccess]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2VpcAccess](x: Self) {
    
    inline def setConnector(value: String): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorNull: Self = StObject.set(x, "connector", null)
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setEgress(value: String): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
    
    inline def setEgressNull: Self = StObject.set(x, "egress", null)
    
    inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
  }
}
