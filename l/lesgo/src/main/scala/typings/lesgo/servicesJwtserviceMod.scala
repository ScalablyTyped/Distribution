package typings.lesgo

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jsonwebtoken.anon.DecodeOptionscompletetrue
import typings.jsonwebtoken.anon.DecodeOptionsjsontrue
import typings.jsonwebtoken.anon.VerifyOptionscompletefals
import typings.jsonwebtoken.anon.VerifyOptionscompletetrue
import typings.jsonwebtoken.mod.DecodeOptions
import typings.jsonwebtoken.mod.GetPublicKeyOrSecret
import typings.jsonwebtoken.mod.Jwt
import typings.jsonwebtoken.mod.JwtPayload
import typings.jsonwebtoken.mod.Secret
import typings.jsonwebtoken.mod.SignCallback
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyCallback
import typings.jsonwebtoken.mod.VerifyOptions
import typings.lesgo.anon.Data
import typings.lesgo.anon.Validate
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesJwtserviceMod {
  
  @JSImport("lesgo/services/JWTService", JSImport.Default)
  @js.native
  open class default[TDecoded /* <: js.Object | String */] protected ()
    extends StObject
       with JWTService[TDecoded] {
    def this(token: String, config: Config[TDecoded]) = this()
    
    /* protected */ /* CompleteClass */
    var decoded: TDecoded = js.native
    
    /* CompleteClass */
    override def jwt(): JWTPackage = js.native
    
    /* protected */ /* CompleteClass */
    var jwtpkg: JWTPackage = js.native
    
    /* protected */ /* CompleteClass */
    var settings: typings.lesgo.anon.Config[TDecoded] = js.native
    
    /* CompleteClass */
    override def validate(): JWTService[TDecoded] = js.native
  }
  
  trait Config[T] extends StObject {
    
    var customClaims: Validate[T]
    
    var iss: Data
    
    var secret: Secret
  }
  object Config {
    
    inline def apply[T](customClaims: Validate[T], iss: Data, secret: Secret): Config[T] = {
      val __obj = js.Dynamic.literal(customClaims = customClaims.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config[?], T] (val x: Self & Config[T]) extends AnyVal {
      
      inline def setCustomClaims(value: Validate[T]): Self = StObject.set(x, "customClaims", value.asInstanceOf[js.Any])
      
      inline def setIss(value: Data): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: Secret): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JWTPackage extends StObject {
    
    var JsonWebTokenError: Instantiable1[/* message */ String, typings.jsonwebtoken.mod.JsonWebTokenError] = js.native
    
    var NotBeforeError: Instantiable2[/* message */ String, /* date */ js.Date, typings.jsonwebtoken.mod.NotBeforeError] = js.native
    
    var TokenExpiredError: Instantiable2[
        /* message */ String, 
        /* expiredAt */ js.Date, 
        typings.jsonwebtoken.mod.TokenExpiredError
      ] = js.native
    
    def decode(token: String): Null | JwtPayload | String = js.native
    def decode(token: String, options: DecodeOptionscompletetrue): Null | Jwt = js.native
    def decode(token: String, options: DecodeOptionsjsontrue): Null | JwtPayload = js.native
    def decode(token: String, options: DecodeOptions): Null | JwtPayload | String = js.native
    
    def sign(payload: String, secretOrPrivateKey: Secret): String = js.native
    def sign(payload: String, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
    def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
    def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    def sign(payload: js.Object, secretOrPrivateKey: Secret): String = js.native
    def sign(payload: js.Object, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
    def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
    def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    def sign(payload: Buffer, secretOrPrivateKey: Secret): String = js.native
    def sign(payload: Buffer, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
    def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
    def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
    
    def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      callback: VerifyCallback[JwtPayload | String]
    ): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      options: Unit,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptionscompletefals): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      options: VerifyOptionscompletefals,
      callback: VerifyCallback[JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptionscompletetrue): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      options: VerifyOptionscompletetrue,
      callback: VerifyCallback[Jwt]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptions): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: GetPublicKeyOrSecret,
      options: VerifyOptions,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: Secret): JwtPayload | String = js.native
    def verify(token: String, secretOrPublicKey: Secret, callback: VerifyCallback[JwtPayload | String]): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: Secret,
      options: Unit,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletefals): JwtPayload | String = js.native
    def verify(
      token: String,
      secretOrPublicKey: Secret,
      options: VerifyOptionscompletefals,
      callback: VerifyCallback[JwtPayload | String]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletetrue): Unit = js.native
    def verify(
      token: String,
      secretOrPublicKey: Secret,
      options: VerifyOptionscompletetrue,
      callback: VerifyCallback[Jwt]
    ): Unit = js.native
    def verify(token: String, secretOrPublicKey: Secret, options: VerifyOptions): Jwt | JwtPayload | String = js.native
    def verify(
      token: String,
      secretOrPublicKey: Secret,
      options: VerifyOptions,
      callback: VerifyCallback[Jwt | JwtPayload | String]
    ): Unit = js.native
    @JSName("verify")
    def verify_Jwt(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletetrue): Jwt = js.native
    @JSName("verify")
    def verify_Unit(token: String, secretOrPublicKey: Secret): Unit = js.native
    @JSName("verify")
    def verify_Unit(token: String, secretOrPublicKey: Secret, options: VerifyOptionscompletefals): Unit = js.native
    @JSName("verify")
    def verify_Unit(token: String, secretOrPublicKey: Secret, options: VerifyOptions): Unit = js.native
  }
  
  trait JWTService[TDecoded /* <: js.Object | String */] extends StObject {
    
    /* protected */ var decoded: TDecoded
    
    def jwt(): JWTPackage
    
    /* protected */ var jwtpkg: JWTPackage
    
    /* protected */ var settings: typings.lesgo.anon.Config[TDecoded]
    
    def validate(): JWTService[TDecoded]
  }
  object JWTService {
    
    inline def apply[TDecoded /* <: js.Object | String */](
      decoded: TDecoded,
      jwt: () => JWTPackage,
      jwtpkg: JWTPackage,
      settings: typings.lesgo.anon.Config[TDecoded],
      validate: () => JWTService[TDecoded]
    ): JWTService[TDecoded] = {
      val __obj = js.Dynamic.literal(decoded = decoded.asInstanceOf[js.Any], jwt = js.Any.fromFunction0(jwt), jwtpkg = jwtpkg.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[JWTService[TDecoded]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JWTService[?], TDecoded /* <: js.Object | String */] (val x: Self & JWTService[TDecoded]) extends AnyVal {
      
      inline def setDecoded(value: TDecoded): Self = StObject.set(x, "decoded", value.asInstanceOf[js.Any])
      
      inline def setJwt(value: () => JWTPackage): Self = StObject.set(x, "jwt", js.Any.fromFunction0(value))
      
      inline def setJwtpkg(value: JWTPackage): Self = StObject.set(x, "jwtpkg", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: typings.lesgo.anon.Config[TDecoded]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: () => JWTService[TDecoded]): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
}
