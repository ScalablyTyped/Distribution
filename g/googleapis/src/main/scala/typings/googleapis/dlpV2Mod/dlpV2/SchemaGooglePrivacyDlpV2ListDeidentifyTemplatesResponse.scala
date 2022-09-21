package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse extends StObject {
  
  /**
    * List of deidentify templates, up to page_size in ListDeidentifyTemplatesRequest.
    */
  var deidentifyTemplates: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DeidentifyTemplate]] = js.undefined
  
  /**
    * If the next page is available then the next page token to be used in following ListDeidentifyTemplates request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse](x: Self) {
    
    inline def setDeidentifyTemplates(value: js.Array[SchemaGooglePrivacyDlpV2DeidentifyTemplate]): Self = StObject.set(x, "deidentifyTemplates", value.asInstanceOf[js.Any])
    
    inline def setDeidentifyTemplatesUndefined: Self = StObject.set(x, "deidentifyTemplates", js.undefined)
    
    inline def setDeidentifyTemplatesVarargs(value: SchemaGooglePrivacyDlpV2DeidentifyTemplate*): Self = StObject.set(x, "deidentifyTemplates", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
