package typings.iobroker.anon

import typings.iobroker.objectsMod.global.ioBroker.ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[T /* <: ObjectType */] extends StObject {
  
  var `type`: T
}
object Type {
  
  inline def apply[T /* <: ObjectType */](`type`: T): Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type[?], T /* <: ObjectType */] (val x: Self & Type[T]) extends AnyVal {
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
