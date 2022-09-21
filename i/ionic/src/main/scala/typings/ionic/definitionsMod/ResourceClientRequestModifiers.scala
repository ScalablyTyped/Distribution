package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceClientRequestModifiers extends StObject {
  
  var fields: js.UndefOr[js.Array[String]] = js.undefined
}
object ResourceClientRequestModifiers {
  
  inline def apply(): ResourceClientRequestModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceClientRequestModifiers]
  }
  
  extension [Self <: ResourceClientRequestModifiers](x: Self) {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
