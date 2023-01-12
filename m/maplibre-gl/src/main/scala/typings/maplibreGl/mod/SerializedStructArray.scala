package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializedStructArray extends StObject {
  
  var arrayBuffer: js.typedarray.ArrayBuffer
  
  var length: Double
}
object SerializedStructArray {
  
  inline def apply(arrayBuffer: js.typedarray.ArrayBuffer, length: Double): SerializedStructArray = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedStructArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializedStructArray] (val x: Self) extends AnyVal {
    
    inline def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
