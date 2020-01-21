package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from `userActivity:get` call.
  */
@js.native
trait SchemaSearchUserActivityResponse extends js.Object {
  /**
    * This token should be passed to
    * [SearchUserActivityRequest](#SearchUserActivityRequest) to retrieve the
    * next page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * This field represents the [sampling
    * rate](https://support.google.com/analytics/answer/2637192) for the given
    * request and is a number between 0.0 to 1.0. See [developer
    * guide](/analytics/devguides/reporting/core/v4/basics#sampling) for
    * details.
    */
  var sampleRate: js.UndefOr[Double] = js.native
  /**
    * Each record represents a session (device details, duration, etc).
    */
  var sessions: js.UndefOr[js.Array[SchemaUserActivitySession]] = js.native
  /**
    * Total rows returned by this query (across different pages).
    */
  var totalRows: js.UndefOr[Double] = js.native
}

object SchemaSearchUserActivityResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    sampleRate: Int | Double = null,
    sessions: js.Array[SchemaUserActivitySession] = null,
    totalRows: Int | Double = null
  ): SchemaSearchUserActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sessions != null) __obj.updateDynamic("sessions")(sessions.asInstanceOf[js.Any])
    if (totalRows != null) __obj.updateDynamic("totalRows")(totalRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchUserActivityResponse]
  }
}

