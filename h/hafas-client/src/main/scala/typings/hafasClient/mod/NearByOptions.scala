package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NearByOptions extends js.Object {
  /**
    * maximum walking distance in meters
    * @default undefined
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.native
  /**
    * language
    * @default en
    */
  var language: js.UndefOr[String] = js.native
  /**
    * parse & expose lines at each stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.native
  /**
    * return points of interest?
    * @default false
    */
  var poi: js.UndefOr[Boolean] = js.native
  /**
    * maximum number of results
    * @default 8
    */
  var results: js.UndefOr[Double] = js.native
  /**
    * return stops/stations?
    * @default true
    */
  var stops: js.UndefOr[Boolean] = js.native
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.native
}

object NearByOptions {
  @scala.inline
  def apply(): NearByOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearByOptions]
  }
  @scala.inline
  implicit class NearByOptionsOps[Self <: NearByOptions] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setEntrances(value: Boolean): Self = this.set("entrances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrances: Self = this.set("entrances", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLinesOfStops(value: Boolean): Self = this.set("linesOfStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinesOfStops: Self = this.set("linesOfStops", js.undefined)
    @scala.inline
    def setPoi(value: Boolean): Self = this.set("poi", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoi: Self = this.set("poi", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setStops(value: Boolean): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    @scala.inline
    def setSubStops(value: Boolean): Self = this.set("subStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubStops: Self = this.set("subStops", js.undefined)
  }
  
}

