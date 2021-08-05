package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Row key for identifying a record in BigQuery table.
  */
trait SchemaGooglePrivacyDlpV2BigQueryKey extends StObject {
  
  /**
    * Absolute number of the row from the beginning of the table at the time of
    * scanning.
    */
  var rowNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object SchemaGooglePrivacyDlpV2BigQueryKey {
  
  inline def apply(): SchemaGooglePrivacyDlpV2BigQueryKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryKey]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2BigQueryKey](x: Self) {
    
    inline def setRowNumber(value: String): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
    
    inline def setRowNumberUndefined: Self = StObject.set(x, "rowNumber", js.undefined)
    
    inline def setTableReference(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    inline def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
  }
}
