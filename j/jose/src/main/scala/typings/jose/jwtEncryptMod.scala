package typings.jose

import typings.jose.produceMod.ProduceJWT
import typings.jose.typesMod.CompactJWEHeaderParameters
import typings.jose.typesMod.EncryptOptions
import typings.jose.typesMod.JWEKeyManagementHeaderParameters
import typings.jose.typesMod.JWTPayload
import typings.jose.typesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwtEncryptMod {
  
  @JSImport("jose/dist/types/jwt/encrypt", "EncryptJWT")
  @js.native
  open class EncryptJWT protected () extends ProduceJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
    
    /* private */ var _cek: Any = js.native
    
    /* private */ var _iv: Any = js.native
    
    /* private */ var _keyManagementParameters: Any = js.native
    
    /* private */ var _protectedHeader: Any = js.native
    
    /* private */ var _replicateAudienceAsHeader: Any = js.native
    
    /* private */ var _replicateIssuerAsHeader: Any = js.native
    
    /* private */ var _replicateSubjectAsHeader: Any = js.native
    
    def encrypt(key: js.typedarray.Uint8Array): js.Promise[String] = js.native
    def encrypt(key: js.typedarray.Uint8Array, options: EncryptOptions): js.Promise[String] = js.native
    /**
      * Encrypts and returns the JWT.
      *
      * @param key Public Key or Secret to encrypt the JWT with.
      * @param options JWE Encryption options.
      */
    def encrypt(key: KeyLike): js.Promise[String] = js.native
    def encrypt(key: KeyLike, options: EncryptOptions): js.Promise[String] = js.native
    
    /**
      * Replicates the "aud" (Audience) Claim as a JWE Protected Header Parameter as per
      * [RFC7519#section-5.3](https://www.rfc-editor.org/rfc/rfc7519#section-5.3).
      */
    def replicateAudienceAsHeader(): this.type = js.native
    
    /**
      * Replicates the "iss" (Issuer) Claim as a JWE Protected Header Parameter as per
      * [RFC7519#section-5.3](https://www.rfc-editor.org/rfc/rfc7519#section-5.3).
      */
    def replicateIssuerAsHeader(): this.type = js.native
    
    /**
      * Replicates the "sub" (Subject) Claim as a JWE Protected Header Parameter as per
      * [RFC7519#section-5.3](https://www.rfc-editor.org/rfc/rfc7519#section-5.3).
      */
    def replicateSubjectAsHeader(): this.type = js.native
    
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
      * Sets the JWE Protected Header on the EncryptJWT object.
      *
      * @param protectedHeader JWE Protected Header. Must contain an "alg" (JWE Algorithm) and "enc"
      *   (JWE Encryption Algorithm) properties.
      */
    def setProtectedHeader(protectedHeader: CompactJWEHeaderParameters): this.type = js.native
  }
}
