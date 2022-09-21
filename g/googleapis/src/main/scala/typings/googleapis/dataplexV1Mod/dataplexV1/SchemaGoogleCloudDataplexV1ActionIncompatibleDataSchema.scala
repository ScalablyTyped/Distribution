package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ActionIncompatibleDataSchema extends StObject {
  
  /**
    * The existing and expected schema of the table. The schema is provided as a JSON formatted structure listing columns and data types.
    */
  var existingSchema: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The new and incompatible schema within the table. The schema is provided as a JSON formatted structured listing columns and data types.
    */
  var newSchema: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of data locations sampled and used for format/schema inference.
    */
  var sampledDataLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether the action relates to a schema that is incompatible or modified.
    */
  var schemaChange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the table containing invalid data.
    */
  var table: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ActionIncompatibleDataSchema {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ActionIncompatibleDataSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ActionIncompatibleDataSchema]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ActionIncompatibleDataSchema](x: Self) {
    
    inline def setExistingSchema(value: String): Self = StObject.set(x, "existingSchema", value.asInstanceOf[js.Any])
    
    inline def setExistingSchemaNull: Self = StObject.set(x, "existingSchema", null)
    
    inline def setExistingSchemaUndefined: Self = StObject.set(x, "existingSchema", js.undefined)
    
    inline def setNewSchema(value: String): Self = StObject.set(x, "newSchema", value.asInstanceOf[js.Any])
    
    inline def setNewSchemaNull: Self = StObject.set(x, "newSchema", null)
    
    inline def setNewSchemaUndefined: Self = StObject.set(x, "newSchema", js.undefined)
    
    inline def setSampledDataLocations(value: js.Array[String]): Self = StObject.set(x, "sampledDataLocations", value.asInstanceOf[js.Any])
    
    inline def setSampledDataLocationsNull: Self = StObject.set(x, "sampledDataLocations", null)
    
    inline def setSampledDataLocationsUndefined: Self = StObject.set(x, "sampledDataLocations", js.undefined)
    
    inline def setSampledDataLocationsVarargs(value: String*): Self = StObject.set(x, "sampledDataLocations", js.Array(value*))
    
    inline def setSchemaChange(value: String): Self = StObject.set(x, "schemaChange", value.asInstanceOf[js.Any])
    
    inline def setSchemaChangeNull: Self = StObject.set(x, "schemaChange", null)
    
    inline def setSchemaChangeUndefined: Self = StObject.set(x, "schemaChange", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
