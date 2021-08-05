package typings.materialUiCore.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var node: HTMLInputElement
  
  var value: String | Double | Boolean | (js.Array[String | Double | Boolean])
}
object Value {
  
  inline def apply(node: HTMLInputElement, value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Value = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setNode(value: HTMLInputElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
