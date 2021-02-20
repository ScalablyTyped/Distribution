package typings.jsSchema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectConstructor extends StObject {
  
  def like(obj: js.Any): ObjectConstructor = js.native
  
  def reference(obj: js.Any): ObjectConstructor = js.native
}
object ObjectConstructor {
  
  @scala.inline
  def apply(like: js.Any => ObjectConstructor, reference: js.Any => ObjectConstructor): ObjectConstructor = {
    val __obj = js.Dynamic.literal(like = js.Any.fromFunction1(like), reference = js.Any.fromFunction1(reference))
    __obj.asInstanceOf[ObjectConstructor]
  }
  
  @scala.inline
  implicit class ObjectConstructorMutableBuilder[Self <: ObjectConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLike(value: js.Any => ObjectConstructor): Self = StObject.set(x, "like", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReference(value: js.Any => ObjectConstructor): Self = StObject.set(x, "reference", js.Any.fromFunction1(value))
  }
}
