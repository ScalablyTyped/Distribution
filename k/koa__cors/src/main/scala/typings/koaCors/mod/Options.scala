package typings.koaCors.mod

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Middleware configration options.
  */
@js.native
trait Options extends js.Object {
  
  /**
    * `Access-Control-Allow-Headers`
    */
  var allowHeaders: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * `Access-Control-Allow-Methods`, default is
    * 'GET,HEAD,PUT,POST,DELETE,PATCH'
    */
  var allowMethods: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * `Access-Control-Allow-Credentials`
    */
  var credentials: js.UndefOr[Boolean] = js.native
  
  /**
    * `Access-Control-Expose-Headers`
    */
  var exposeHeaders: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * Add set headers to `err.header` if an error is thrown
    */
  var keepHeadersOnError: js.UndefOr[Boolean] = js.native
  
  /**
    * `Access-Control-Max-Age` in seconds
    */
  var maxAge: js.UndefOr[Double | String] = js.native
  
  /**
    * `Access-Control-Allow-Origin`, default is request Origin header.
    *
    * @remarks
    * If a function is provided, it will be called for each request with
    * the koa context object. It may return a string or a promise that
    * will resolve with a string.
    */
  var origin: js.UndefOr[(js.Function1[/* ctx */ Context, String | js.Thenable[String]]) | String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setAllowHeadersVarargs(value: String*): Self = this.set("allowHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowHeaders(value: js.Array[String] | String): Self = this.set("allowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHeaders: Self = this.set("allowHeaders", js.undefined)
    
    @scala.inline
    def setAllowMethodsVarargs(value: String*): Self = this.set("allowMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowMethods(value: js.Array[String] | String): Self = this.set("allowMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMethods: Self = this.set("allowMethods", js.undefined)
    
    @scala.inline
    def setCredentials(value: Boolean): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: String*): Self = this.set("exposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: js.Array[String] | String): Self = this.set("exposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposeHeaders: Self = this.set("exposeHeaders", js.undefined)
    
    @scala.inline
    def setKeepHeadersOnError(value: Boolean): Self = this.set("keepHeadersOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepHeadersOnError: Self = this.set("keepHeadersOnError", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double | String): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setOriginFunction1(value: /* ctx */ Context => String | js.Thenable[String]): Self = this.set("origin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrigin(value: (js.Function1[/* ctx */ Context, String | js.Thenable[String]]) | String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
}
