package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1DialogflowIntent extends StObject {
  
  /**
    * The human-readable name of the intent.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1DialogflowIntent {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1DialogflowIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1DialogflowIntent]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1DialogflowIntent](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
