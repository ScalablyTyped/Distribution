package typings.injectionJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectiveKeyMod {
  
  @JSImport("injection-js/reflective_key", "ReflectiveKey")
  @js.native
  open class ReflectiveKey protected () extends StObject {
    /**
      * Private
      */
    def this(token: js.Object, id: Double) = this()
    
    /**
      * Returns a stringified token.
      */
    def displayName: String = js.native
    
    var id: Double = js.native
    
    var token: js.Object = js.native
  }
  /* static members */
  object ReflectiveKey {
    
    @JSImport("injection-js/reflective_key", "ReflectiveKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieves a `Key` for a token.
      */
    inline def get(token: js.Object): ReflectiveKey = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any]).asInstanceOf[ReflectiveKey]
  }
}
