package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structured content to inspect. Up to 50,000 `Value`s per request allowed.
  * See https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
  * learn more.
  */
trait SchemaGooglePrivacyDlpV2Table extends StObject {
  
  var headers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.undefined
  
  var rows: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Row]] = js.undefined
}
object SchemaGooglePrivacyDlpV2Table {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Table]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Table](x: Self) {
    
    inline def setHeaders(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setRows(value: js.Array[SchemaGooglePrivacyDlpV2Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaGooglePrivacyDlpV2Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
