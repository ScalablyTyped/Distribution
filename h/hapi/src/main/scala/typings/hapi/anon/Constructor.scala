package typings.hapi.anon

import typings.catbox.mod.ClientOptions
import typings.catbox.mod.EnginePrototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constructor[T /* <: ClientOptions */] extends StObject {
  
  var constructor: EnginePrototype[Any]
  
  var options: js.UndefOr[T] = js.undefined
}
object Constructor {
  
  inline def apply[T /* <: ClientOptions */](constructor: EnginePrototype[Any]): Constructor[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constructor[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Constructor[?], T /* <: ClientOptions */] (val x: Self & Constructor[T]) extends AnyVal {
    
    inline def setConstructor(value: EnginePrototype[Any]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
