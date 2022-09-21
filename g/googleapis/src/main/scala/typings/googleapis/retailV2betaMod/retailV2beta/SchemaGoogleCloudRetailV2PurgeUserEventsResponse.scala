package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2PurgeUserEventsResponse extends StObject {
  
  /**
    * The total count of events purged as a result of the operation.
    */
  var purgedEventsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2PurgeUserEventsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2PurgeUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2PurgeUserEventsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2PurgeUserEventsResponse](x: Self) {
    
    inline def setPurgedEventsCount(value: String): Self = StObject.set(x, "purgedEventsCount", value.asInstanceOf[js.Any])
    
    inline def setPurgedEventsCountNull: Self = StObject.set(x, "purgedEventsCount", null)
    
    inline def setPurgedEventsCountUndefined: Self = StObject.set(x, "purgedEventsCount", js.undefined)
  }
}
