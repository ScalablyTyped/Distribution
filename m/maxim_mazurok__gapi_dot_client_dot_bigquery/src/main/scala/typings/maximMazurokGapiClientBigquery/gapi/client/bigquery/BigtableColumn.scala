package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigtableColumn extends StObject {
  
  /**
    * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values
    * are encoded using HBase Bytes.toBytes family of functions. 'encoding' can also be set at the column family level. However, the setting at this level takes precedence if 'encoding'
    * is set at both levels.
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * [Optional] If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is
    * used as field name in queries.
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /**
    * [Optional] If this is set, only the latest version of value in this column are exposed. 'onlyReadLatest' can also be set at the column family level. However, the setting at this
    * level takes precedence if 'onlyReadLatest' is set at both levels.
    */
  var onlyReadLatest: js.UndefOr[Boolean] = js.native
  
  /**
    * [Required] Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be
    * specified in the qualifier_string field. Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field name is the same as the column qualifier. However, if
    * the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as field_name.
    */
  var qualifierEncoded: js.UndefOr[String] = js.native
  
  var qualifierString: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value.
    * Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can also be set at the column family level. However, the
    * setting at this level takes precedence if 'type' is set at both levels.
    */
  var `type`: js.UndefOr[String] = js.native
}
object BigtableColumn {
  
  @scala.inline
  def apply(): BigtableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumn]
  }
  
  @scala.inline
  implicit class BigtableColumnMutableBuilder[Self <: BigtableColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setOnlyReadLatest(value: Boolean): Self = StObject.set(x, "onlyReadLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyReadLatestUndefined: Self = StObject.set(x, "onlyReadLatest", js.undefined)
    
    @scala.inline
    def setQualifierEncoded(value: String): Self = StObject.set(x, "qualifierEncoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierEncodedUndefined: Self = StObject.set(x, "qualifierEncoded", js.undefined)
    
    @scala.inline
    def setQualifierString(value: String): Self = StObject.set(x, "qualifierString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierStringUndefined: Self = StObject.set(x, "qualifierString", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
