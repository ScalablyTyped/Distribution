package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSchemaSchema
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * This is the property (xpath) in the data source where the child records of a record are located. Used in XML binding.
    */
  var childDataProperty: js.UndefOr[String] = js.undefined
  
  /**
    * A list of field definitions specifying the schema of the data source. Field objects description: {name, [type], [xpath]}
    * returnType="array"
    */
  var fields: js.UndefOr[DataSchemaSchemaFields] = js.undefined
  
  /**
    * This is the property in the resulting object where actual resulting records will be put. (So the result will not be array but an object if this is defined), after the potential data source transformation
    */
  var outputResultsName: js.UndefOr[String] = js.undefined
  
  /**
    * This is the property (path) in the data source where the records are located.
    */
  var searchField: js.UndefOr[String] = js.undefined
}
object DataSchemaSchema {
  
  inline def apply(): DataSchemaSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSchemaSchema]
  }
  
  extension [Self <: DataSchemaSchema](x: Self) {
    
    inline def setChildDataProperty(value: String): Self = StObject.set(x, "childDataProperty", value.asInstanceOf[js.Any])
    
    inline def setChildDataPropertyUndefined: Self = StObject.set(x, "childDataProperty", js.undefined)
    
    inline def setFields(value: DataSchemaSchemaFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setOutputResultsName(value: String): Self = StObject.set(x, "outputResultsName", value.asInstanceOf[js.Any])
    
    inline def setOutputResultsNameUndefined: Self = StObject.set(x, "outputResultsName", js.undefined)
    
    inline def setSearchField(value: String): Self = StObject.set(x, "searchField", value.asInstanceOf[js.Any])
    
    inline def setSearchFieldUndefined: Self = StObject.set(x, "searchField", js.undefined)
  }
}
