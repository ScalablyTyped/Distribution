package typings.jshamcrest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttachAssertions extends StObject {
    
    var attachAssertions: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[js.Object] = js.undefined
  }
  object AttachAssertions {
    
    inline def apply(): AttachAssertions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachAssertions]
    }
    
    extension [Self <: AttachAssertions](x: Self) {
      
      inline def setAttachAssertions(value: Boolean): Self = StObject.set(x, "attachAssertions", value.asInstanceOf[js.Any])
      
      inline def setAttachAssertionsUndefined: Self = StObject.set(x, "attachAssertions", js.undefined)
      
      inline def setScope(value: js.Object): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait Scope extends StObject {
    
    var scope: js.UndefOr[js.Object] = js.undefined
  }
  object Scope {
    
    inline def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setScope(value: js.Object): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
