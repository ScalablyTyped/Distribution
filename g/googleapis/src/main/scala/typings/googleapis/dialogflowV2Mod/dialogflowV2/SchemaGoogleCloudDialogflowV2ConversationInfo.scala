package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ConversationInfo extends StObject {
  
  /**
    * Optional. The language code of the conversation data within this dataset. See https://cloud.google.com/apis/design/standard_fields for more information. Supports all UTF-8 languages.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ConversationInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ConversationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ConversationInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ConversationInfo](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
