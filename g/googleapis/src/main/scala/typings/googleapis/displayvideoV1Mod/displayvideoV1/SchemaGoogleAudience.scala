package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAudience extends StObject {
  
  /**
    * Output only. The display name of the Google audience. .
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique ID of the Google audience. Assigned by the system.
    */
  var googleAudienceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of Google audience. .
    */
  var googleAudienceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the google audience.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAudience {
  
  inline def apply(): SchemaGoogleAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAudience]
  }
  
  extension [Self <: SchemaGoogleAudience](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGoogleAudienceId(value: String): Self = StObject.set(x, "googleAudienceId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAudienceIdNull: Self = StObject.set(x, "googleAudienceId", null)
    
    inline def setGoogleAudienceIdUndefined: Self = StObject.set(x, "googleAudienceId", js.undefined)
    
    inline def setGoogleAudienceType(value: String): Self = StObject.set(x, "googleAudienceType", value.asInstanceOf[js.Any])
    
    inline def setGoogleAudienceTypeNull: Self = StObject.set(x, "googleAudienceType", null)
    
    inline def setGoogleAudienceTypeUndefined: Self = StObject.set(x, "googleAudienceType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
