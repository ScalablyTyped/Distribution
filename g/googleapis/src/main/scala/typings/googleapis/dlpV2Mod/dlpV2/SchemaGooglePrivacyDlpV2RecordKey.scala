package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for a unique key indicating a record that contains a finding.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordKey extends StObject {
  
  var bigQueryKey: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryKey] = js.native
  
  var datastoreKey: js.UndefOr[SchemaGooglePrivacyDlpV2DatastoreKey] = js.native
  
  /**
    * Values of identifying columns in the given row. Order of values matches
    * the order of field identifiers specified in the scanning request.
    */
  var idValues: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGooglePrivacyDlpV2RecordKey {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordKey]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordKeyMutableBuilder[Self <: SchemaGooglePrivacyDlpV2RecordKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigQueryKey(value: SchemaGooglePrivacyDlpV2BigQueryKey): Self = StObject.set(x, "bigQueryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigQueryKeyUndefined: Self = StObject.set(x, "bigQueryKey", js.undefined)
    
    @scala.inline
    def setDatastoreKey(value: SchemaGooglePrivacyDlpV2DatastoreKey): Self = StObject.set(x, "datastoreKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreKeyUndefined: Self = StObject.set(x, "datastoreKey", js.undefined)
    
    @scala.inline
    def setIdValues(value: js.Array[String]): Self = StObject.set(x, "idValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdValuesUndefined: Self = StObject.set(x, "idValues", js.undefined)
    
    @scala.inline
    def setIdValuesVarargs(value: String*): Self = StObject.set(x, "idValues", js.Array(value :_*))
  }
}
