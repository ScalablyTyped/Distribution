package typings.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrl extends js.Object {
  /**
    * A summary of the click analytics for the short and long URL. Might not be
    * present if not requested or currently unavailable.
    */
  var analytics: js.UndefOr[SchemaAnalyticsSummary] = js.native
  /**
    * Time the short URL was created; ISO 8601 representation using the
    * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ format, e.g.
    * &quot;2010-10-14T19:01:24.944+00:00&quot;.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Short URL, e.g. &quot;http://goo.gl/l6MS&quot;.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The fixed string &quot;urlshortener#url&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Long URL, e.g. &quot;http://www.google.com/&quot;. Might not be present
    * if the status is &quot;REMOVED&quot;.
    */
  var longUrl: js.UndefOr[String] = js.native
  /**
    * Status of the target URL. Possible values: &quot;OK&quot;,
    * &quot;MALWARE&quot;, &quot;PHISHING&quot;, or &quot;REMOVED&quot;. A URL
    * might be marked &quot;REMOVED&quot; if it was flagged as spam, for
    * example.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaUrl {
  @scala.inline
  def apply(
    analytics: SchemaAnalyticsSummary = null,
    created: String = null,
    id: String = null,
    kind: String = null,
    longUrl: String = null,
    status: String = null
  ): SchemaUrl = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (longUrl != null) __obj.updateDynamic("longUrl")(longUrl.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrl]
  }
}

