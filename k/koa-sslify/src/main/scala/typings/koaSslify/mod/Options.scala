package typings.koaSslify.mod

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Status returned for disallowed methods
    */
  var disallowStatus: js.UndefOr[Double] = js.native
  /**
    * Hostname for redirect (uses request host if not set)
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * Ignore url path (redirect to domain)
    */
  var ignoreUrl: js.UndefOr[Boolean] = js.native
  /**
    * Port of HTTPS server
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Whitelist methods that should be redirected
    */
  var redirectMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Function used to test if request is secure
    */
  var resolver: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.native
  /**
    * Avoid :443 port in redirect url
    */
  var skipDefaultPort: js.UndefOr[Boolean] = js.native
  /**
    * Temporary mode (use 307 Temporary Redirect)
    */
  var temporary: js.UndefOr[Boolean] = js.native
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
    def setDisallowStatus(value: Double): Self = this.set("disallowStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisallowStatus: Self = this.set("disallowStatus", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setIgnoreUrl(value: Boolean): Self = this.set("ignoreUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUrl: Self = this.set("ignoreUrl", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRedirectMethodsVarargs(value: String*): Self = this.set("redirectMethods", js.Array(value :_*))
    @scala.inline
    def setRedirectMethods(value: js.Array[String]): Self = this.set("redirectMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectMethods: Self = this.set("redirectMethods", js.undefined)
    @scala.inline
    def setResolver(value: /* ctx */ Context => Boolean): Self = this.set("resolver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    @scala.inline
    def setSkipDefaultPort(value: Boolean): Self = this.set("skipDefaultPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipDefaultPort: Self = this.set("skipDefaultPort", js.undefined)
    @scala.inline
    def setTemporary(value: Boolean): Self = this.set("temporary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporary: Self = this.set("temporary", js.undefined)
  }
  
}

