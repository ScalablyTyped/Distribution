package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1DiscoveryEventEntityDetails extends StObject {
  
  /**
    * The name of the entity resource. The name is the fully-qualified resource name.
    */
  var entity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the entity resource.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1DiscoveryEventEntityDetails {
  
  inline def apply(): SchemaGoogleCloudDataplexV1DiscoveryEventEntityDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1DiscoveryEventEntityDetails]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1DiscoveryEventEntityDetails](x: Self) {
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityNull: Self = StObject.set(x, "entity", null)
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
