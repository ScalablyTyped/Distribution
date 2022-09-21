package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaPublishLabelRequest extends StObject {
  
  /**
    * The BCP-47 language code to use for evaluating localized field labels. When not specified, values in the default configured language will be used.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    */
  var useAdminAccess: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Provides control over how write requests are executed. Defaults to unset, which means last write wins.
    */
  var writeControl: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaWriteControl] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaPublishLabelRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaPublishLabelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaPublishLabelRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaPublishLabelRequest](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessNull: Self = StObject.set(x, "useAdminAccess", null)
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
    
    inline def setWriteControl(value: SchemaGoogleAppsDriveLabelsV2betaWriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
