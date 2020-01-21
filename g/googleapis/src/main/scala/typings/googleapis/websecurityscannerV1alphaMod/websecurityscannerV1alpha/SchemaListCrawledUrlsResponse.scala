package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListCrawledUrls` method.
  */
@js.native
trait SchemaListCrawledUrlsResponse extends js.Object {
  /**
    * The list of CrawledUrls returned.
    */
  var crawledUrls: js.UndefOr[js.Array[SchemaCrawledUrl]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCrawledUrlsResponse {
  @scala.inline
  def apply(crawledUrls: js.Array[SchemaCrawledUrl] = null, nextPageToken: String = null): SchemaListCrawledUrlsResponse = {
    val __obj = js.Dynamic.literal()
    if (crawledUrls != null) __obj.updateDynamic("crawledUrls")(crawledUrls.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCrawledUrlsResponse]
  }
}

