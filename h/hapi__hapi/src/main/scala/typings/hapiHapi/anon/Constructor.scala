package typings.hapiHapi.anon

import typings.hapiCatbox.mod.ClientOptions
import typings.hapiCatbox.mod.EnginePrototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constructor[T /* <: ClientOptions */] extends StObject {
  
  var constructor: EnginePrototype[_] = js.native
  
  var options: js.UndefOr[T] = js.native
}
object Constructor {
  
  @scala.inline
  def apply[T /* <: ClientOptions */](constructor: EnginePrototype[_]): Constructor[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constructor[T]]
  }
  
  @scala.inline
  implicit class ConstructorMutableBuilder[Self <: Constructor[_], T /* <: ClientOptions */] (val x: Self with Constructor[T]) extends AnyVal {
    
    @scala.inline
    def setConstructor(value: EnginePrototype[_]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
