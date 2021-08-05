package typings.libsodiumWrappers

import typings.libsodiumWrappers.mod.StateAddress
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Header extends StObject {
    
    var header: Uint8Array
    
    var state: StateAddress
  }
  object Header {
    
    inline def apply(header: Uint8Array, state: StateAddress): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setHeader(value: Uint8Array): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: State](x: Self) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setState(value: StateAddress): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
