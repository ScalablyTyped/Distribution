package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataType extends StObject {
  
  /**
    * A field represents one dimension of a data type.
    */
  var field: js.UndefOr[js.Array[SchemaDataTypeField]] = js.undefined
  
  /**
    * Each data type has a unique, namespaced, name. All data types in the com.google namespace are shared as part of the platform.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataType {
  
  inline def apply(): SchemaDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataType]
  }
  
  extension [Self <: SchemaDataType](x: Self) {
    
    inline def setField(value: js.Array[SchemaDataTypeField]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: SchemaDataTypeField*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
