package typings.koaJwt.mod

import typings.koa.mod.Context
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  
  var audience: js.UndefOr[String | js.Array[String]] = js.native
  
  var cookie: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var getToken: js.UndefOr[js.Function2[/* ctx */ Context, /* opts */ this.type, String]] = js.native
  
  var isRevoked: js.UndefOr[
    js.Function3[
      /* ctx */ Context, 
      /* decodedToken */ js.Object, 
      /* token */ String, 
      js.Promise[Boolean]
    ]
  ] = js.native
  
  var issuer: js.UndefOr[String | js.Array[String]] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var passthrough: js.UndefOr[Boolean] = js.native
  
  var secret: String | (js.Array[Buffer | String]) | Buffer | SecretLoader = js.native
  
  var tokenKey: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(secret: String | (js.Array[Buffer | String]) | Buffer | SecretLoader): Options = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSecretFunction2(
      value: (/* header */ js.Any, /* payload */ js.Any) => js.Promise[String | (js.Array[Buffer | String]) | Buffer]
    ): Self = this.set("secret", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSecretVarargs(value: (Buffer | String)*): Self = this.set("secret", js.Array(value :_*))
    
    @scala.inline
    def setSecret(value: String | (js.Array[Buffer | String]) | Buffer | SecretLoader): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmsVarargs(value: String*): Self = this.set("algorithms", js.Array(value :_*))
    
    @scala.inline
    def setAlgorithms(value: js.Array[String]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    
    @scala.inline
    def setAudienceVarargs(value: String*): Self = this.set("audience", js.Array(value :_*))
    
    @scala.inline
    def setAudience(value: String | js.Array[String]): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setGetToken(value: (/* ctx */ Context, Options) => String): Self = this.set("getToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetToken: Self = this.set("getToken", js.undefined)
    
    @scala.inline
    def setIsRevoked(
      value: (/* ctx */ Context, /* decodedToken */ js.Object, /* token */ String) => js.Promise[Boolean]
    ): Self = this.set("isRevoked", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIsRevoked: Self = this.set("isRevoked", js.undefined)
    
    @scala.inline
    def setIssuerVarargs(value: String*): Self = this.set("issuer", js.Array(value :_*))
    
    @scala.inline
    def setIssuer(value: String | js.Array[String]): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPassthrough(value: Boolean): Self = this.set("passthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassthrough: Self = this.set("passthrough", js.undefined)
    
    @scala.inline
    def setTokenKey(value: String): Self = this.set("tokenKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenKey: Self = this.set("tokenKey", js.undefined)
  }
}
