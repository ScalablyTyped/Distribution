package typings.jsonwebtoken

import org.scalablytyped.runtime.StringDictionary
import typings.jsonwebtoken.anon.DecodeOptionscompletetrue
import typings.jsonwebtoken.anon.DecodeOptionsjsontrue
import typings.jsonwebtoken.anon.Key
import typings.jsonwebtoken.anon.VerifyOptionscompletefals
import typings.jsonwebtoken.anon.VerifyOptionscompletetrue
import typings.jsonwebtoken.jsonwebtokenStrings.alg
import typings.jsonwebtoken.jsonwebtokenStrings.crit
import typings.jsonwebtoken.jsonwebtokenStrings.cty
import typings.jsonwebtoken.jsonwebtokenStrings.jku
import typings.jsonwebtoken.jsonwebtokenStrings.kid
import typings.jsonwebtoken.jsonwebtokenStrings.typ
import typings.jsonwebtoken.jsonwebtokenStrings.x5c
import typings.jsonwebtoken.jsonwebtokenStrings.x5t
import typings.jsonwebtoken.jsonwebtokenStrings.x5tNumbersignS256
import typings.jsonwebtoken.jsonwebtokenStrings.x5u
import typings.node.bufferMod.global.Buffer
import typings.std.Error
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonwebtoken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsonwebtoken", "JsonWebTokenError")
  @js.native
  open class JsonWebTokenError protected ()
    extends StObject
       with Error
       with VerifyErrors {
    def this(message: String) = this()
    def this(message: String, error: js.Error) = this()
    
    var inner: js.Error = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jsonwebtoken.mod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "NotBeforeError")
  @js.native
  open class NotBeforeError protected () extends JsonWebTokenError {
    def this(message: String, date: js.Date) = this()
    
    var date: js.Date = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jsonwebtoken.mod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "TokenExpiredError")
  @js.native
  open class TokenExpiredError protected () extends JsonWebTokenError {
    def this(message: String, expiredAt: js.Date) = this()
    
    var expiredAt: js.Date = js.native
  }
  
  inline def decode(token: String): Null | JwtPayload | String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any]).asInstanceOf[Null | JwtPayload | String]
  inline def decode(token: String, options: DecodeOptionscompletetrue): Null | Jwt = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null | Jwt]
  inline def decode(token: String, options: DecodeOptionsjsontrue): Null | JwtPayload = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null | JwtPayload]
  inline def decode(token: String, options: DecodeOptions): Null | JwtPayload | String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null | JwtPayload | String]
  
  inline def sign(payload: String, secretOrPrivateKey: Secret): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: String, secretOrPrivateKey: Secret, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: js.Object, secretOrPrivateKey: Secret): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: js.Object, secretOrPrivateKey: Secret, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: Buffer, secretOrPrivateKey: Secret): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Buffer, secretOrPrivateKey: Secret, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(
    token: String,
    secretOrPublicKey: GetPublicKeyOrSecret,
    callback: VerifyCallback[JwtPayload | String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(
    token: String,
    secretOrPublicKey: GetPublicKeyOrSecret,
    options: Unit,
    callback: VerifyCallback[Jwt | JwtPayload | String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptionscompletefals): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(
    token: String,
    secretOrPublicKey: GetPublicKeyOrSecret,
    options: VerifyOptionscompletefals,
    callback: VerifyCallback[JwtPayload | String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptionscompletetrue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(
    token: String,
    secretOrPublicKey: GetPublicKeyOrSecret,
    options: VerifyOptionscompletetrue,
    callback: VerifyCallback[Jwt]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(
    token: String,
    secretOrPublicKey: GetPublicKeyOrSecret,
    options: VerifyOptions,
    callback: VerifyCallback[Jwt | JwtPayload | String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: Secret): JwtPayload | String = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[JwtPayload | String]
  inline def verify(token: String, secretOrPublicKey: Secret, callback: VerifyCallback[JwtPayload | String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(
    token: String,
    secretOrPublicKey: Secret,
    options: Unit,
    callback: VerifyCallback[Jwt | JwtPayload | String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletefals): JwtPayload | String = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JwtPayload | String]
  inline def verify(
    token: String,
    secretOrPublicKey: Secret,
    options: VerifyOptionscompletefals,
    callback: VerifyCallback[JwtPayload | String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletetrue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(
    token: String,
    secretOrPublicKey: Secret,
    options: VerifyOptionscompletetrue,
    callback: VerifyCallback[Jwt]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptions): Jwt | JwtPayload | String = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Jwt | JwtPayload | String]
  inline def verify(
    token: String,
    secretOrPublicKey: Secret,
    options: VerifyOptions,
    callback: VerifyCallback[Jwt | JwtPayload | String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def verify_Jwt(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletetrue): Jwt = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Jwt]
  
  inline def verify_Unit(token: String, secretOrPublicKey: Secret): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify_Unit(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletefals): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def verify_Unit(token: String, secretOrPublicKey: Secret, options: VerifyOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonwebtoken.jsonwebtokenStrings.HS256
    - typings.jsonwebtoken.jsonwebtokenStrings.HS384
    - typings.jsonwebtoken.jsonwebtokenStrings.HS512
    - typings.jsonwebtoken.jsonwebtokenStrings.RS256
    - typings.jsonwebtoken.jsonwebtokenStrings.RS384
    - typings.jsonwebtoken.jsonwebtokenStrings.RS512
    - typings.jsonwebtoken.jsonwebtokenStrings.ES256
    - typings.jsonwebtoken.jsonwebtokenStrings.ES384
    - typings.jsonwebtoken.jsonwebtokenStrings.ES512
    - typings.jsonwebtoken.jsonwebtokenStrings.PS256
    - typings.jsonwebtoken.jsonwebtokenStrings.PS384
    - typings.jsonwebtoken.jsonwebtokenStrings.PS512
    - typings.jsonwebtoken.jsonwebtokenStrings.none
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def ES256: typings.jsonwebtoken.jsonwebtokenStrings.ES256 = "ES256".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.ES256]
    
    inline def ES384: typings.jsonwebtoken.jsonwebtokenStrings.ES384 = "ES384".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.ES384]
    
    inline def ES512: typings.jsonwebtoken.jsonwebtokenStrings.ES512 = "ES512".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.ES512]
    
    inline def HS256: typings.jsonwebtoken.jsonwebtokenStrings.HS256 = "HS256".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.HS256]
    
    inline def HS384: typings.jsonwebtoken.jsonwebtokenStrings.HS384 = "HS384".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.HS384]
    
    inline def HS512: typings.jsonwebtoken.jsonwebtokenStrings.HS512 = "HS512".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.HS512]
    
    inline def PS256: typings.jsonwebtoken.jsonwebtokenStrings.PS256 = "PS256".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.PS256]
    
    inline def PS384: typings.jsonwebtoken.jsonwebtokenStrings.PS384 = "PS384".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.PS384]
    
    inline def PS512: typings.jsonwebtoken.jsonwebtokenStrings.PS512 = "PS512".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.PS512]
    
    inline def RS256: typings.jsonwebtoken.jsonwebtokenStrings.RS256 = "RS256".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.RS256]
    
    inline def RS384: typings.jsonwebtoken.jsonwebtokenStrings.RS384 = "RS384".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.RS384]
    
    inline def RS512: typings.jsonwebtoken.jsonwebtokenStrings.RS512 = "RS512".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.RS512]
    
    inline def none: typings.jsonwebtoken.jsonwebtokenStrings.none = "none".asInstanceOf[typings.jsonwebtoken.jsonwebtokenStrings.none]
  }
  
  trait DecodeOptions extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptions {
    
    inline def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodeOptions] (val x: Self) extends AnyVal {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  type GetPublicKeyOrSecret = js.Function2[/* header */ JwtHeader, /* callback */ SigningKeyCallback, Unit]
  
  trait Jwt extends StObject {
    
    var header: JwtHeader
    
    var payload: JwtPayload | String
    
    var signature: String
  }
  object Jwt {
    
    inline def apply(header: JwtHeader, payload: JwtPayload | String, signature: String): Jwt = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Jwt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Jwt] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: JwtHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: JwtPayload | String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait JwtHeader extends StObject {
    
    var alg: String | Algorithm
    
    var crit: js.UndefOr[
        js.Array[
          String | (Exclude[
            alg | typ | cty | typings.jsonwebtoken.jsonwebtokenStrings.crit | kid | jku | x5u | x5tNumbersignS256 | x5t | x5c, 
            typings.jsonwebtoken.jsonwebtokenStrings.crit
          ])
        ]
      ] = js.undefined
    
    var cty: js.UndefOr[String] = js.undefined
    
    var jku: js.UndefOr[String] = js.undefined
    
    var kid: js.UndefOr[String] = js.undefined
    
    var typ: js.UndefOr[String] = js.undefined
    
    var x5c: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var x5t: js.UndefOr[String] = js.undefined
    
    @JSName("x5t#S256")
    var x5tNumbersignS256: js.UndefOr[String] = js.undefined
    
    var x5u: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object JwtHeader {
    
    inline def apply(alg: String | Algorithm): JwtHeader = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JwtHeader] (val x: Self) extends AnyVal {
      
      inline def setAlg(value: String | Algorithm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setCrit(
        value: js.Array[
              String | (Exclude[alg | typ | cty | crit | kid | jku | x5u | x5tNumbersignS256 | x5t | x5c, crit])
            ]
      ): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(
        value: (String | (Exclude[alg | typ | cty | crit | kid | jku | x5u | x5tNumbersignS256 | x5t | x5c, crit]))*
      ): Self = StObject.set(x, "crit", js.Array(value*))
      
      inline def setCty(value: String): Self = StObject.set(x, "cty", value.asInstanceOf[js.Any])
      
      inline def setCtyUndefined: Self = StObject.set(x, "cty", js.undefined)
      
      inline def setJku(value: String): Self = StObject.set(x, "jku", value.asInstanceOf[js.Any])
      
      inline def setJkuUndefined: Self = StObject.set(x, "jku", js.undefined)
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
      
      inline def setX5c(value: String | js.Array[String]): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
      
      inline def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
      
      inline def setX5cVarargs(value: String*): Self = StObject.set(x, "x5c", js.Array(value*))
      
      inline def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
      
      inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
      
      inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
      
      inline def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
      
      inline def setX5u(value: String | js.Array[String]): Self = StObject.set(x, "x5u", value.asInstanceOf[js.Any])
      
      inline def setX5uUndefined: Self = StObject.set(x, "x5u", js.undefined)
      
      inline def setX5uVarargs(value: String*): Self = StObject.set(x, "x5u", js.Array(value*))
    }
  }
  
  trait JwtPayload
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var aud: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var exp: js.UndefOr[Double] = js.undefined
    
    var iat: js.UndefOr[Double] = js.undefined
    
    var iss: js.UndefOr[String] = js.undefined
    
    var jti: js.UndefOr[String] = js.undefined
    
    var nbf: js.UndefOr[Double] = js.undefined
    
    var sub: js.UndefOr[String] = js.undefined
  }
  object JwtPayload {
    
    inline def apply(): JwtPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JwtPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JwtPayload] (val x: Self) extends AnyVal {
      
      inline def setAud(value: String | js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
      
      inline def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value*))
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
      
      inline def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    }
  }
  
  type Secret = String | Buffer | Key
  
  type SignCallback = js.Function2[/* error */ js.Error | Null, /* encoded */ js.UndefOr[String], Unit]
  
  trait SignOptions extends StObject {
    
    /**
      * Signature algorithm. Could be one of these values :
      * - HS256:    HMAC using SHA-256 hash algorithm (default)
      * - HS384:    HMAC using SHA-384 hash algorithm
      * - HS512:    HMAC using SHA-512 hash algorithm
      * - RS256:    RSASSA using SHA-256 hash algorithm
      * - RS384:    RSASSA using SHA-384 hash algorithm
      * - RS512:    RSASSA using SHA-512 hash algorithm
      * - ES256:    ECDSA using P-256 curve and SHA-256 hash algorithm
      * - ES384:    ECDSA using P-384 curve and SHA-384 hash algorithm
      * - ES512:    ECDSA using P-521 curve and SHA-512 hash algorithm
      * - none:     No digital signature or MAC value included
      */
    var algorithm: js.UndefOr[Algorithm] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var expiresIn: js.UndefOr[String | Double] = js.undefined
    
    var header: js.UndefOr[JwtHeader] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    var keyid: js.UndefOr[String] = js.undefined
    
    var mutatePayload: js.UndefOr[Boolean] = js.undefined
    
    var noTimestamp: js.UndefOr[Boolean] = js.undefined
    
    /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var notBefore: js.UndefOr[String | Double] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object SignOptions {
    
    inline def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExpiresIn(value: String | Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setHeader(value: JwtHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      inline def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
      
      inline def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
      
      inline def setMutatePayload(value: Boolean): Self = StObject.set(x, "mutatePayload", value.asInstanceOf[js.Any])
      
      inline def setMutatePayloadUndefined: Self = StObject.set(x, "mutatePayload", js.undefined)
      
      inline def setNoTimestamp(value: Boolean): Self = StObject.set(x, "noTimestamp", value.asInstanceOf[js.Any])
      
      inline def setNoTimestampUndefined: Self = StObject.set(x, "noTimestamp", js.undefined)
      
      inline def setNotBefore(value: String | Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  type SigningKeyCallback = js.Function2[/* error */ js.Error | Null, /* signingKey */ js.UndefOr[Secret], Unit]
  
  type VerifyCallback[T] = js.Function2[/* error */ VerifyErrors | Null, /* decoded */ js.UndefOr[T], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonwebtoken.mod.JsonWebTokenError
    - typings.jsonwebtoken.mod.NotBeforeError
    - typings.jsonwebtoken.mod.TokenExpiredError
  */
  trait VerifyErrors extends StObject
  
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[Algorithm]] = js.undefined
    
    var audience: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var clockTolerance: js.UndefOr[Double] = js.undefined
    
    /** return an object with the decoded `{ payload, header, signature }` instead of only the usual content of the payload. */
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[String | Double] = js.undefined
    
    /**
      * If you want to check `nonce` claim, provide a string value here.
      * It is used on Open ID for the ID Tokens. ([Open ID implementation notes](https://openid.net/specs/openid-connect-core-1_0.html#NonceNotes))
      */
    var nonce: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object VerifyOptions {
    
    inline def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAudience(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      inline def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value*))
      
      inline def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      inline def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      inline def setMaxAge(value: String | Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
