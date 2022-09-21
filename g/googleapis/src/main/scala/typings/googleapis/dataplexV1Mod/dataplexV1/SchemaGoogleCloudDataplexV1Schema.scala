package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Schema extends StObject {
  
  /**
    * Optional. The sequence of fields describing data in table entities. Note: BigQuery SchemaFields are immutable.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1SchemaSchemaField]] = js.undefined
  
  /**
    * Optional. The sequence of fields describing the partition structure in entities. If this field is empty, there are no partitions within the data.
    */
  var partitionFields: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1SchemaPartitionField]] = js.undefined
  
  /**
    * Optional. The structure of paths containing partition data within the entity.
    */
  var partitionStyle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Set to true if user-managed or false if managed by Dataplex. The default is false (managed by Dataplex). Set to falseto enable Dataplex discovery to update the schema. including new data discovery, schema inference, and schema evolution. Users retain the ability to input and edit the schema. Dataplex treats schema input by the user as though produced by a previous Dataplex discovery operation, and it will evolve the schema and take action based on that treatment. Set to true to fully manage the entity schema. This setting guarantees that Dataplex will not change schema fields.
    */
  var userManaged: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Schema {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Schema]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Schema](x: Self) {
    
    inline def setFields(value: js.Array[SchemaGoogleCloudDataplexV1SchemaSchemaField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaGoogleCloudDataplexV1SchemaSchemaField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setPartitionFields(value: js.Array[SchemaGoogleCloudDataplexV1SchemaPartitionField]): Self = StObject.set(x, "partitionFields", value.asInstanceOf[js.Any])
    
    inline def setPartitionFieldsUndefined: Self = StObject.set(x, "partitionFields", js.undefined)
    
    inline def setPartitionFieldsVarargs(value: SchemaGoogleCloudDataplexV1SchemaPartitionField*): Self = StObject.set(x, "partitionFields", js.Array(value*))
    
    inline def setPartitionStyle(value: String): Self = StObject.set(x, "partitionStyle", value.asInstanceOf[js.Any])
    
    inline def setPartitionStyleNull: Self = StObject.set(x, "partitionStyle", null)
    
    inline def setPartitionStyleUndefined: Self = StObject.set(x, "partitionStyle", js.undefined)
    
    inline def setUserManaged(value: Boolean): Self = StObject.set(x, "userManaged", value.asInstanceOf[js.Any])
    
    inline def setUserManagedNull: Self = StObject.set(x, "userManaged", null)
    
    inline def setUserManagedUndefined: Self = StObject.set(x, "userManaged", js.undefined)
  }
}
