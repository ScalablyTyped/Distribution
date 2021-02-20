package typings.libp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handle extends StObject {
  
  var handle: js.Function = js.native
  
  var register: js.Function = js.native
  
  var unregister: js.Function = js.native
}
object Handle {
  
  @scala.inline
  def apply(handle: js.Function, register: js.Function, unregister: js.Function): Handle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], register = register.asInstanceOf[js.Any], unregister = unregister.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
  
  @scala.inline
  implicit class HandleMutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: js.Function): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: js.Function): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregister(value: js.Function): Self = StObject.set(x, "unregister", value.asInstanceOf[js.Any])
  }
}
