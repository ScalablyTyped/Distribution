package typings.injectionJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectionTokenMod {
  
  @JSImport("injection-js/injection_token", "InjectionToken")
  @js.native
  open class InjectionToken[T] protected () extends OpaqueToken {
    def this(desc: String) = this()
    
    /* private */ var _differentiate_from_OpaqueToken_structurally: Any = js.native
  }
  
  @JSImport("injection-js/injection_token", "OpaqueToken")
  @js.native
  open class OpaqueToken protected () extends StObject {
    def this(_desc: String) = this()
    
    /* protected */ var _desc: String = js.native
  }
}
