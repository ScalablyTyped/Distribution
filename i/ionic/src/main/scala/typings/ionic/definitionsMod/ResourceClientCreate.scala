package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceClientCreate[T /* <: js.Object */, U /* <: js.Object */] extends StObject {
  
  def create(details: U): js.Promise[T]
}
object ResourceClientCreate {
  
  inline def apply[T /* <: js.Object */, U /* <: js.Object */](create: U => js.Promise[T]): ResourceClientCreate[T, U] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ResourceClientCreate[T, U]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceClientCreate[?, ?], T /* <: js.Object */, U /* <: js.Object */] (val x: Self & (ResourceClientCreate[T, U])) extends AnyVal {
    
    inline def setCreate(value: U => js.Promise[T]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
