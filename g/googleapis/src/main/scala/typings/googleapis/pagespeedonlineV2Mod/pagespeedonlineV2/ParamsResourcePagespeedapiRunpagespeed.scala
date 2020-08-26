package typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePagespeedapiRunpagespeed extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Indicates if third party resources should be filtered out before
    * PageSpeed analysis.
    */
  var filter_third_party_resources: js.UndefOr[Boolean] = js.native
  /**
    * The locale used to localize formatted results
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * A PageSpeed rule to run; if none are given, all rules are run
    */
  var rule: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates if binary data containing a screenshot should be included
    */
  var screenshot: js.UndefOr[Boolean] = js.native
  /**
    * The analysis strategy to use
    */
  var strategy: js.UndefOr[String] = js.native
  /**
    * The URL to fetch and analyze
    */
  var url: js.UndefOr[String] = js.native
}

object ParamsResourcePagespeedapiRunpagespeed {
  @scala.inline
  def apply(): ParamsResourcePagespeedapiRunpagespeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagespeedapiRunpagespeed]
  }
  @scala.inline
  implicit class ParamsResourcePagespeedapiRunpagespeedOps[Self <: ParamsResourcePagespeedapiRunpagespeed] (val x: Self) extends AnyVal {
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
    def setFilter_third_party_resources(value: Boolean): Self = this.set("filter_third_party_resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_third_party_resources: Self = this.set("filter_third_party_resources", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setRuleVarargs(value: String*): Self = this.set("rule", js.Array(value :_*))
    @scala.inline
    def setRule(value: js.Array[String]): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setScreenshot(value: Boolean): Self = this.set("screenshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshot: Self = this.set("screenshot", js.undefined)
    @scala.inline
    def setStrategy(value: String): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

