package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TableLocation extends StObject {
  
  /**
    * The zero-based index of the row where the finding is located. Only populated for resources that have a natural ordering, not BigQuery. In BigQuery, to identify the row a finding came from, populate BigQueryOptions.identifying_fields with your primary key column names and when you store the findings the value of those columns will be stored inside of Finding.
    */
  var rowIndex: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2TableLocation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TableLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TableLocation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TableLocation](x: Self) {
    
    inline def setRowIndex(value: String): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexNull: Self = StObject.set(x, "rowIndex", null)
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
