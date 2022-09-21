package typings.jose

import typings.jose.typesMod.CompactJWSHeaderParameters
import typings.jose.typesMod.KeyLike
import typings.jose.typesMod.SignOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signMod {
  
  @JSImport("jose/dist/types/jws/compact/sign", "CompactSign")
  @js.native
  open class CompactSign protected () extends StObject {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
    
    /* private */ var _flattened: Any = js.native
    
    /**
      * Sets the JWS Protected Header on the Sign object.
      *
      * @param protectedHeader JWS Protected Header.
      */
    def setProtectedHeader(protectedHeader: CompactJWSHeaderParameters): this.type = js.native
    
    def sign(key: js.typedarray.Uint8Array): js.Promise[String] = js.native
    def sign(key: js.typedarray.Uint8Array, options: SignOptions): js.Promise[String] = js.native
    /**
      * Signs and resolves the value of the Compact JWS string.
      *
      * @param key Private Key or Secret to sign the JWS with.
      * @param options JWS Sign options.
      */
    def sign(key: KeyLike): js.Promise[String] = js.native
    def sign(key: KeyLike, options: SignOptions): js.Promise[String] = js.native
  }
}
