package typings.jwtThen

import typings.jwtThen.anon.Key
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwt-then", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sign(payload: String, secretOrPrivateKey: Secret): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def sign(payload: js.Object, secretOrPrivateKey: Secret): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def sign(payload: Buffer, secretOrPrivateKey: Secret): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], secretOrPrivateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def verify(token: String, secretOrPublicKey: String): js.Promise[js.Object | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object | String]]
  @scala.inline
  def verify(token: String, secretOrPublicKey: Buffer): js.Promise[js.Object | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object | String]]
  
  type Secret = String | Buffer | Key
  
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
    var algorithm: js.UndefOr[String] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var expiresIn: js.UndefOr[String | Double] = js.undefined
    
    var header: js.UndefOr[js.Object] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jwtid: js.UndefOr[String] = js.undefined
    
    var keyid: js.UndefOr[String] = js.undefined
    
    var noTimestamp: js.UndefOr[Boolean] = js.undefined
    
    /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var notBefore: js.UndefOr[String | Double] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object SignOptions {
    
    @scala.inline
    def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit class SignOptionsMutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: String | Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      @scala.inline
      def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
      
      @scala.inline
      def setNoTimestamp(value: Boolean): Self = StObject.set(x, "noTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTimestampUndefined: Self = StObject.set(x, "noTimestamp", js.undefined)
      
      @scala.inline
      def setNotBefore(value: String | Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
