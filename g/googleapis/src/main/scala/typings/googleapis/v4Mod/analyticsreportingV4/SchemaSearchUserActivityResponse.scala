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
  def apply(): SchemaSearchUserActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchUserActivityResponse]
  }
  @scala.inline
  implicit class SchemaSearchUserActivityResponseOps[Self <: SchemaSearchUserActivityResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    @scala.inline
    def setSessionsVarargs(value: SchemaUserActivitySession*): Self = this.set("sessions", js.Array(value :_*))
    @scala.inline
    def setSessions(value: js.Array[SchemaUserActivitySession]): Self = this.set("sessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessions: Self = this.set("sessions", js.undefined)
    @scala.inline
    def setTotalRows(value: Double): Self = this.set("totalRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRows: Self = this.set("totalRows", js.undefined)
  }
  
}

