package typings.maplibreGl.anon

import typings.maplibreGl.styleSpecMod.StylePropertyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofStylePropertyFuncti extends StObject {
  
  /* static member */
  def deserialize[T](serialized: Parameters[T]): StylePropertyFunction[T]
  
  /* static member */
  def serialize[T](input: StylePropertyFunction[T]): Parameters[T]
}
object TypeofStylePropertyFuncti {
  
  inline def apply(
    deserialize: Parameters[Any] => StylePropertyFunction[Any],
    serialize: StylePropertyFunction[Any] => Parameters[Any]
  ): TypeofStylePropertyFuncti = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[TypeofStylePropertyFuncti]
  }
  
  extension [Self <: TypeofStylePropertyFuncti](x: Self) {
    
    inline def setDeserialize(value: Parameters[Any] => StylePropertyFunction[Any]): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    inline def setSerialize(value: StylePropertyFunction[Any] => Parameters[Any]): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
