package typings.luminoDatagrid

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typings.luminoDatagrid.datamodelMod.DataModel
import typings.luminoDatagrid.jsonmodelMod.JSONModel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonmodelMod {
  
  @JSImport("@lumino/datagrid/types/jsonmodel", "JSONModel")
  @js.native
  open class JSONModel protected () extends DataModel {
    /**
      * Create a data model with static JSON data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _bodyFields: Any = js.native
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _headerFields: Any = js.native
    
    /* private */ var _missingValues: Any = js.native
  }
  object JSONModel {
    
    /**
      * A type alias for a data source for a JSON data model.
      *
      * A data source is an array of JSON object records which represent
      * the rows of the table. The keys of the records correspond to the
      * field names of the columns.
      */
    type DataSource = js.Array[ReadonlyJSONObject]
    
    /**
      * An object which describes a column of data in the model.
      *
      * #### Notes
      * This is based on the JSON Table Schema specification:
      * https://specs.frictionlessdata.io/table-schema/
      */
    trait Field extends StObject {
      
      /**
        * The format of the data in the column.
        */
      val format: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the column.
        *
        * This is used as the key to extract a value from a data record.
        * It is also used as the column header label, unless the `title`
        * property is provided.
        */
      val name: String
      
      /**
        * The human readable name for the column.
        *
        * This is used as the label for the column header.
        */
      val title: js.UndefOr[String] = js.undefined
      
      /**
        * The type of data held in the column.
        */
      val `type`: js.UndefOr[String] = js.undefined
    }
    object Field {
      
      inline def apply(name: String): Field = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Field]
      }
      
      extension [Self <: Field](x: Self) {
        
        inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * An options object for initializing a JSON data model.
      */
    trait IOptions extends StObject {
      
      /**
        * The data source for the data model.
        *
        * The data model takes full ownership of the data source.
        */
      var data: DataSource
      
      /**
        * The schema for the for the data model.
        *
        * The schema should be treated as an immutable object.
        */
      var schema: Schema
    }
    object IOptions {
      
      inline def apply(data: DataSource, schema: Schema): IOptions = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setData(value: DataSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataVarargs(value: ReadonlyJSONObject*): Self = StObject.set(x, "data", js.Array(value*))
        
        inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An object when specifies the schema for a data model.
      *
      * #### Notes
      * This is based on the JSON Table Schema specification:
      * https://specs.frictionlessdata.io/table-schema/
      */
    trait Schema extends StObject {
      
      /**
        * The fields which describe the data model columns.
        *
        * Primary key fields are rendered as row header columns.
        */
      val fields: js.Array[Field]
      
      /**
        * The values to treat as "missing" data.
        *
        * Missing values are automatically converted to `null`.
        */
      val missingValues: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The field names which act as primary keys.
        *
        * Primary key fields are rendered as row header columns.
        */
      val primaryKey: js.UndefOr[String | js.Array[String]] = js.undefined
    }
    object Schema {
      
      inline def apply(fields: js.Array[Field]): Schema = {
        val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
        __obj.asInstanceOf[Schema]
      }
      
      extension [Self <: Schema](x: Self) {
        
        inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
        
        inline def setMissingValues(value: js.Array[String]): Self = StObject.set(x, "missingValues", value.asInstanceOf[js.Any])
        
        inline def setMissingValuesUndefined: Self = StObject.set(x, "missingValues", js.undefined)
        
        inline def setMissingValuesVarargs(value: String*): Self = StObject.set(x, "missingValues", js.Array(value*))
        
        inline def setPrimaryKey(value: String | js.Array[String]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
        
        inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
        
        inline def setPrimaryKeyVarargs(value: String*): Self = StObject.set(x, "primaryKey", js.Array(value*))
      }
    }
  }
}
