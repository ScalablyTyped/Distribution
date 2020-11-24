package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container structure for the content to inspect.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ContentItem extends js.Object {
  
  /**
    * Content data to inspect or redact. Replaces `type` and `data`.
    */
  var byteItem: js.UndefOr[SchemaGooglePrivacyDlpV2ByteContentItem] = js.native
  
  /**
    * Structured content for inspection. See
    * https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
    * learn more.
    */
  var table: js.UndefOr[SchemaGooglePrivacyDlpV2Table] = js.native
  
  /**
    * String data to inspect or redact.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2ContentItem {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ContentItem]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ContentItemOps[Self <: SchemaGooglePrivacyDlpV2ContentItem] (val x: Self) extends AnyVal {
    
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
    def setByteItem(value: SchemaGooglePrivacyDlpV2ByteContentItem): Self = this.set("byteItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteItem: Self = this.set("byteItem", js.undefined)
    
    @scala.inline
    def setTable(value: SchemaGooglePrivacyDlpV2Table): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
