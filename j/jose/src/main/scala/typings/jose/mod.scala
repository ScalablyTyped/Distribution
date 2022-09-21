package typings.jose

import typings.jose.base64urlMod.Base64UrlDecode
import typings.jose.base64urlMod.Base64UrlEncode
import typings.jose.decodeProtectedHeaderMod.ProtectedHeaderParameters
import typings.jose.decryptMod.CompactDecryptGetKey
import typings.jose.flattenedDecryptMod.FlattenedDecryptGetKey
import typings.jose.flattenedVerifyMod.FlattenedVerifyGetKey
import typings.jose.generalDecryptMod.GeneralDecryptGetKey
import typings.jose.generalVerifyMod.GeneralVerifyGetKey
import typings.jose.generateKeyPairMod.GenerateKeyPairOptions
import typings.jose.generateKeyPairMod.GenerateKeyPairResult
import typings.jose.generateSecretMod.GenerateSecretOptions
import typings.jose.importMod.PEMImportOptions
import typings.jose.joseStrings.sha256
import typings.jose.joseStrings.sha384
import typings.jose.joseStrings.sha512
import typings.jose.jwtDecryptMod.JWTDecryptGetKey
import typings.jose.jwtDecryptMod.JWTDecryptOptions
import typings.jose.jwtVerifyMod.JWTVerifyGetKey
import typings.jose.jwtVerifyMod.JWTVerifyOptions
import typings.jose.remoteMod.RemoteJWKSetOptions
import typings.jose.remoteMod.URL
import typings.jose.typesMod.CompactDecryptResult
import typings.jose.typesMod.CompactVerifyResult
import typings.jose.typesMod.DecryptOptions
import typings.jose.typesMod.FlattenedDecryptResult
import typings.jose.typesMod.FlattenedJWE
import typings.jose.typesMod.FlattenedJWSInput
import typings.jose.typesMod.FlattenedVerifyResult
import typings.jose.typesMod.GeneralDecryptResult
import typings.jose.typesMod.GeneralJWE
import typings.jose.typesMod.GeneralJWSInput
import typings.jose.typesMod.GeneralVerifyResult
import typings.jose.typesMod.GetKeyFunction
import typings.jose.typesMod.JSONWebKeySet
import typings.jose.typesMod.JWK
import typings.jose.typesMod.JWSHeaderParameters
import typings.jose.typesMod.JWTClaimVerificationOptions
import typings.jose.typesMod.JWTDecryptResult
import typings.jose.typesMod.JWTPayload
import typings.jose.typesMod.JWTVerifyResult
import typings.jose.typesMod.KeyLike
import typings.jose.typesMod.ResolvedKey
import typings.jose.typesMod.VerifyOptions
import typings.jose.unsecuredMod.UnsecuredResult
import typings.jose.verifyMod.CompactVerifyGetKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jose", "CompactEncrypt")
  @js.native
  open class CompactEncrypt protected ()
    extends typings.jose.encryptMod.CompactEncrypt {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "CompactSign")
  @js.native
  open class CompactSign protected ()
    extends typings.jose.signMod.CompactSign {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
  }
  
  inline def EmbeddedJWK(protectedHeader: JWSHeaderParameters, token: FlattenedJWSInput): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")(protectedHeader.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  @JSImport("jose", "EncryptJWT")
  @js.native
  open class EncryptJWT protected ()
    extends typings.jose.jwtEncryptMod.EncryptJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  
  @JSImport("jose", "FlattenedEncrypt")
  @js.native
  open class FlattenedEncrypt protected ()
    extends typings.jose.flattenedEncryptMod.FlattenedEncrypt {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "FlattenedSign")
  @js.native
  open class FlattenedSign protected ()
    extends typings.jose.flattenedSignMod.FlattenedSign {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "GeneralEncrypt")
  @js.native
  open class GeneralEncrypt protected ()
    extends typings.jose.generalEncryptMod.GeneralEncrypt {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "GeneralSign")
  @js.native
  open class GeneralSign protected ()
    extends typings.jose.generalSignMod.GeneralSign {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "ProduceJWT")
  @js.native
  open class ProduceJWT protected ()
    extends typings.jose.produceMod.ProduceJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  
  @JSImport("jose", "SignJWT")
  @js.native
  open class SignJWT protected ()
    extends typings.jose.jwtSignMod.SignJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  
  @JSImport("jose", "UnsecuredJWT")
  @js.native
  open class UnsecuredJWT protected ()
    extends typings.jose.unsecuredMod.UnsecuredJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  /* static members */
  object UnsecuredJWT {
    
    @JSImport("jose", "UnsecuredJWT")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decodes an unsecured JWT.
      *
      * @param jwt Unsecured JWT to decode the payload of.
      * @param options JWT Claims Set validation options.
      */
    inline def decode(jwt: String): UnsecuredResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jwt.asInstanceOf[js.Any]).asInstanceOf[UnsecuredResult]
    inline def decode(jwt: String, options: JWTClaimVerificationOptions): UnsecuredResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jwt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UnsecuredResult]
  }
  
  object base64url {
    
    @JSImport("jose", "base64url.decode")
    @js.native
    val decode: Base64UrlDecode = js.native
    
    @JSImport("jose", "base64url.encode")
    @js.native
    val encode: Base64UrlEncode = js.native
  }
  
  inline def calculateJwkThumbprint(jwk: JWK): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprint")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def calculateJwkThumbprint(jwk: JWK, digestAlgorithm: sha256 | sha384 | sha512): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprint")(jwk.asInstanceOf[js.Any], digestAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def calculateJwkThumbprintUri(jwk: JWK): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprintUri")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def calculateJwkThumbprintUri(jwk: JWK, digestAlgorithm: sha256 | sha384 | sha512): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprintUri")(jwk.asInstanceOf[js.Any], digestAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def compactDecrypt(jwe: String, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: String, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  
  inline def compactVerify(jws: String, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: String, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  
  inline def createLocalJWKSet(jwks: JSONWebKeySet): GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalJWKSet")(jwks.asInstanceOf[js.Any]).asInstanceOf[GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]]
  
  inline def createRemoteJWKSet(url: URL): GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRemoteJWKSet")(url.asInstanceOf[js.Any]).asInstanceOf[GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]]
  inline def createRemoteJWKSet(url: URL, options: RemoteJWKSetOptions): GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRemoteJWKSet")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]]
  
  inline def decodeJwt(jwt: String): JWTPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeJwt")(jwt.asInstanceOf[js.Any]).asInstanceOf[JWTPayload]
  
  inline def decodeProtectedHeader(token: String): ProtectedHeaderParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeProtectedHeader")(token.asInstanceOf[js.Any]).asInstanceOf[ProtectedHeaderParameters]
  inline def decodeProtectedHeader(token: js.Object): ProtectedHeaderParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeProtectedHeader")(token.asInstanceOf[js.Any]).asInstanceOf[ProtectedHeaderParameters]
  
  object errors {
    
    @JSImport("jose", "errors.JOSEAlgNotAllowed")
    @js.native
    open class JOSEAlgNotAllowed ()
      extends typings.jose.errorsMod.JOSEAlgNotAllowed {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JOSEError")
    @js.native
    open class JOSEError ()
      extends typings.jose.errorsMod.JOSEError {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JOSENotSupported")
    @js.native
    open class JOSENotSupported ()
      extends typings.jose.errorsMod.JOSENotSupported {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWEDecryptionFailed")
    @js.native
    open class JWEDecryptionFailed ()
      extends typings.jose.errorsMod.JWEDecryptionFailed {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWEInvalid")
    @js.native
    open class JWEInvalid ()
      extends typings.jose.errorsMod.JWEInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKInvalid")
    @js.native
    open class JWKInvalid ()
      extends typings.jose.errorsMod.JWKInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSInvalid")
    @js.native
    open class JWKSInvalid ()
      extends typings.jose.errorsMod.JWKSInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSMultipleMatchingKeys")
    @js.native
    open class JWKSMultipleMatchingKeys ()
      extends typings.jose.errorsMod.JWKSMultipleMatchingKeys {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSNoMatchingKey")
    @js.native
    open class JWKSNoMatchingKey ()
      extends typings.jose.errorsMod.JWKSNoMatchingKey {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSTimeout")
    @js.native
    open class JWKSTimeout ()
      extends typings.jose.errorsMod.JWKSTimeout {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWSInvalid")
    @js.native
    open class JWSInvalid ()
      extends typings.jose.errorsMod.JWSInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWSSignatureVerificationFailed")
    @js.native
    open class JWSSignatureVerificationFailed ()
      extends typings.jose.errorsMod.JWSSignatureVerificationFailed {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWTClaimValidationFailed")
    @js.native
    open class JWTClaimValidationFailed protected ()
      extends typings.jose.errorsMod.JWTClaimValidationFailed {
      def this(message: String) = this()
      def this(message: String, claim: String) = this()
      def this(message: String, claim: String, reason: String) = this()
      def this(message: String, claim: Unit, reason: String) = this()
    }
    
    @JSImport("jose", "errors.JWTExpired")
    @js.native
    open class JWTExpired protected ()
      extends typings.jose.errorsMod.JWTExpired {
      def this(message: String) = this()
      def this(message: String, claim: String) = this()
      def this(message: String, claim: String, reason: String) = this()
      def this(message: String, claim: Unit, reason: String) = this()
    }
    
    @JSImport("jose", "errors.JWTInvalid")
    @js.native
    open class JWTInvalid ()
      extends typings.jose.errorsMod.JWTInvalid {
      def this(message: String) = this()
    }
  }
  
  inline def exportJWK(key: js.typedarray.Uint8Array): js.Promise[JWK] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportJWK")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JWK]]
  inline def exportJWK(key: KeyLike): js.Promise[JWK] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportJWK")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JWK]]
  
  inline def exportPKCS8(key: KeyLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPKCS8")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def exportSPKI(key: KeyLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportSPKI")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def flattenedDecrypt(jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey): js.Promise[FlattenedDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey, options: DecryptOptions): js.Promise[FlattenedDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  
  inline def flattenedVerify(jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey): js.Promise[FlattenedVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey]]
  inline def flattenedVerify(jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey, options: VerifyOptions): js.Promise[FlattenedVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  
  inline def generalDecrypt(jwe: GeneralJWE, getKey: GeneralDecryptGetKey): js.Promise[GeneralDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey]]
  inline def generalDecrypt(jwe: GeneralJWE, getKey: GeneralDecryptGetKey, options: DecryptOptions): js.Promise[GeneralDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey]]
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  
  inline def generalVerify(jws: GeneralJWSInput, getKey: GeneralVerifyGetKey): js.Promise[GeneralVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey]]
  inline def generalVerify(jws: GeneralJWSInput, getKey: GeneralVerifyGetKey, options: VerifyOptions): js.Promise[GeneralVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  
  inline def generateKeyPair(alg: String): js.Promise[GenerateKeyPairResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GenerateKeyPairResult]]
  inline def generateKeyPair(alg: String, options: GenerateKeyPairOptions): js.Promise[GenerateKeyPairResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GenerateKeyPairResult]]
  
  inline def generateSecret(alg: String): js.Promise[KeyLike | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(alg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def generateSecret(alg: String, options: GenerateSecretOptions): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  
  inline def importJWK(jwk: JWK): js.Promise[KeyLike | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def importJWK(jwk: JWK, alg: String): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def importJWK(jwk: JWK, alg: String, octAsKeyObject: Boolean): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  inline def importJWK(jwk: JWK, alg: Unit, octAsKeyObject: Boolean): js.Promise[KeyLike | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike | js.typedarray.Uint8Array]]
  
  inline def importPKCS8(pkcs8: String, alg: String): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  inline def importPKCS8(pkcs8: String, alg: String, options: PEMImportOptions): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  inline def importSPKI(spki: String, alg: String): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  inline def importSPKI(spki: String, alg: String, options: PEMImportOptions): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  inline def importX509(x509: String, alg: String): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  inline def importX509(x509: String, alg: String, options: PEMImportOptions): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
  
  inline def jwtDecrypt(jwt: String, getKey: JWTDecryptGetKey): js.Promise[JWTDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey]]
  inline def jwtDecrypt(jwt: String, getKey: JWTDecryptGetKey, options: JWTDecryptOptions): js.Promise[JWTDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey]]
  inline def jwtDecrypt(jwt: String, key: js.typedarray.Uint8Array): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: js.typedarray.Uint8Array, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: KeyLike): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: KeyLike, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, getKey: JWTDecryptGetKey): js.Promise[JWTDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, getKey: JWTDecryptGetKey, options: JWTDecryptOptions): js.Promise[JWTDecryptResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: KeyLike): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: KeyLike, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  
  inline def jwtVerify(jwt: String, getKey: JWTVerifyGetKey): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: String, getKey: JWTVerifyGetKey, options: JWTVerifyOptions): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: String, key: js.typedarray.Uint8Array): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: js.typedarray.Uint8Array, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: KeyLike): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: KeyLike, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, getKey: JWTVerifyGetKey): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, getKey: JWTVerifyGetKey, options: JWTVerifyOptions): js.Promise[JWTVerifyResult & ResolvedKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: KeyLike): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: KeyLike, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
}
