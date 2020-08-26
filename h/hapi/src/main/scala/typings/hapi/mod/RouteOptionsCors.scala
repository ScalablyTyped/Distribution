package typings.hapi.mod

import typings.hapi.hapiStrings.Asterisk
import typings.hapi.hapiStrings.ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsCors extends js.Object {
  /**
    * a strings array of additional headers to exposedHeaders. Use this to keep the default headers in place.
    */
  var additionalExposedHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * a strings array of additional headers to headers. Use this to keep the default headers in place.
    */
  var additionalHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * if true, allows user credentials to be sent ('Access-Control-Allow-Credentials'). Defaults to false.
    */
  var credentials: js.UndefOr[Boolean] = js.native
  /**
    * a strings array of exposed headers ('Access-Control-Expose-Headers'). Defaults to ['WWW-Authenticate', 'Server-Authorization'].
    */
  var exposedHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * a strings array of allowed headers ('Access-Control-Allow-Headers'). Defaults to ['Accept', 'Authorization', 'Content-Type', 'If-None-Match'].
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  /**
    * number of seconds the browser should cache the CORS response ('Access-Control-Max-Age'). The greater the value, the longer it will take before the browser checks for changes in policy.
    * Defaults to 86400 (one day).
    */
  var maxAge: js.UndefOr[Double] = js.native
  /**
    * an array of allowed origin servers strings ('Access-Control-Allow-Origin'). The array can contain any combination of fully qualified origins along with origin strings containing a wildcard '*'
    * character, or a single '*' origin string. If set to 'ignore', any incoming Origin header is ignored (present or not) and the 'Access-Control-Allow-Origin' header is set to '*'. Defaults to any
    * origin ['*'].
    */
  var origin: js.UndefOr[js.Array[String] | Asterisk | ignore] = js.native
}

object RouteOptionsCors {
  @scala.inline
  def apply(): RouteOptionsCors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptionsCors]
  }
  @scala.inline
  implicit class RouteOptionsCorsOps[Self <: RouteOptionsCors] (val x: Self) extends AnyVal {
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
    def setAdditionalExposedHeadersVarargs(value: String*): Self = this.set("additionalExposedHeaders", js.Array(value :_*))
    @scala.inline
    def setAdditionalExposedHeaders(value: js.Array[String]): Self = this.set("additionalExposedHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalExposedHeaders: Self = this.set("additionalExposedHeaders", js.undefined)
    @scala.inline
    def setAdditionalHeadersVarargs(value: String*): Self = this.set("additionalHeaders", js.Array(value :_*))
    @scala.inline
    def setAdditionalHeaders(value: js.Array[String]): Self = this.set("additionalHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalHeaders: Self = this.set("additionalHeaders", js.undefined)
    @scala.inline
    def setCredentials(value: Boolean): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setExposedHeadersVarargs(value: String*): Self = this.set("exposedHeaders", js.Array(value :_*))
    @scala.inline
    def setExposedHeaders(value: js.Array[String]): Self = this.set("exposedHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposedHeaders: Self = this.set("exposedHeaders", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setOriginVarargs(value: String*): Self = this.set("origin", js.Array(value :_*))
    @scala.inline
    def setOrigin(value: js.Array[String] | Asterisk | ignore): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

