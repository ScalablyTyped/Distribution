package typings.jose

import typings.jose.distTypesTypesMod.EncryptOptions
import typings.jose.distTypesTypesMod.FlattenedJWE
import typings.jose.distTypesTypesMod.JWEHeaderParameters
import typings.jose.distTypesTypesMod.JWEKeyManagementHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJweFlattenedEncryptMod {
  
  @JSImport("jose/dist/types/jwe/flattened/encrypt", "FlattenedEncrypt")
  @js.native
  open class FlattenedEncrypt protected () extends StObject {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
    
    /* private */ var _aad: Any = js.native
    
    /* private */ var _cek: Any = js.native
    
    /* private */ var _iv: Any = js.native
    
    /* private */ var _keyManagementParameters: Any = js.native
    
    /* private */ var _plaintext: Any = js.native
    
    /* private */ var _protectedHeader: Any = js.native
    
    /* private */ var _sharedUnprotectedHeader: Any = js.native
    
    /* private */ var _unprotectedHeader: Any = js.native
    
    def encrypt(key: js.typedarray.Uint8Array): js.Promise[FlattenedJWE] = js.native
    def encrypt(key: js.typedarray.Uint8Array, options: EncryptOptions): js.Promise[FlattenedJWE] = js.native
    /**
      * Encrypts and resolves the value of the Flattened JWE object.
      *
      * @param key Public Key or Secret to encrypt the JWE with. See
      *   {@link https://github.com/panva/jose/issues/210#jwe-alg Algorithm Key Requirements}.
      * @param options JWE Encryption options.
      */
    def encrypt(key: KeyLike): js.Promise[FlattenedJWE] = js.native
    def encrypt(key: KeyLike, options: EncryptOptions): js.Promise[FlattenedJWE] = js.native
    
    /**
      * Sets the Additional Authenticated Data on the FlattenedEncrypt object.
      *
      * @param aad Additional Authenticated Data.
      */
    def setAdditionalAuthenticatedData(aad: js.typedarray.Uint8Array): this.type = js.native
    
    /**
      * Sets a content encryption key to use, by default a random suitable one is generated for the JWE
      * enc" (Encryption Algorithm) Header Parameter.
      *
      * @deprecated You should not use this method. It is only really intended for test and vector
      *   validation purposes.
      * @param cek JWE Content Encryption Key.
      */
    def setContentEncryptionKey(cek: js.typedarray.Uint8Array): this.type = js.native
    
    /**
      * Sets the JWE Initialization Vector to use for content encryption, by default a random suitable
      * one is generated for the JWE enc" (Encryption Algorithm) Header Parameter.
      *
      * @deprecated You should not use this method. It is only really intended for test and vector
      *   validation purposes.
      * @param iv JWE Initialization Vector.
      */
    def setInitializationVector(iv: js.typedarray.Uint8Array): this.type = js.native
    
    /**
      * Sets the JWE Key Management parameters to be used when encrypting. Use of this is method is
      * really only needed for ECDH based algorithms when utilizing the Agreement PartyUInfo or
      * Agreement PartyVInfo parameters. Other parameters will always be randomly generated when needed
      * and missing.
      *
      * @param parameters JWE Key Management parameters.
      */
    def setKeyManagementParameters(parameters: JWEKeyManagementHeaderParameters): this.type = js.native
    
    /**
      * Sets the JWE Protected Header on the FlattenedEncrypt object.
      *
      * @param protectedHeader JWE Protected Header.
      */
    def setProtectedHeader(protectedHeader: JWEHeaderParameters): this.type = js.native
    
    /**
      * Sets the JWE Shared Unprotected Header on the FlattenedEncrypt object.
      *
      * @param sharedUnprotectedHeader JWE Shared Unprotected Header.
      */
    def setSharedUnprotectedHeader(sharedUnprotectedHeader: JWEHeaderParameters): this.type = js.native
    
    /**
      * Sets the JWE Per-Recipient Unprotected Header on the FlattenedEncrypt object.
      *
      * @param unprotectedHeader JWE Per-Recipient Unprotected Header.
      */
    def setUnprotectedHeader(unprotectedHeader: JWEHeaderParameters): this.type = js.native
  }
  
  @JSImport("jose/dist/types/jwe/flattened/encrypt", "unprotected")
  @js.native
  val unprotected: js.Symbol = js.native
}
