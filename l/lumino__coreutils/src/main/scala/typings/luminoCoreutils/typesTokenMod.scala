package typings.luminoCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTokenMod {
  
  @JSImport("@lumino/coreutils/types/token", "Token")
  @js.native
  open class Token[T] protected () extends StObject {
    /**
      * Construct a new token.
      *
      * @param name - A human readable name for the token.
      * @param description - Token purpose description for documentation.
      */
    def this(name: String) = this()
    def this(name: String, description: String) = this()
    
    /* private */ var _tokenStructuralPropertyT: Any = js.native
    
    /**
      * Token purpose description.
      */
    val description: js.UndefOr[String] = js.native
    
    /**
      * The human readable name for the token.
      *
      * #### Notes
      * This can be useful for debugging and logging.
      */
    val name: String = js.native
  }
}
