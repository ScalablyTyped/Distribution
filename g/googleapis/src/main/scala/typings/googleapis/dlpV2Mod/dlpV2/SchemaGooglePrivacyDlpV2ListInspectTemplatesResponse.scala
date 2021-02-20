package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListInspectTemplates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse extends StObject {
  
  /**
    * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
    */
  var inspectTemplates: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InspectTemplate]] = js.native
  
  /**
    * If the next page is available then the next page token to be used in
    * following ListInspectTemplates request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListInspectTemplatesResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInspectTemplates(value: js.Array[SchemaGooglePrivacyDlpV2InspectTemplate]): Self = StObject.set(x, "inspectTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplatesUndefined: Self = StObject.set(x, "inspectTemplates", js.undefined)
    
    @scala.inline
    def setInspectTemplatesVarargs(value: SchemaGooglePrivacyDlpV2InspectTemplate*): Self = StObject.set(x, "inspectTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
