package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaUserEventImportSummary extends StObject {
  
  /**
    * Count of user events imported with complete existing catalog information.
    */
  var joinedEventsCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of user events imported, but with catalog information not found in the imported catalog.
    */
  var unjoinedEventsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaUserEventImportSummary {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaUserEventImportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaUserEventImportSummary]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaUserEventImportSummary](x: Self) {
    
    inline def setJoinedEventsCount(value: String): Self = StObject.set(x, "joinedEventsCount", value.asInstanceOf[js.Any])
    
    inline def setJoinedEventsCountNull: Self = StObject.set(x, "joinedEventsCount", null)
    
    inline def setJoinedEventsCountUndefined: Self = StObject.set(x, "joinedEventsCount", js.undefined)
    
    inline def setUnjoinedEventsCount(value: String): Self = StObject.set(x, "unjoinedEventsCount", value.asInstanceOf[js.Any])
    
    inline def setUnjoinedEventsCountNull: Self = StObject.set(x, "unjoinedEventsCount", null)
    
    inline def setUnjoinedEventsCountUndefined: Self = StObject.set(x, "unjoinedEventsCount", js.undefined)
  }
}
