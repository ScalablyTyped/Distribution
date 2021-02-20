package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trace extends StObject {
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: js.Any = js.native
}
object Trace {
  
  @scala.inline
  def apply(message: String, name: String, stack: js.Any): Trace = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trace]
  }
  
  @scala.inline
  implicit class TraceMutableBuilder[Self <: Trace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: js.Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
