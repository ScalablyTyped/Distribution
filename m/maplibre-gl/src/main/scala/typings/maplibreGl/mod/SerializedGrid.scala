package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializedGrid extends StObject {
  
  var buffer: js.typedarray.ArrayBuffer
}
object SerializedGrid {
  
  inline def apply(buffer: js.typedarray.ArrayBuffer): SerializedGrid = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedGrid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializedGrid] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
  }
}
