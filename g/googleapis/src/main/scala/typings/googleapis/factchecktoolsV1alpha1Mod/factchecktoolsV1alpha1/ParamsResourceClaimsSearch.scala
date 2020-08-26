package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceClaimsSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". Can be used to
    * restrict results by language, though we do not currently consider the
    * region.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The maximum age of the returned search results, in days. Age is
    * determined by either claim date or review date, whichever is newer.
    */
  var maxAgeDays: js.UndefOr[Double] = js.native
  /**
    * An integer that specifies the current offset (that is, starting result
    * location) in search results. This field is only considered if
    * `page_token` is unset. For example, 0 means to return results starting
    * from the first matching result, and 10 means to return from the 11th
    * result.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The pagination size. We will return up to that many results. Defaults to
    * 10 if not set.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The pagination token. You may provide the `next_page_token` returned from
    * a previous List request, if any, in order to get the next page. All other
    * fields must have the same values as in the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Textual query string. Required unless `review_publisher_site_filter` is
    * specified.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * The review publisher site to filter results by, e.g. nytimes.com.
    */
  var reviewPublisherSiteFilter: js.UndefOr[String] = js.native
}

object ParamsResourceClaimsSearch {
  @scala.inline
  def apply(): ParamsResourceClaimsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceClaimsSearch]
  }
  @scala.inline
  implicit class ParamsResourceClaimsSearchOps[Self <: ParamsResourceClaimsSearch] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setMaxAgeDays(value: Double): Self = this.set("maxAgeDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAgeDays: Self = this.set("maxAgeDays", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReviewPublisherSiteFilter(value: String): Self = this.set("reviewPublisherSiteFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewPublisherSiteFilter: Self = this.set("reviewPublisherSiteFilter", js.undefined)
  }
  
}

