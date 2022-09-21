package typings.luminoCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @JSImport("@lumino/coreutils/types/token", "Token")
  @js.native
  open class Token[T] protected () extends StObject {
    /**
      * Construct a new token.
      *
      * @param name - A human readable name for the token.
      */
    def this(name: String) = this()
    
    /* private */ var _tokenStructuralPropertyT: Any = js.native
    
    /**
      * The human readable name for the token.
      *
      * #### Notes
      * This can be useful for debugging and logging.
      */
    val name: String = js.native
  }
}
