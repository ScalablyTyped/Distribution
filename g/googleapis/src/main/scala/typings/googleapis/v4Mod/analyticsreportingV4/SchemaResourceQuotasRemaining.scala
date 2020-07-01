package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The resource quota tokens remaining for the property after the request is
  * completed.
  */
@js.native
trait SchemaResourceQuotasRemaining extends js.Object {
  /**
    * Daily resource quota remaining remaining.
    */
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.native
  /**
    * Hourly resource quota tokens remaining.
    */
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.native
}

object SchemaResourceQuotasRemaining {
  @scala.inline
  def apply(
    dailyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined,
    hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
  ): SchemaResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dailyQuotaTokensRemaining)) __obj.updateDynamic("dailyQuotaTokensRemaining")(dailyQuotaTokensRemaining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hourlyQuotaTokensRemaining)) __obj.updateDynamic("hourlyQuotaTokensRemaining")(hourlyQuotaTokensRemaining.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceQuotasRemaining]
  }
}

