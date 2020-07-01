package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics Remarketing Include Conditions.
  */
@js.native
trait SchemaIncludeConditions extends js.Object {
  /**
    * The look-back window lets you specify a time frame for evaluating the
    * behavior that qualifies users for your audience. For example, if your
    * filters include users from Central Asia, and Transactions Greater than 2,
    * and you set the look-back window to 14 days, then any user from Central
    * Asia whose cumulative transactions exceed 2 during the last 14 days is
    * added to the audience.
    */
  var daysToLookBack: js.UndefOr[Double] = js.native
  /**
    * Boolean indicating whether this segment is a smart list.
    * https://support.google.com/analytics/answer/4628577
    */
  var isSmartList: js.UndefOr[Boolean] = js.native
  /**
    * Resource type for include conditions.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Number of days (in the range 1 to 540) a user remains in the audience.
    */
  var membershipDurationDays: js.UndefOr[Double] = js.native
  /**
    * The segment condition that will cause a user to be added to an audience.
    */
  var segment: js.UndefOr[String] = js.native
}

object SchemaIncludeConditions {
  @scala.inline
  def apply(
    daysToLookBack: js.UndefOr[Double] = js.undefined,
    isSmartList: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    membershipDurationDays: js.UndefOr[Double] = js.undefined,
    segment: String = null
  ): SchemaIncludeConditions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(daysToLookBack)) __obj.updateDynamic("daysToLookBack")(daysToLookBack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSmartList)) __obj.updateDynamic("isSmartList")(isSmartList.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(membershipDurationDays)) __obj.updateDynamic("membershipDurationDays")(membershipDurationDays.get.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIncludeConditions]
  }
}

