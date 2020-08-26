package typings.hapiCookie.mod

import typings.hapiCookie.anon.ServerStateCookieOptionsn
import typings.hapiHapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to 'hapi.auth.strategy' when this plugin is used
  */
@js.native
trait Options extends js.Object {
  /**
    * Only works if 'redirectTo' is true
    * If set to true, a string, or an object, appends the current request path to the query component of the 'redirectTo' URI.
    */
  var appendNext: js.UndefOr[Boolean | String] = js.native
  /**
    * Cookie options.
    *
    * @default { name: 'sid', clearInvalid: false, isSameSite: 'Strict', isSecure: true, isHttpOnly: true }
    */
  var cookie: js.UndefOr[ServerStateCookieOptionsn] = js.native
  /**
    * Automatically sets the session cookie after validation to extend the current session for a new TTL duration.
    *
    * @default false
    */
  var keepAlive: js.UndefOr[Boolean] = js.native
  /**
    * Login URI or function that returns a URI to redirect unauthenticated requests to.
    * Note that it will only trigger when the authentication mode is 'required'.
    * Defaults to no redirection.
    */
  var redirectTo: js.UndefOr[String | RedirectToFunction] = js.native
  /**
    * A name to use with decorating the request object.
    * Using multiple decorator names for separate authentication strategies could allow a developer to call the methods for the wrong strategy.
    * Potentially resulting in unintended authorized access.
    *
    * @default 'cookieAuth'
    */
  var requestDecoratorName: js.UndefOr[String] = js.native
  /**
    * An optional session validation function used to validate the content of the session cookie on each request.
    * Used to verify that the internal session state is still valid (e.g. user account still exists).
    */
  var validateFunc: js.UndefOr[ValidateFunction] = js.native
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
    def setAppendNext(value: Boolean | String): Self = this.set("appendNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendNext: Self = this.set("appendNext", js.undefined)
    @scala.inline
    def setCookie(value: ServerStateCookieOptionsn): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setRedirectToFunction1(value: /* request */ js.UndefOr[Request] => String): Self = this.set("redirectTo", js.Any.fromFunction1(value))
    @scala.inline
    def setRedirectTo(value: String | RedirectToFunction): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
    @scala.inline
    def setRequestDecoratorName(value: String): Self = this.set("requestDecoratorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestDecoratorName: Self = this.set("requestDecoratorName", js.undefined)
    @scala.inline
    def setValidateFunc(
      value: (/* request */ js.UndefOr[Request], /* session */ js.UndefOr[js.Object]) => js.Promise[ValidateResponse]
    ): Self = this.set("validateFunc", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidateFunc: Self = this.set("validateFunc", js.undefined)
  }
  
}

