package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUrlcrawlerrorscountsQuery extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The crawl error category. For example: serverError. If not specified,
    * returns results for all categories.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * If true, returns only the latest crawl error counts.
    */
  var latestCountsOnly: js.UndefOr[Boolean] = js.native
  /**
    * The user agent type (platform) that made the request. For example: web.
    * If not specified, returns results for all platforms.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * The site's URL, including protocol. For example: http://www.example.com/
    */
  var siteUrl: js.UndefOr[String] = js.native
}

object ParamsResourceUrlcrawlerrorscountsQuery {
  @scala.inline
  def apply(): ParamsResourceUrlcrawlerrorscountsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlcrawlerrorscountsQuery]
  }
  @scala.inline
  implicit class ParamsResourceUrlcrawlerrorscountsQueryOps[Self <: ParamsResourceUrlcrawlerrorscountsQuery] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setLatestCountsOnly(value: Boolean): Self = this.set("latestCountsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestCountsOnly: Self = this.set("latestCountsOnly", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setSiteUrl(value: String): Self = this.set("siteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteUrl: Self = this.set("siteUrl", js.undefined)
  }
  
}

