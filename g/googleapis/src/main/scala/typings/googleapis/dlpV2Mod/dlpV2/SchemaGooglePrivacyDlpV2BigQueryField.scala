package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message defining a field of a BigQuery table.
  */
trait SchemaGooglePrivacyDlpV2BigQueryField extends StObject {
  
  /**
    * Designated field in the BigQuery table.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
  
  /**
    * Source table of the field.
    */
  var table: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object SchemaGooglePrivacyDlpV2BigQueryField {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2BigQueryField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryField]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BigQueryFieldMutableBuilder[Self <: SchemaGooglePrivacyDlpV2BigQueryField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
