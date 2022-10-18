package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.esmTypesMod.ErrorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message[E /* <: ErrorLike */, P /* <: js.Object */] extends StObject {
    
    var message: String
    
    var originalError: js.UndefOr[E] = js.undefined
    
    var props: js.UndefOr[P] = js.undefined
  }
  object Message {
    
    inline def apply[E /* <: ErrorLike */, P /* <: js.Object */](message: String): Message[E, P] = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message[E, P]]
    }
    
    extension [Self <: Message[?, ?], E /* <: ErrorLike */, P /* <: js.Object */](x: Self & (Message[E, P])) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOriginalError(value: E): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
      
      inline def setOriginalErrorUndefined: Self = StObject.set(x, "originalError", js.undefined)
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
}
