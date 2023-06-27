package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayType[T /* <: Type */] extends StObject {
  
  var N: Double
  
  var itemType: T
  
  var kind: array
}
object ArrayType {
  
  inline def apply[T /* <: Type */](N: Double, itemType: T): ArrayType[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], kind = "array")
    __obj.asInstanceOf[ArrayType[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayType[?], T /* <: Type */] (val x: Self & ArrayType[T]) extends AnyVal {
    
    inline def setItemType(value: T): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: array): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
  }
}
