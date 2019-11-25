package typings.leafletDashRoutingDashMachine.leafletMod.Routing

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
    if (alternativeClassName != null) __obj.updateDynamic("alternativeClassName")(alternativeClassName.asInstanceOf[js.Any])
    if (collapseBtn != null) __obj.updateDynamic("collapseBtn")(js.Any.fromFunction1(collapseBtn))
    if (collapseBtnClass != null) __obj.updateDynamic("collapseBtnClass")(collapseBtnClass.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (distanceTemplate != null) __obj.updateDynamic("distanceTemplate")(distanceTemplate.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (itineraryClassName != null) __obj.updateDynamic("itineraryClassName")(itineraryClassName.asInstanceOf[js.Any])
    if (itineraryFormatter != null) __obj.updateDynamic("itineraryFormatter")(itineraryFormatter.asInstanceOf[js.Any])
    if (minimizedClassName != null) __obj.updateDynamic("minimizedClassName")(minimizedClassName.asInstanceOf[js.Any])
    if (pointMarkerStyle != null) __obj.updateDynamic("pointMarkerStyle")(pointMarkerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (summaryTemplate != null) __obj.updateDynamic("summaryTemplate")(summaryTemplate.asInstanceOf[js.Any])
    if (timeTemplate != null) __obj.updateDynamic("timeTemplate")(timeTemplate.asInstanceOf[js.Any])
    if (totalDistanceRoundingSensitivity != null) __obj.updateDynamic("totalDistanceRoundingSensitivity")(totalDistanceRoundingSensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItineraryOptions]
  }
}

