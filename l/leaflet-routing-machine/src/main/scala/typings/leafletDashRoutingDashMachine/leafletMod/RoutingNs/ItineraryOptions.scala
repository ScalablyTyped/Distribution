package typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs

import typings.leaflet.leafletMod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItineraryOptions extends js.Object {
  var alternativeClassName: js.UndefOr[String] = js.undefined
  var collapseBtn: js.UndefOr[js.Function1[/* itinerary */ Itinerary, Unit]] = js.undefined
  var collapseBtnClass: js.UndefOr[String] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var containerClassName: js.UndefOr[String] = js.undefined
  var distanceTemplate: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var itineraryClassName: js.UndefOr[String] = js.undefined
  var itineraryFormatter: js.UndefOr[ItineraryBuilder] = js.undefined
  var minimizedClassName: js.UndefOr[String] = js.undefined
  var pointMarkerStyle: js.UndefOr[PathOptions] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var summaryTemplate: js.UndefOr[String] = js.undefined
  var timeTemplate: js.UndefOr[String] = js.undefined
  var totalDistanceRoundingSensitivity: js.UndefOr[Double] = js.undefined
}

object ItineraryOptions {
  @scala.inline
  def apply(
    alternativeClassName: String = null,
    collapseBtn: /* itinerary */ Itinerary => Unit = null,
    collapseBtnClass: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    distanceTemplate: String = null,
    formatter: Formatter = null,
    itineraryClassName: String = null,
    itineraryFormatter: ItineraryBuilder = null,
    minimizedClassName: String = null,
    pointMarkerStyle: PathOptions = null,
    show: js.UndefOr[Boolean] = js.undefined,
    summaryTemplate: String = null,
    timeTemplate: String = null,
    totalDistanceRoundingSensitivity: Int | Double = null
  ): ItineraryOptions = {
    val __obj = js.Dynamic.literal()
    if (alternativeClassName != null) __obj.updateDynamic("alternativeClassName")(alternativeClassName)
    if (collapseBtn != null) __obj.updateDynamic("collapseBtn")(js.Any.fromFunction1(collapseBtn))
    if (collapseBtnClass != null) __obj.updateDynamic("collapseBtnClass")(collapseBtnClass)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (distanceTemplate != null) __obj.updateDynamic("distanceTemplate")(distanceTemplate)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (itineraryClassName != null) __obj.updateDynamic("itineraryClassName")(itineraryClassName)
    if (itineraryFormatter != null) __obj.updateDynamic("itineraryFormatter")(itineraryFormatter)
    if (minimizedClassName != null) __obj.updateDynamic("minimizedClassName")(minimizedClassName)
    if (pointMarkerStyle != null) __obj.updateDynamic("pointMarkerStyle")(pointMarkerStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (summaryTemplate != null) __obj.updateDynamic("summaryTemplate")(summaryTemplate)
    if (timeTemplate != null) __obj.updateDynamic("timeTemplate")(timeTemplate)
    if (totalDistanceRoundingSensitivity != null) __obj.updateDynamic("totalDistanceRoundingSensitivity")(totalDistanceRoundingSensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItineraryOptions]
  }
}

