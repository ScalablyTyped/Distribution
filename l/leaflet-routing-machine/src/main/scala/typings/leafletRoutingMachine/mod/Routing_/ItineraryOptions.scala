package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.CircleMarkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItineraryOptions extends js.Object {
  var alternativeClassName: js.UndefOr[String] = js.native
  var collapseBtn: js.UndefOr[js.Function1[/* itinerary */ Itinerary_, Unit]] = js.native
  var collapseBtnClass: js.UndefOr[String] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  var distanceTemplate: js.UndefOr[String] = js.native
  var formatter: js.UndefOr[Formatter_] = js.native
  var itineraryBuilder: js.UndefOr[ItineraryBuilder_] = js.native
  var itineraryClassName: js.UndefOr[String] = js.native
  var itineraryFormatter: js.UndefOr[ItineraryBuilder_] = js.native
  var minimizedClassName: js.UndefOr[String] = js.native
  var pointMarkerStyle: js.UndefOr[CircleMarkerOptions] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var summaryTemplate: js.UndefOr[String] = js.native
  var timeTemplate: js.UndefOr[String] = js.native
  var totalDistanceRoundingSensitivity: js.UndefOr[Double] = js.native
}

object ItineraryOptions {
  @scala.inline
  def apply(): ItineraryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItineraryOptions]
  }
  @scala.inline
  implicit class ItineraryOptionsOps[Self <: ItineraryOptions] (val x: Self) extends AnyVal {
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
    def setAlternativeClassName(value: String): Self = this.set("alternativeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativeClassName: Self = this.set("alternativeClassName", js.undefined)
    @scala.inline
    def setCollapseBtn(value: /* itinerary */ Itinerary_ => Unit): Self = this.set("collapseBtn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCollapseBtn: Self = this.set("collapseBtn", js.undefined)
    @scala.inline
    def setCollapseBtnClass(value: String): Self = this.set("collapseBtnClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseBtnClass: Self = this.set("collapseBtnClass", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setDistanceTemplate(value: String): Self = this.set("distanceTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceTemplate: Self = this.set("distanceTemplate", js.undefined)
    @scala.inline
    def setFormatter(value: Formatter_): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setItineraryBuilder(value: ItineraryBuilder_): Self = this.set("itineraryBuilder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItineraryBuilder: Self = this.set("itineraryBuilder", js.undefined)
    @scala.inline
    def setItineraryClassName(value: String): Self = this.set("itineraryClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItineraryClassName: Self = this.set("itineraryClassName", js.undefined)
    @scala.inline
    def setItineraryFormatter(value: ItineraryBuilder_): Self = this.set("itineraryFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItineraryFormatter: Self = this.set("itineraryFormatter", js.undefined)
    @scala.inline
    def setMinimizedClassName(value: String): Self = this.set("minimizedClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimizedClassName: Self = this.set("minimizedClassName", js.undefined)
    @scala.inline
    def setPointMarkerStyle(value: CircleMarkerOptions): Self = this.set("pointMarkerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointMarkerStyle: Self = this.set("pointMarkerStyle", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSummaryTemplate(value: String): Self = this.set("summaryTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryTemplate: Self = this.set("summaryTemplate", js.undefined)
    @scala.inline
    def setTimeTemplate(value: String): Self = this.set("timeTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeTemplate: Self = this.set("timeTemplate", js.undefined)
    @scala.inline
    def setTotalDistanceRoundingSensitivity(value: Double): Self = this.set("totalDistanceRoundingSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalDistanceRoundingSensitivity: Self = this.set("totalDistanceRoundingSensitivity", js.undefined)
  }
  
}

