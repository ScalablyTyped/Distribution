package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.Names
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldSchema extends StObject {
  
  /** [Optional] The categories attached to this field, used for field-level access control. */
  var categories: js.UndefOr[Names] = js.undefined
  
  /** [Optional] The field description. The maximum length is 1,024 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Optional] Describes the nested schema fields if the type property is set to RECORD. */
  var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.undefined
  
  /** [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE. */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 128
    * characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var policyTags: js.UndefOr[Names] = js.undefined
  
  /**
    * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP,
    * DATE, TIME, DATETIME, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object TableFieldSchema {
  
  inline def apply(): TableFieldSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldSchema]
  }
  
  extension [Self <: TableFieldSchema](x: Self) {
    
    inline def setCategories(value: Names): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFields(value: js.Array[TableFieldSchema]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: TableFieldSchema*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicyTags(value: Names): Self = StObject.set(x, "policyTags", value.asInstanceOf[js.Any])
    
    inline def setPolicyTagsUndefined: Self = StObject.set(x, "policyTags", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
