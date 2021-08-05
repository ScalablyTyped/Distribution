package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var serializationMethod: js.UndefOr[String | Null] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setSerializationMethod(value: String): Self = StObject.set(x, "serializationMethod", value.asInstanceOf[js.Any])
    
    inline def setSerializationMethodNull: Self = StObject.set(x, "serializationMethod", null)
    
    inline def setSerializationMethodUndefined: Self = StObject.set(x, "serializationMethod", js.undefined)
  }
}
