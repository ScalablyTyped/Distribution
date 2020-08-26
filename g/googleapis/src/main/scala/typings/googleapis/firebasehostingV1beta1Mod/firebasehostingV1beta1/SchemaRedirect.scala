package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A [`redirect`](/docs/hosting/full-config#redirects) represents the
  * configuration for returning an HTTP redirect response given a matching
  * request URL path.
  */
@js.native
trait SchemaRedirect extends js.Object {
  /**
    * Required. The user-supplied [glob
    * pattern](/docs/hosting/full-config#glob_pattern_matching) to match
    * against the request URL path.
    */
  var glob: js.UndefOr[String] = js.native
  /**
    * Required. The value to put in the HTTP location header of the response.
    * &lt;br&gt;The location can contain capture group values from the pattern
    * using a `:` prefix to identify the segment and an optional `*` to capture
    * the rest of the URL. For example: &lt;code&gt;&quot;glob&quot;:
    * &quot;/:capture*&quot;, &lt;br&gt;&quot;statusCode&quot;: 301,
    * &lt;br&gt;&quot;location&quot;:
    * &quot;https://example.com/foo/:capture&quot;&lt;/code&gt;
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Required. The status HTTP code to return in the response. It must be a
    * valid 3xx status code.
    */
  var statusCode: js.UndefOr[Double] = js.native
}

object SchemaRedirect {
  @scala.inline
  def apply(): SchemaRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRedirect]
  }
  @scala.inline
  implicit class SchemaRedirectOps[Self <: SchemaRedirect] (val x: Self) extends AnyVal {
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
    def setGlob(value: String): Self = this.set("glob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlob: Self = this.set("glob", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

