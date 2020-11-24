package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListInspectTemplates.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse extends js.Object {
  
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
  implicit class SchemaGooglePrivacyDlpV2ListInspectTemplatesResponseOps[Self <: SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInspectTemplatesVarargs(value: SchemaGooglePrivacyDlpV2InspectTemplate*): Self = this.set("inspectTemplates", js.Array(value :_*))
    
    @scala.inline
    def setInspectTemplates(value: js.Array[SchemaGooglePrivacyDlpV2InspectTemplate]): Self = this.set("inspectTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInspectTemplates: Self = this.set("inspectTemplates", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
