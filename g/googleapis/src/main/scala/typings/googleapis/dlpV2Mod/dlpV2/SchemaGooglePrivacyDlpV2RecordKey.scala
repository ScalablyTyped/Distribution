package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for a unique key indicating a record that contains a finding.
  */
trait SchemaGooglePrivacyDlpV2RecordKey extends StObject {
  
  var bigQueryKey: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryKey] = js.undefined
  
  var datastoreKey: js.UndefOr[SchemaGooglePrivacyDlpV2DatastoreKey] = js.undefined
  
  /**
    * Values of identifying columns in the given row. Order of values matches
    * the order of field identifiers specified in the scanning request.
    */
  var idValues: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaGooglePrivacyDlpV2RecordKey {
  
  inline def apply(): SchemaGooglePrivacyDlpV2RecordKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordKey]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2RecordKey](x: Self) {
    
    inline def setBigQueryKey(value: SchemaGooglePrivacyDlpV2BigQueryKey): Self = StObject.set(x, "bigQueryKey", value.asInstanceOf[js.Any])
    
    inline def setBigQueryKeyUndefined: Self = StObject.set(x, "bigQueryKey", js.undefined)
    
    inline def setDatastoreKey(value: SchemaGooglePrivacyDlpV2DatastoreKey): Self = StObject.set(x, "datastoreKey", value.asInstanceOf[js.Any])
    
    inline def setDatastoreKeyUndefined: Self = StObject.set(x, "datastoreKey", js.undefined)
    
    inline def setIdValues(value: js.Array[String]): Self = StObject.set(x, "idValues", value.asInstanceOf[js.Any])
    
    inline def setIdValuesUndefined: Self = StObject.set(x, "idValues", js.undefined)
    
    inline def setIdValuesVarargs(value: String*): Self = StObject.set(x, "idValues", js.Array(value :_*))
  }
}
