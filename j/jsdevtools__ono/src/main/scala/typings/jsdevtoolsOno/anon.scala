package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.typesMod.ErrorLike
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
    
    @scala.inline
    def apply[E /* <: ErrorLike */, P /* <: js.Object */](message: String): Message[E, P] = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message[E, P]]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message[?, ?], E /* <: ErrorLike */, P /* <: js.Object */] (val x: Self & (Message[E, P])) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalError(value: E): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalErrorUndefined: Self = StObject.set(x, "originalError", js.undefined)
      
      @scala.inline
      def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
}
