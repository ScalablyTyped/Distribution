package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1DiscoveryEventActionDetails extends StObject {
  
  /**
    * The type of action. Eg. IncompatibleDataSchema, InvalidDataFormat
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1DiscoveryEventActionDetails {
  
  inline def apply(): SchemaGoogleCloudDataplexV1DiscoveryEventActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1DiscoveryEventActionDetails]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1DiscoveryEventActionDetails](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
