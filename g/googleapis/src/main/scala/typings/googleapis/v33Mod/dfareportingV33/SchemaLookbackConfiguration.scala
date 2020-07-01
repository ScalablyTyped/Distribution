package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lookback configuration settings.
  */
@js.native
trait SchemaLookbackConfiguration extends js.Object {
  /**
    * Lookback window, in days, from the last time a given user clicked on one
    * of your ads. If you enter 0, clicks will not be considered as triggering
    * events for floodlight tracking. If you leave this field blank, the
    * default value for your account will be used. Acceptable values are 0 to
    * 90, inclusive.
    */
  var clickDuration: js.UndefOr[Double] = js.native
  /**
    * Lookback window, in days, from the last time a given user viewed one of
    * your ads. If you enter 0, impressions will not be considered as
    * triggering events for floodlight tracking. If you leave this field blank,
    * the default value for your account will be used. Acceptable values are 0
    * to 90, inclusive.
    */
  var postImpressionActivitiesDuration: js.UndefOr[Double] = js.native
}

object SchemaLookbackConfiguration {
  @scala.inline
  def apply(
    clickDuration: js.UndefOr[Double] = js.undefined,
    postImpressionActivitiesDuration: js.UndefOr[Double] = js.undefined
  ): SchemaLookbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickDuration)) __obj.updateDynamic("clickDuration")(clickDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(postImpressionActivitiesDuration)) __obj.updateDynamic("postImpressionActivitiesDuration")(postImpressionActivitiesDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLookbackConfiguration]
  }
}

