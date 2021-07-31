package typings.luminoCoreutils

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  object Random {
    
    @JSImport("@lumino/coreutils/types/random", "Random")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A function which generates random bytes.
      *
      * @param buffer - The `Uint8Array` to fill with random bytes.
      *
      * #### Notes
      * A cryptographically strong random number generator will be used if
      * available. Otherwise, `Math.random` will be used as a fallback for
      * randomness.
      *
      * The following RNGs are supported, listed in order of precedence:
      *   - `window.crypto.getRandomValues`
      *   - `window.msCrypto.getRandomValues`
      *   - `require('crypto').randomFillSync
      *   - `require('crypto').randomBytes
      *   - `Math.random`
      */
    @scala.inline
    def getRandomValues(buffer: Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
