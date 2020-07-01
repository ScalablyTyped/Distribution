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
  def apply(glob: String = null, location: String = null, statusCode: js.UndefOr[Double] = js.undefined): SchemaRedirect = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRedirect]
  }
}

