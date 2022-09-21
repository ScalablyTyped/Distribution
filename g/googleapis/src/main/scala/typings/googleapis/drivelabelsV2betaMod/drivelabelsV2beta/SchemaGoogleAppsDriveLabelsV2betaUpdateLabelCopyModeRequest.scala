package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaUpdateLabelCopyModeRequest extends StObject {
  
  /**
    * Required. Indicates how the applied Label, and Field values should be copied when a Drive item is copied.
    */
  var copyMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The BCP-47 language code to use for evaluating localized field labels. When not specified, values in the default configured language will be used.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    */
  var useAdminAccess: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * When specified, only certain fields belonging to the indicated view will be returned.
    */
  var view: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaUpdateLabelCopyModeRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaUpdateLabelCopyModeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaUpdateLabelCopyModeRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaUpdateLabelCopyModeRequest](x: Self) {
    
    inline def setCopyMode(value: String): Self = StObject.set(x, "copyMode", value.asInstanceOf[js.Any])
    
    inline def setCopyModeNull: Self = StObject.set(x, "copyMode", null)
    
    inline def setCopyModeUndefined: Self = StObject.set(x, "copyMode", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessNull: Self = StObject.set(x, "useAdminAccess", null)
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
