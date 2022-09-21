package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ContentItem extends StObject {
  
  /**
    * Content data to inspect or redact. Replaces `type` and `data`.
    */
  var byteItem: js.UndefOr[SchemaGooglePrivacyDlpV2ByteContentItem] = js.undefined
  
  /**
    * Structured content for inspection. See https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to learn more.
    */
  var table: js.UndefOr[SchemaGooglePrivacyDlpV2Table] = js.undefined
  
  /**
    * String data to inspect or redact.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2ContentItem {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ContentItem]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ContentItem](x: Self) {
    
    inline def setByteItem(value: SchemaGooglePrivacyDlpV2ByteContentItem): Self = StObject.set(x, "byteItem", value.asInstanceOf[js.Any])
    
    inline def setByteItemUndefined: Self = StObject.set(x, "byteItem", js.undefined)
    
    inline def setTable(value: SchemaGooglePrivacyDlpV2Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
