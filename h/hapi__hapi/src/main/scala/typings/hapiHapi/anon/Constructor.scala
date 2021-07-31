package typings.hapiHapi.anon

import typings.hapiCatbox.mod.ClientOptions
import typings.hapiCatbox.mod.EnginePrototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constructor[T /* <: ClientOptions */] extends StObject {
  
  var constructor: EnginePrototype[js.Any]
  
  var options: js.UndefOr[T] = js.undefined
}
object Constructor {
  
  @scala.inline
  def apply[T /* <: ClientOptions */](constructor: EnginePrototype[js.Any]): Constructor[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constructor[T]]
  }
  
  @scala.inline
  implicit class ConstructorMutableBuilder[Self <: Constructor[?], T /* <: ClientOptions */] (val x: Self & Constructor[T]) extends AnyVal {
    
    @scala.inline
    def setConstructor(value: EnginePrototype[js.Any]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
