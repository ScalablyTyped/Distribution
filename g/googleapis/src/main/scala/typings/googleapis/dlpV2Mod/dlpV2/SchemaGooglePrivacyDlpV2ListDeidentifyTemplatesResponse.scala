package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListDeidentifyTemplates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse extends StObject {
  
  /**
    * List of deidentify templates, up to page_size in
    * ListDeidentifyTemplatesRequest.
    */
  var deidentifyTemplates: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DeidentifyTemplate]] = js.native
  
  /**
    * If the next page is available then the next page token to be used in
    * following ListDeidentifyTemplates request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeidentifyTemplates(value: js.Array[SchemaGooglePrivacyDlpV2DeidentifyTemplate]): Self = StObject.set(x, "deidentifyTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyTemplatesUndefined: Self = StObject.set(x, "deidentifyTemplates", js.undefined)
    
    @scala.inline
    def setDeidentifyTemplatesVarargs(value: SchemaGooglePrivacyDlpV2DeidentifyTemplate*): Self = StObject.set(x, "deidentifyTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
