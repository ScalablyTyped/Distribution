package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CrawledUrl resource represents a URL that was crawled during a ScanRun.
  * Web Security Scanner Service crawls the web applications, following all
  * links within the scope of sites, to find the URLs to test against.
  */
@js.native
trait SchemaCrawledUrl extends js.Object {
  /**
    * Output only. The body of the request that was used to visit the URL.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Output only. The http method of the request that was used to visit the
    * URL, in uppercase.
    */
  var httpMethod: js.UndefOr[String] = js.native
  /**
    * Output only. The URL that was crawled.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaCrawledUrl {
  @scala.inline
  def apply(body: String = null, httpMethod: String = null, url: String = null): SchemaCrawledUrl = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCrawledUrl]
  }
}

