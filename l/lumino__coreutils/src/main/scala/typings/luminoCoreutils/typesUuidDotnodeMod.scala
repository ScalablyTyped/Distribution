package typings.luminoCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUuidDotnodeMod {
  
  object UUID {
    
    @JSImport("@lumino/coreutils/types/uuid.node", "UUID")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A function which generates UUID v4 identifiers.
      *
      * @returns A new UUID v4 string.
      *
      * #### Notes
      * This implementation complies with RFC 4122.
      *
      * This uses `Random.getRandomValues()` for random bytes, which in
      * turn will use the underlying `crypto` module of the platform if
      * it is available. The fallback for randomness is `Math.random`.
      */
    inline def uuid4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")().asInstanceOf[String]
  }
}
