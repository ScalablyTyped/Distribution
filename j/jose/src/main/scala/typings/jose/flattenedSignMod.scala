package typings.jose

import typings.jose.typesMod.FlattenedJWS
import typings.jose.typesMod.JWSHeaderParameters
import typings.jose.typesMod.KeyLike
import typings.jose.typesMod.SignOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenedSignMod {
  
  @JSImport("jose/dist/types/jws/flattened/sign", "FlattenedSign")
  @js.native
  open class FlattenedSign protected () extends StObject {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
    
    /* private */ var _payload: Any = js.native
    
    /* private */ var _protectedHeader: Any = js.native
    
    /* private */ var _unprotectedHeader: Any = js.native
    
    /**
      * Sets the JWS Protected Header on the FlattenedSign object.
      *
      * @param protectedHeader JWS Protected Header.
      */
    def setProtectedHeader(protectedHeader: JWSHeaderParameters): this.type = js.native
    
    /**
      * Sets the JWS Unprotected Header on the FlattenedSign object.
      *
      * @param unprotectedHeader JWS Unprotected Header.
      */
    def setUnprotectedHeader(unprotectedHeader: JWSHeaderParameters): this.type = js.native
    
    def sign(key: js.typedarray.Uint8Array): js.Promise[FlattenedJWS] = js.native
    def sign(key: js.typedarray.Uint8Array, options: SignOptions): js.Promise[FlattenedJWS] = js.native
    /**
      * Signs and resolves the value of the Flattened JWS object.
      *
      * @param key Private Key or Secret to sign the JWS with.
      * @param options JWS Sign options.
      */
    def sign(key: KeyLike): js.Promise[FlattenedJWS] = js.native
    def sign(key: KeyLike, options: SignOptions): js.Promise[FlattenedJWS] = js.native
  }
}
