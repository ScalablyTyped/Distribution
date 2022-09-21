package typings.jws

import org.scalablytyped.runtime.StringDictionary
import typings.jws.jwsStrings.ES256
import typings.jws.jwsStrings.ES384
import typings.jws.jwsStrings.ES512
import typings.jws.jwsStrings.HS256
import typings.jws.jwsStrings.HS384
import typings.jws.jwsStrings.HS512
import typings.jws.jwsStrings.PS256
import typings.jws.jwsStrings.PS384
import typings.jws.jwsStrings.PS512
import typings.jws.jwsStrings.RS256
import typings.jws.jwsStrings.RS384
import typings.jws.jwsStrings.RS512
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jws", "ALGORITHMS")
  @js.native
  val ALGORITHMS: js.Tuple12[HS256, HS384, HS512, RS256, RS384, RS512, PS256, PS384, PS512, ES256, ES384, ES512] = js.native
  
  inline def createSign(options: SignOptions): SignStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(options.asInstanceOf[js.Any]).asInstanceOf[SignStream]
  
  inline def createVerify(): VerifyStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")().asInstanceOf[VerifyStream]
  inline def createVerify(options: VerifyOptions): VerifyStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(options.asInstanceOf[js.Any]).asInstanceOf[VerifyStream]
  
  inline def decode(signature: String): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(signature.asInstanceOf[js.Any]).asInstanceOf[Signature]
  
  inline def isValid(signature: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(signature.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def sign(options: SignOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def verify(signature: String, algorithm: Algorithm, secretOrKey: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(signature.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], secretOrKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(signature: String, algorithm: Algorithm, secretOrKey: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(signature.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], secretOrKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jws.jwsStrings.HS256
    - typings.jws.jwsStrings.HS384
    - typings.jws.jwsStrings.HS512
    - typings.jws.jwsStrings.RS256
    - typings.jws.jwsStrings.RS384
    - typings.jws.jwsStrings.RS512
    - typings.jws.jwsStrings.PS256
    - typings.jws.jwsStrings.PS384
    - typings.jws.jwsStrings.PS512
    - typings.jws.jwsStrings.ES256
    - typings.jws.jwsStrings.ES384
    - typings.jws.jwsStrings.ES512
    - typings.jws.jwsStrings.none
  */
  trait Algorithm extends StObject
  
  trait CertificateProperties
    extends StObject
       with PrivateProperties {
    
    var kid: js.UndefOr[String] = js.undefined
    
    var x5c: js.UndefOr[js.Array[String]] = js.undefined
    
    var x5t: js.UndefOr[String] = js.undefined
    
    @JSName("x5t#S256")
    var x5tNumbersignS256: js.UndefOr[String] = js.undefined
    
    var x5u: js.UndefOr[String] = js.undefined
  }
  object CertificateProperties {
    
    inline def apply(): CertificateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateProperties]
    }
    
    extension [Self <: CertificateProperties](x: Self) {
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setX5c(value: js.Array[String]): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
      
      inline def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
      
      inline def setX5cVarargs(value: String*): Self = StObject.set(x, "x5c", js.Array(value*))
      
      inline def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
      
      inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
      
      inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
      
      inline def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
      
      inline def setX5u(value: String): Self = StObject.set(x, "x5u", value.asInstanceOf[js.Any])
      
      inline def setX5uUndefined: Self = StObject.set(x, "x5u", js.undefined)
    }
  }
  
  trait Header
    extends StObject
       with CertificateProperties {
    
    var alg: Algorithm
    
    var crit: js.UndefOr[js.Array[String]] = js.undefined
    
    var cty: js.UndefOr[String] = js.undefined
    
    var jwk: js.UndefOr[JWK] = js.undefined
    
    var typ: js.UndefOr[String] = js.undefined
  }
  object Header {
    
    inline def apply(alg: Algorithm): Header = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setAlg(value: Algorithm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value*))
      
      inline def setCty(value: String): Self = StObject.set(x, "cty", value.asInstanceOf[js.Any])
      
      inline def setCtyUndefined: Self = StObject.set(x, "cty", js.undefined)
      
      inline def setJwk(value: JWK): Self = StObject.set(x, "jwk", value.asInstanceOf[js.Any])
      
      inline def setJwkUndefined: Self = StObject.set(x, "jwk", js.undefined)
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
    }
  }
  
  trait JWK
    extends StObject
       with CertificateProperties {
    
    var alg: js.UndefOr[Algorithm] = js.undefined
    
    var key_ops: js.UndefOr[js.Array[String]] = js.undefined
    
    var kty: String
    
    var use: js.UndefOr[String] = js.undefined
  }
  object JWK {
    
    inline def apply(kty: String): JWK = {
      val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWK]
    }
    
    extension [Self <: JWK](x: Self) {
      
      inline def setAlg(value: Algorithm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setKey_ops(value: js.Array[String]): Self = StObject.set(x, "key_ops", value.asInstanceOf[js.Any])
      
      inline def setKey_opsUndefined: Self = StObject.set(x, "key_ops", js.undefined)
      
      inline def setKey_opsVarargs(value: String*): Self = StObject.set(x, "key_ops", js.Array(value*))
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
  
  type PrivateProperties = StringDictionary[Any]
  
  trait SignOptions extends StObject {
    
    var encoding: js.UndefOr[String | Buffer | Readable] = js.undefined
    
    var header: Header
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var key: js.UndefOr[Any] = js.undefined
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var payload: js.UndefOr[Any] = js.undefined
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var privateKey: js.UndefOr[Any] = js.undefined
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var secret: js.UndefOr[Any] = js.undefined
  }
  object SignOptions {
    
    inline def apply(header: Header): SignOptions = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOptions]
    }
    
    extension [Self <: SignOptions](x: Self) {
      
      inline def setEncoding(value: String | Buffer | Readable): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setPrivateKey(value: Any): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setSecret(value: Any): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
  
  @js.native
  trait SignStream extends Readable {
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var key: Any = js.native
    
    /**
      * A Writable Stream that expects the JWS payload. Do not
      * use if you passed a payload option to the constructor.
      *
      *  Example: payloadStream.pipe(signer.payload);
      */
    var payload: Writable = js.native
    
    /**
      * A Writable Stream. Expects the JWS secret for HMAC, or
      * the privateKey for ECDSA and RSA. Do not use if you
      * passed a secret or key option to the constructor.
      *
      * Example: privateKeyStream.pipe(signer.privateKey);
      */
    var privateKey: Any = js.native
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var secret: Any = js.native
  }
  
  trait Signature extends StObject {
    
    var header: Header
    
    var payload: Any
    
    var signature: String
  }
  object Signature {
    
    inline def apply(header: Header, payload: Any, signature: String): Signature = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signature]
    }
    
    extension [Self <: Signature](x: Self) {
      
      inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerifyOptions extends StObject {
    
    var algorithm: js.UndefOr[Algorithm | Buffer | Readable] = js.undefined
    
    var encoding: js.UndefOr[String | Buffer | Readable] = js.undefined
    
    var key: js.UndefOr[String | Readable | Buffer] = js.undefined
    
    var publicKey: js.UndefOr[String | Readable | Buffer] = js.undefined
    
    var secret: js.UndefOr[String | Readable | Buffer] = js.undefined
    
    var signature: js.UndefOr[String | Buffer | Readable] = js.undefined
  }
  object VerifyOptions {
    
    inline def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    extension [Self <: VerifyOptions](x: Self) {
      
      inline def setAlgorithm(value: Algorithm | Buffer | Readable): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setEncoding(value: String | Buffer | Readable): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setKey(value: String | Readable | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPublicKey(value: String | Readable | Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setSecret(value: String | Readable | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setSignature(value: String | Buffer | Readable): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    }
  }
  
  @js.native
  trait VerifyStream extends EventEmitter {
    
    /**
      * Key.  Can be a string, buffer, or object.
      */
    var key: Any = js.native
    
    /**
      * A Writable Stream that expects a public key or secret.
      * Do not use if you passed a key or secret option to the
      * constructor.
      */
    var publicKey: Writable = js.native
    
    /**
      * Secret.  Can be a string, buffer, or object.
      */
    var secret: Any = js.native
    
    /**
      * A Writable Stream that expects a JWS Signature. Do not
      * use if you passed a signature option to the constructor.
      */
    var signature: Writable = js.native
  }
}
