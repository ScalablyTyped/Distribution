package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomResourceColumnDefinition extends StObject {
  
  /**
    * description is a human readable description of this column. +optional
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for more. +optional
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JSONPath is a simple JSON path, i.e. with array notation.
    */
  var jsonPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * name is a human readable name for the column.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a higher priority. +optional
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for more.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomResourceColumnDefinition {
  
  inline def apply(): SchemaCustomResourceColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomResourceColumnDefinition]
  }
  
  extension [Self <: SchemaCustomResourceColumnDefinition](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setJsonPath(value: String): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
    
    inline def setJsonPathNull: Self = StObject.set(x, "jsonPath", null)
    
    inline def setJsonPathUndefined: Self = StObject.set(x, "jsonPath", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
