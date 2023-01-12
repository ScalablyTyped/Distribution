package typings.jsSchema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectConstructor extends StObject {
  
  def like(obj: Any): ObjectConstructor
  
  def reference(obj: Any): ObjectConstructor
}
object ObjectConstructor {
  
  inline def apply(like: Any => ObjectConstructor, reference: Any => ObjectConstructor): ObjectConstructor = {
    val __obj = js.Dynamic.literal(like = js.Any.fromFunction1(like), reference = js.Any.fromFunction1(reference))
    __obj.asInstanceOf[ObjectConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectConstructor] (val x: Self) extends AnyVal {
    
    inline def setLike(value: Any => ObjectConstructor): Self = StObject.set(x, "like", js.Any.fromFunction1(value))
    
    inline def setReference(value: Any => ObjectConstructor): Self = StObject.set(x, "reference", js.Any.fromFunction1(value))
  }
}
