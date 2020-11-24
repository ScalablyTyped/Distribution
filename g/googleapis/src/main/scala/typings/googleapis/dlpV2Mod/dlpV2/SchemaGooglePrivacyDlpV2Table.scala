package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structured content to inspect. Up to 50,000 `Value`s per request allowed.
  * See https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
  * learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Table extends js.Object {
  
  var headers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  
  var rows: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Row]] = js.native
}
object SchemaGooglePrivacyDlpV2Table {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Table]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TableOps[Self <: SchemaGooglePrivacyDlpV2Table] (val x: Self) extends AnyVal {
    
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
    def setHeadersVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaGooglePrivacyDlpV2Row*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[SchemaGooglePrivacyDlpV2Row]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
