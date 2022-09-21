package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaTransformedUserEventsMetadata extends StObject {
  
  /**
    * Count of entries in the source user events BigQuery table.
    */
  var sourceEventsCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of entries in the transformed user events BigQuery table, which could be different from the actually imported number of user events.
    */
  var transformedEventsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaTransformedUserEventsMetadata {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaTransformedUserEventsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaTransformedUserEventsMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaTransformedUserEventsMetadata](x: Self) {
    
    inline def setSourceEventsCount(value: String): Self = StObject.set(x, "sourceEventsCount", value.asInstanceOf[js.Any])
    
    inline def setSourceEventsCountNull: Self = StObject.set(x, "sourceEventsCount", null)
    
    inline def setSourceEventsCountUndefined: Self = StObject.set(x, "sourceEventsCount", js.undefined)
    
    inline def setTransformedEventsCount(value: String): Self = StObject.set(x, "transformedEventsCount", value.asInstanceOf[js.Any])
    
    inline def setTransformedEventsCountNull: Self = StObject.set(x, "transformedEventsCount", null)
    
    inline def setTransformedEventsCountUndefined: Self = StObject.set(x, "transformedEventsCount", js.undefined)
  }
}
