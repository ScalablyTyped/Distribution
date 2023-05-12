package typings.jose

import typings.jose.distTypesTypesMod.CompactJWEHeaderParameters
import typings.jose.distTypesTypesMod.EncryptOptions
import typings.jose.distTypesTypesMod.JWEKeyManagementHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJweCompactEncryptMod {
  
  @JSImport("jose/dist/types/jwe/compact/encrypt", "CompactEncrypt")
  @js.native
  open class CompactEncrypt protected () extends StObject {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
    
    /* private */ var _flattened: Any = js.native
    
    def encrypt(key: js.typedarray.Uint8Array): js.Promise[String] = js.native
    def encrypt(key: js.typedarray.Uint8Array, options: EncryptOptions): js.Promise[String] = js.native
    /**
      * Encrypts and resolves the value of the Compact JWE string.
      *
      * @param key Public Key or Secret to encrypt the JWE with. See
      *   {@link https://github.com/panva/jose/issues/210#jwe-alg Algorithm Key Requirements}.
      * @param options JWE Encryption options.
      */
    def encrypt(key: KeyLike): js.Promise[String] = js.native
    def encrypt(key: KeyLike, options: EncryptOptions): js.Promise[String] = js.native
    
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
      * Sets the JWE Key Management parameters to be used when encrypting the Content Encryption Key.
      * You do not need to invoke this method, it is only really intended for test and vector
      * validation purposes.
      *
      * @param parameters JWE Key Management parameters.
      */
    def setKeyManagementParameters(parameters: JWEKeyManagementHeaderParameters): this.type = js.native
    
    /**
      * Sets the JWE Protected Header on the CompactEncrypt object.
      *
      * @param protectedHeader JWE Protected Header object.
      */
    def setProtectedHeader(protectedHeader: CompactJWEHeaderParameters): this.type = js.native
  }
}
