package typings.hubot

import typings.hubot.mod.Adapter
import typings.hubot.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Listener[A /* <: Adapter */] extends StObject {
    
    var listener: Middleware[A]
    
    var receive: Middleware[A]
    
    var response: Middleware[A]
  }
  object Listener {
    
    @scala.inline
    def apply[A /* <: Adapter */](listener: Middleware[A], receive: Middleware[A], response: Middleware[A]): Listener[A] = {
      val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Listener[A]]
    }
    
    @scala.inline
    implicit class ListenerMutableBuilder[Self <: Listener[?], A /* <: Adapter */] (val x: Self & Listener[A]) extends AnyVal {
      
      @scala.inline
      def setListener(value: Middleware[A]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceive(value: Middleware[A]): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Middleware[A]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
