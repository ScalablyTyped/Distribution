package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItineraryOptions extends js.Object {
  var alternativeClassName: js.UndefOr[java.lang.String] = js.undefined
  var collapseBtn: js.UndefOr[js.Function1[/* itinerary */ Itinerary, scala.Unit]] = js.undefined
  var collapseBtnClass: js.UndefOr[java.lang.String] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  var distanceTemplate: js.UndefOr[java.lang.String] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var itineraryClassName: js.UndefOr[java.lang.String] = js.undefined
  var itineraryFormatter: js.UndefOr[ItineraryBuilder] = js.undefined
  var minimizedClassName: js.UndefOr[java.lang.String] = js.undefined
  var pointMarkerStyle: js.UndefOr[leafletLib.leafletMod.PathOptions] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var summaryTemplate: js.UndefOr[java.lang.String] = js.undefined
  var timeTemplate: js.UndefOr[java.lang.String] = js.undefined
  var totalDistanceRoundingSensitivity: js.UndefOr[scala.Double] = js.undefined
}

object ItineraryOptions {
  @scala.inline
  def apply(
    alternativeClassName: java.lang.String = null,
    collapseBtn: js.Function1[/* itinerary */ Itinerary, scala.Unit] = null,
    collapseBtnClass: java.lang.String = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    containerClassName: java.lang.String = null,
    distanceTemplate: java.lang.String = null,
    formatter: Formatter = null,
    itineraryClassName: java.lang.String = null,
    itineraryFormatter: ItineraryBuilder = null,
    minimizedClassName: java.lang.String = null,
    pointMarkerStyle: leafletLib.leafletMod.PathOptions = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    summaryTemplate: java.lang.String = null,
    timeTemplate: java.lang.String = null,
    totalDistanceRoundingSensitivity: scala.Int | scala.Double = null
  ): ItineraryOptions = {
    val __obj = js.Dynamic.literal()
    if (alternativeClassName != null) __obj.updateDynamic("alternativeClassName")(alternativeClassName)
    if (collapseBtn != null) __obj.updateDynamic("collapseBtn")(collapseBtn)
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

