package typings.hafasClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeparturesArrivalsOptions extends js.Object {
  /**
    * only show departures heading to this station
    * @default undefined
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * show departures for the next n minutes
    * @default 120
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.native
  /**
    * departures at related stations
    * @default false
    */
  var includeRelatedStations: js.UndefOr[Boolean] = js.native
  /**
    * language
    * @default en
    */
  var language: js.UndefOr[String] = js.native
  /**
    * parse & expose lines at the stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.native
  /**
    * parse & expose hints & warnings?
    * @default false
    */
  var remarks: js.UndefOr[Boolean] = js.native
  /**
    * max. number of results; `null` means "whatever HAFAS wants"
    * @default 10
    */
  var results: js.UndefOr[Double] = js.native
  /**
    * fetch & parse previous/next stopovers?
    * @default false
    */
  var stopovers: js.UndefOr[Boolean] = js.native
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.native
  /**
    * departure date, undefined corresponds to Date.Now
    * @default undefined
    */
  var when: js.UndefOr[Date] = js.native
}

object DeparturesArrivalsOptions {
  @scala.inline
  def apply(): DeparturesArrivalsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeparturesArrivalsOptions]
  }
  @scala.inline
  implicit class DeparturesArrivalsOptionsOps[Self <: DeparturesArrivalsOptions] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEntrances(value: Boolean): Self = this.set("entrances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrances: Self = this.set("entrances", js.undefined)
    @scala.inline
    def setIncludeRelatedStations(value: Boolean): Self = this.set("includeRelatedStations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeRelatedStations: Self = this.set("includeRelatedStations", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLinesOfStops(value: Boolean): Self = this.set("linesOfStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinesOfStops: Self = this.set("linesOfStops", js.undefined)
    @scala.inline
    def setRemarks(value: Boolean): Self = this.set("remarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarks: Self = this.set("remarks", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setStopovers(value: Boolean): Self = this.set("stopovers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopovers: Self = this.set("stopovers", js.undefined)
    @scala.inline
    def setSubStops(value: Boolean): Self = this.set("subStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubStops: Self = this.set("subStops", js.undefined)
    @scala.inline
    def setWhen(value: Date): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

