package typings.hafasClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeparturesArrivalsOptions extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
   // only show departures heading to this station
  var duration: js.UndefOr[Double] = js.undefined
   // fetch & parse previous/next stopovers?
  var includeRelatedStations: js.UndefOr[Boolean] = js.undefined
   // departures at related stations
  var language: js.UndefOr[String] = js.undefined
   // max. number of results; `null` means "whatever HAFAS wants"
  var linesOfStops: js.UndefOr[Boolean] = js.undefined
   // parse & expose lines at the stop/station?
  var remarks: js.UndefOr[Boolean] = js.undefined
   // show departures for the next n minutes
  var results: js.UndefOr[Double] = js.undefined
   // parse & expose hints & warnings?
  var stopovers: js.UndefOr[Boolean] = js.undefined
  var when: js.UndefOr[Date] = js.undefined
}

object DeparturesArrivalsOptions {
  @scala.inline
  def apply(
    direction: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    includeRelatedStations: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    linesOfStops: js.UndefOr[Boolean] = js.undefined,
    remarks: js.UndefOr[Boolean] = js.undefined,
    results: js.UndefOr[Double] = js.undefined,
    stopovers: js.UndefOr[Boolean] = js.undefined,
    when: Date = null
  ): DeparturesArrivalsOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeRelatedStations)) __obj.updateDynamic("includeRelatedStations")(includeRelatedStations.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(linesOfStops)) __obj.updateDynamic("linesOfStops")(linesOfStops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remarks)) __obj.updateDynamic("remarks")(remarks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopovers)) __obj.updateDynamic("stopovers")(stopovers.get.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeparturesArrivalsOptions]
  }
}

