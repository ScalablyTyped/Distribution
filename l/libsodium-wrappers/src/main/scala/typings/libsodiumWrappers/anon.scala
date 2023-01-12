package typings.libsodiumWrappers

import typings.libsodiumWrappers.mod.StateAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Header extends StObject {
    
    var header: js.typedarray.Uint8Array
    
    var state: StateAddress
  }
  object Header {
    
    inline def apply(header: js.typedarray.Uint8Array, state: StateAddress): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: js.typedarray.Uint8Array): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setState(value: StateAddress): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var header: String
    
    var state: StateAddress
  }
  object State {
    
    inline def apply(header: String, state: StateAddress): State = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setState(value: StateAddress): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
