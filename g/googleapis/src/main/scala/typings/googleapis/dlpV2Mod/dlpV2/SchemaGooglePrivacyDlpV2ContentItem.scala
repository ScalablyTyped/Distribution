package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container structure for the content to inspect.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ContentItem extends StObject {
  
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
  implicit class SchemaGooglePrivacyDlpV2ContentItemMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ContentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteItem(value: SchemaGooglePrivacyDlpV2ByteContentItem): Self = StObject.set(x, "byteItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteItemUndefined: Self = StObject.set(x, "byteItem", js.undefined)
    
    @scala.inline
    def setTable(value: SchemaGooglePrivacyDlpV2Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
