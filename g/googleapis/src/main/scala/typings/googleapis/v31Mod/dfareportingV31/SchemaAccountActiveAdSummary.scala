package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gets a summary of active ads in an account.
  */
@js.native
trait SchemaAccountActiveAdSummary extends js.Object {
  /**
    * ID of the account.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Ads that have been activated for the account
    */
  var activeAds: js.UndefOr[String] = js.native
  /**
    * Maximum number of active ads allowed for the account.
    */
  var activeAdsLimitTier: js.UndefOr[String] = js.native
  /**
    * Ads that can be activated for the account.
    */
  var availableAds: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountActiveAdSummary&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccountActiveAdSummary {
  @scala.inline
  def apply(): SchemaAccountActiveAdSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountActiveAdSummary]
  }
  @scala.inline
  implicit class SchemaAccountActiveAdSummaryOps[Self <: SchemaAccountActiveAdSummary] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setActiveAds(value: String): Self = this.set("activeAds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveAds: Self = this.set("activeAds", js.undefined)
    @scala.inline
    def setActiveAdsLimitTier(value: String): Self = this.set("activeAdsLimitTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveAdsLimitTier: Self = this.set("activeAdsLimitTier", js.undefined)
    @scala.inline
    def setAvailableAds(value: String): Self = this.set("availableAds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableAds: Self = this.set("availableAds", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

