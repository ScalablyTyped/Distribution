package typings.jose

import typings.jose.distTypesJweCompactDecryptMod.CompactDecryptGetKey
import typings.jose.distTypesJweFlattenedDecryptMod.FlattenedDecryptGetKey
import typings.jose.distTypesJweGeneralDecryptMod.GeneralDecryptGetKey
import typings.jose.distTypesJwksRemoteMod.RemoteJWKSetOptions
import typings.jose.distTypesJwsCompactVerifyMod.CompactVerifyGetKey
import typings.jose.distTypesJwsFlattenedVerifyMod.FlattenedVerifyGetKey
import typings.jose.distTypesJwsGeneralVerifyMod.GeneralVerifyGetKey
import typings.jose.distTypesJwtDecryptMod.JWTDecryptGetKey
import typings.jose.distTypesJwtDecryptMod.JWTDecryptOptions
import typings.jose.distTypesJwtUnsecuredMod.UnsecuredResult
import typings.jose.distTypesJwtVerifyMod.JWTVerifyGetKey
import typings.jose.distTypesJwtVerifyMod.JWTVerifyOptions
import typings.jose.distTypesKeyGenerateKeyPairMod.GenerateKeyPairOptions
import typings.jose.distTypesKeyGenerateKeyPairMod.GenerateKeyPairResult
import typings.jose.distTypesKeyGenerateSecretMod.GenerateSecretOptions
import typings.jose.distTypesKeyImportMod.PEMImportOptions
import typings.jose.distTypesTypesMod.CompactDecryptResult
import typings.jose.distTypesTypesMod.CompactVerifyResult
import typings.jose.distTypesTypesMod.DecryptOptions
import typings.jose.distTypesTypesMod.FlattenedDecryptResult
import typings.jose.distTypesTypesMod.FlattenedJWE
import typings.jose.distTypesTypesMod.FlattenedJWSInput
import typings.jose.distTypesTypesMod.FlattenedVerifyResult
import typings.jose.distTypesTypesMod.GeneralDecryptResult
import typings.jose.distTypesTypesMod.GeneralJWE
import typings.jose.distTypesTypesMod.GeneralJWSInput
import typings.jose.distTypesTypesMod.GeneralVerifyResult
import typings.jose.distTypesTypesMod.JSONWebKeySet
import typings.jose.distTypesTypesMod.JWK
import typings.jose.distTypesTypesMod.JWSHeaderParameters
import typings.jose.distTypesTypesMod.JWTClaimVerificationOptions
import typings.jose.distTypesTypesMod.JWTDecryptResult
import typings.jose.distTypesTypesMod.JWTPayload
import typings.jose.distTypesTypesMod.JWTVerifyResult
import typings.jose.distTypesTypesMod.KeyLike
import typings.jose.distTypesTypesMod.ResolvedKey
import typings.jose.distTypesTypesMod.VerifyOptions
import typings.jose.distTypesUtilBase64urlMod.Base64UrlDecode
import typings.jose.distTypesUtilBase64urlMod.Base64UrlEncode
import typings.jose.distTypesUtilDecodeProtectedHeaderMod.ProtectedHeaderParameters
import typings.jose.joseStrings.sha256
import typings.jose.joseStrings.sha384
import typings.jose.joseStrings.sha512
import typings.std.URL
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
    extends typings.jose.distTypesJweCompactEncryptMod.CompactEncrypt {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "CompactSign")
  @js.native
  open class CompactSign protected ()
    extends typings.jose.distTypesJwsCompactSignMod.CompactSign {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
  }
  
  inline def EmbeddedJWK[T /* <: KeyLike */](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")().asInstanceOf[js.Promise[T]]
  inline def EmbeddedJWK[T /* <: KeyLike */](protectedHeader: Unit, token: FlattenedJWSInput): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")(protectedHeader.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def EmbeddedJWK[T /* <: KeyLike */](protectedHeader: JWSHeaderParameters): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")(protectedHeader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def EmbeddedJWK[T /* <: KeyLike */](protectedHeader: JWSHeaderParameters, token: FlattenedJWSInput): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")(protectedHeader.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("jose", "EncryptJWT")
  @js.native
  open class EncryptJWT protected ()
    extends typings.jose.distTypesJwtEncryptMod.EncryptJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  
  @JSImport("jose", "FlattenedEncrypt")
  @js.native
  open class FlattenedEncrypt protected ()
    extends typings.jose.distTypesJweFlattenedEncryptMod.FlattenedEncrypt {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "FlattenedSign")
  @js.native
  open class FlattenedSign protected ()
    extends typings.jose.distTypesJwsFlattenedSignMod.FlattenedSign {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "GeneralEncrypt")
  @js.native
  open class GeneralEncrypt protected ()
    extends typings.jose.distTypesJweGeneralEncryptMod.GeneralEncrypt {
    /** @param plaintext Binary representation of the plaintext to encrypt. */
    def this(plaintext: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "GeneralSign")
  @js.native
  open class GeneralSign protected ()
    extends typings.jose.distTypesJwsGeneralSignMod.GeneralSign {
    /** @param payload Binary representation of the payload to sign. */
    def this(payload: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("jose", "ProduceJWT")
  @js.native
  open class ProduceJWT protected ()
    extends typings.jose.distTypesJwtProduceMod.ProduceJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  
  @JSImport("jose", "SignJWT")
  @js.native
  open class SignJWT protected ()
    extends typings.jose.distTypesJwtSignMod.SignJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
  }
  
  @JSImport("jose", "UnsecuredJWT")
  @js.native
  open class UnsecuredJWT protected ()
    extends typings.jose.distTypesJwtUnsecuredMod.UnsecuredJWT {
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
  
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: String, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt(jwe: js.typedarray.Uint8Array, key: KeyLike, options: DecryptOptions): js.Promise[CompactDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult]]
  inline def compactDecrypt[T /* <: KeyLike */](jwe: String, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey[T]]]
  inline def compactDecrypt[T /* <: KeyLike */](jwe: String, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey[T]]]
  inline def compactDecrypt[T /* <: KeyLike */](jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey): js.Promise[CompactDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey[T]]]
  inline def compactDecrypt[T /* <: KeyLike */](jwe: js.typedarray.Uint8Array, getKey: CompactDecryptGetKey, options: DecryptOptions): js.Promise[CompactDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactDecryptResult & ResolvedKey[T]]]
  
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: String, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify(jws: js.typedarray.Uint8Array, key: KeyLike, options: VerifyOptions): js.Promise[CompactVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult]]
  inline def compactVerify[T /* <: KeyLike */](jws: String, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey[T]]]
  inline def compactVerify[T /* <: KeyLike */](jws: String, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey[T]]]
  inline def compactVerify[T /* <: KeyLike */](jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey): js.Promise[CompactVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey[T]]]
  inline def compactVerify[T /* <: KeyLike */](jws: js.typedarray.Uint8Array, getKey: CompactVerifyGetKey, options: VerifyOptions): js.Promise[CompactVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compactVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CompactVerifyResult & ResolvedKey[T]]]
  
  inline def createLocalJWKSet[T /* <: KeyLike */](jwks: JSONWebKeySet): js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalJWKSet")(jwks.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ]]
  
  inline def createRemoteJWKSet[T /* <: KeyLike */](url: URL): js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRemoteJWKSet")(url.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ]]
  inline def createRemoteJWKSet[T /* <: KeyLike */](url: URL, options: RemoteJWKSetOptions): js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRemoteJWKSet")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ]]
  
  inline def decodeJwt(jwt: String): JWTPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeJwt")(jwt.asInstanceOf[js.Any]).asInstanceOf[JWTPayload]
  
  inline def decodeProtectedHeader(token: String): ProtectedHeaderParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeProtectedHeader")(token.asInstanceOf[js.Any]).asInstanceOf[ProtectedHeaderParameters]
  inline def decodeProtectedHeader(token: js.Object): ProtectedHeaderParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeProtectedHeader")(token.asInstanceOf[js.Any]).asInstanceOf[ProtectedHeaderParameters]
  
  object errors {
    
    @JSImport("jose", "errors.JOSEAlgNotAllowed")
    @js.native
    open class JOSEAlgNotAllowed ()
      extends typings.jose.distTypesUtilErrorsMod.JOSEAlgNotAllowed {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JOSEError")
    @js.native
    open class JOSEError ()
      extends typings.jose.distTypesUtilErrorsMod.JOSEError {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JOSENotSupported")
    @js.native
    open class JOSENotSupported ()
      extends typings.jose.distTypesUtilErrorsMod.JOSENotSupported {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWEDecryptionFailed")
    @js.native
    open class JWEDecryptionFailed ()
      extends typings.jose.distTypesUtilErrorsMod.JWEDecryptionFailed {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWEInvalid")
    @js.native
    open class JWEInvalid ()
      extends typings.jose.distTypesUtilErrorsMod.JWEInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKInvalid")
    @js.native
    open class JWKInvalid ()
      extends typings.jose.distTypesUtilErrorsMod.JWKInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSInvalid")
    @js.native
    open class JWKSInvalid ()
      extends typings.jose.distTypesUtilErrorsMod.JWKSInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSMultipleMatchingKeys")
    @js.native
    open class JWKSMultipleMatchingKeys ()
      extends typings.jose.distTypesUtilErrorsMod.JWKSMultipleMatchingKeys {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSNoMatchingKey")
    @js.native
    open class JWKSNoMatchingKey ()
      extends typings.jose.distTypesUtilErrorsMod.JWKSNoMatchingKey {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWKSTimeout")
    @js.native
    open class JWKSTimeout ()
      extends typings.jose.distTypesUtilErrorsMod.JWKSTimeout {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWSInvalid")
    @js.native
    open class JWSInvalid ()
      extends typings.jose.distTypesUtilErrorsMod.JWSInvalid {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWSSignatureVerificationFailed")
    @js.native
    open class JWSSignatureVerificationFailed ()
      extends typings.jose.distTypesUtilErrorsMod.JWSSignatureVerificationFailed {
      def this(message: String) = this()
    }
    
    @JSImport("jose", "errors.JWTClaimValidationFailed")
    @js.native
    open class JWTClaimValidationFailed protected ()
      extends typings.jose.distTypesUtilErrorsMod.JWTClaimValidationFailed {
      def this(message: String) = this()
      def this(message: String, claim: String) = this()
      def this(message: String, claim: String, reason: String) = this()
      def this(message: String, claim: Unit, reason: String) = this()
    }
    
    @JSImport("jose", "errors.JWTExpired")
    @js.native
    open class JWTExpired protected ()
      extends typings.jose.distTypesUtilErrorsMod.JWTExpired {
      def this(message: String) = this()
      def this(message: String, claim: String) = this()
      def this(message: String, claim: String, reason: String) = this()
      def this(message: String, claim: Unit, reason: String) = this()
    }
    
    @JSImport("jose", "errors.JWTInvalid")
    @js.native
    open class JWTInvalid ()
      extends typings.jose.distTypesUtilErrorsMod.JWTInvalid {
      def this(message: String) = this()
    }
  }
  
  inline def exportJWK(key: js.typedarray.Uint8Array): js.Promise[JWK] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportJWK")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JWK]]
  inline def exportJWK(key: KeyLike): js.Promise[JWK] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportJWK")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JWK]]
  
  inline def exportPKCS8(key: KeyLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPKCS8")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def exportSPKI(key: KeyLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportSPKI")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt(jwe: FlattenedJWE, key: KeyLike, options: DecryptOptions): js.Promise[FlattenedDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult]]
  inline def flattenedDecrypt[T /* <: KeyLike */](jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey): js.Promise[FlattenedDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey[T]]]
  inline def flattenedDecrypt[T /* <: KeyLike */](jwe: FlattenedJWE, getKey: FlattenedDecryptGetKey, options: DecryptOptions): js.Promise[FlattenedDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedDecryptResult & ResolvedKey[T]]]
  
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify(jws: FlattenedJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[FlattenedVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult]]
  inline def flattenedVerify[T /* <: KeyLike */](jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey): js.Promise[FlattenedVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey[T]]]
  inline def flattenedVerify[T /* <: KeyLike */](jws: FlattenedJWSInput, getKey: FlattenedVerifyGetKey, options: VerifyOptions): js.Promise[FlattenedVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenedVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FlattenedVerifyResult & ResolvedKey[T]]]
  
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: js.typedarray.Uint8Array, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt(jwe: GeneralJWE, key: KeyLike, options: DecryptOptions): js.Promise[GeneralDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult]]
  inline def generalDecrypt[T /* <: KeyLike */](jwe: GeneralJWE, getKey: GeneralDecryptGetKey): js.Promise[GeneralDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey[T]]]
  inline def generalDecrypt[T /* <: KeyLike */](jwe: GeneralJWE, getKey: GeneralDecryptGetKey, options: DecryptOptions): js.Promise[GeneralDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalDecrypt")(jwe.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralDecryptResult & ResolvedKey[T]]]
  
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: js.typedarray.Uint8Array, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify(jws: GeneralJWSInput, key: KeyLike, options: VerifyOptions): js.Promise[GeneralVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult]]
  inline def generalVerify[T /* <: KeyLike */](jws: GeneralJWSInput, getKey: GeneralVerifyGetKey): js.Promise[GeneralVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey[T]]]
  inline def generalVerify[T /* <: KeyLike */](jws: GeneralJWSInput, getKey: GeneralVerifyGetKey, options: VerifyOptions): js.Promise[GeneralVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generalVerify")(jws.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeneralVerifyResult & ResolvedKey[T]]]
  
  inline def generateKeyPair[T /* <: KeyLike */](alg: String): js.Promise[GenerateKeyPairResult[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GenerateKeyPairResult[T]]]
  inline def generateKeyPair[T /* <: KeyLike */](alg: String, options: GenerateKeyPairOptions): js.Promise[GenerateKeyPairResult[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GenerateKeyPairResult[T]]]
  
  inline def generateSecret[T /* <: KeyLike */](alg: String): js.Promise[T | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(alg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  inline def generateSecret[T /* <: KeyLike */](alg: String, options: GenerateSecretOptions): js.Promise[T | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  
  inline def importJWK[T /* <: KeyLike */](jwk: JWK): js.Promise[T | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  inline def importJWK[T /* <: KeyLike */](jwk: JWK, alg: String): js.Promise[T | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  inline def importJWK[T /* <: KeyLike */](jwk: JWK, alg: String, octAsKeyObject: Boolean): js.Promise[T | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  inline def importJWK[T /* <: KeyLike */](jwk: JWK, alg: Unit, octAsKeyObject: Boolean): js.Promise[T | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJWK")(jwk.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], octAsKeyObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | js.typedarray.Uint8Array]]
  
  inline def importPKCS8[T /* <: KeyLike */](pkcs8: String, alg: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def importPKCS8[T /* <: KeyLike */](pkcs8: String, alg: String, options: PEMImportOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importPKCS8")(pkcs8.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def importSPKI[T /* <: KeyLike */](spki: String, alg: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def importSPKI[T /* <: KeyLike */](spki: String, alg: String, options: PEMImportOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importSPKI")(spki.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def importX509[T /* <: KeyLike */](x509: String, alg: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def importX509[T /* <: KeyLike */](x509: String, alg: String, options: PEMImportOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("importX509")(x509.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def jwtDecrypt(jwt: String, key: js.typedarray.Uint8Array): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: js.typedarray.Uint8Array, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: KeyLike): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: String, key: KeyLike, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: KeyLike): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt(jwt: js.typedarray.Uint8Array, key: KeyLike, options: JWTDecryptOptions): js.Promise[JWTDecryptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult]]
  inline def jwtDecrypt[T /* <: KeyLike */](jwt: String, getKey: JWTDecryptGetKey): js.Promise[JWTDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey[T]]]
  inline def jwtDecrypt[T /* <: KeyLike */](jwt: String, getKey: JWTDecryptGetKey, options: JWTDecryptOptions): js.Promise[JWTDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey[T]]]
  inline def jwtDecrypt[T /* <: KeyLike */](jwt: js.typedarray.Uint8Array, getKey: JWTDecryptGetKey): js.Promise[JWTDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey[T]]]
  inline def jwtDecrypt[T /* <: KeyLike */](jwt: js.typedarray.Uint8Array, getKey: JWTDecryptGetKey, options: JWTDecryptOptions): js.Promise[JWTDecryptResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecrypt")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTDecryptResult & ResolvedKey[T]]]
  
  inline def jwtVerify(jwt: String, key: js.typedarray.Uint8Array): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: js.typedarray.Uint8Array, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: KeyLike): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: String, key: KeyLike, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: KeyLike): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify(jwt: js.typedarray.Uint8Array, key: KeyLike, options: JWTVerifyOptions): js.Promise[JWTVerifyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult]]
  inline def jwtVerify[T /* <: KeyLike */](jwt: String, getKey: JWTVerifyGetKey): js.Promise[JWTVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey[T]]]
  inline def jwtVerify[T /* <: KeyLike */](jwt: String, getKey: JWTVerifyGetKey, options: JWTVerifyOptions): js.Promise[JWTVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey[T]]]
  inline def jwtVerify[T /* <: KeyLike */](jwt: js.typedarray.Uint8Array, getKey: JWTVerifyGetKey): js.Promise[JWTVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey[T]]]
  inline def jwtVerify[T /* <: KeyLike */](jwt: js.typedarray.Uint8Array, getKey: JWTVerifyGetKey, options: JWTVerifyOptions): js.Promise[JWTVerifyResult & ResolvedKey[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtVerify")(jwt.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JWTVerifyResult & ResolvedKey[T]]]
}
