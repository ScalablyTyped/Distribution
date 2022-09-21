package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStruct extends StObject {
  
  /**
    * Unordered map of dynamically typed values.
    */
  var fields: js.UndefOr[StringDictionary[SchemaValue] | Null] = js.undefined
}
object SchemaStruct {
  
  inline def apply(): SchemaStruct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStruct]
  }
  
  extension [Self <: SchemaStruct](x: Self) {
    
    inline def setFields(value: StringDictionary[SchemaValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
