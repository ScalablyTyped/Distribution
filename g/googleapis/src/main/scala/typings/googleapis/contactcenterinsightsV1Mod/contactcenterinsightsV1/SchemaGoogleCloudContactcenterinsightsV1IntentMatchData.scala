package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1IntentMatchData extends StObject {
  
  /**
    * The id of the matched intent. Can be used to retrieve the corresponding intent information.
    */
  var intentUniqueId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1IntentMatchData {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1IntentMatchData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1IntentMatchData]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1IntentMatchData](x: Self) {
    
    inline def setIntentUniqueId(value: String): Self = StObject.set(x, "intentUniqueId", value.asInstanceOf[js.Any])
    
    inline def setIntentUniqueIdNull: Self = StObject.set(x, "intentUniqueId", null)
    
    inline def setIntentUniqueIdUndefined: Self = StObject.set(x, "intentUniqueId", js.undefined)
  }
}
