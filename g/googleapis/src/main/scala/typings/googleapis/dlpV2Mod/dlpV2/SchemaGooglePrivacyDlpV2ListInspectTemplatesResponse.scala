package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse extends StObject {
  
  /**
    * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
    */
  var inspectTemplates: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InspectTemplate]] = js.undefined
  
  /**
    * If the next page is available then the next page token to be used in following ListInspectTemplates request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse](x: Self) {
    
    inline def setInspectTemplates(value: js.Array[SchemaGooglePrivacyDlpV2InspectTemplate]): Self = StObject.set(x, "inspectTemplates", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplatesUndefined: Self = StObject.set(x, "inspectTemplates", js.undefined)
    
    inline def setInspectTemplatesVarargs(value: SchemaGooglePrivacyDlpV2InspectTemplate*): Self = StObject.set(x, "inspectTemplates", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
