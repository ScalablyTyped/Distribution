package typings
package leafletDashDrawLib.leafletMod.DrawOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PolylineOptions extends js.Object {
  /**
  			 * Determines if line segments can cross.
  			 *
  			 * Default value: true
  			 */
  var allowIntersection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * Configuration options for the error that displays if an intersection is detected.
  			 *
  			 * Default value: See code
  			 */
  var drawError: js.UndefOr[DrawErrorOptions] = js.undefined
  /**
  			 * To change distance calculation
  			 *
  			 * Default value: 1
  			 */
  var factor: js.UndefOr[scala.Double] = js.undefined
  /**
  			 * When not metric, to use feet instead of yards for display.
  			 *
  			 * Default value: true
  			 */
  var feet: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * Distance in pixels between each guide dash.
  			 *
  			 * Default value: 20
  			 */
  var guidelineDistance: js.UndefOr[scala.Double] = js.undefined
  var icon: js.UndefOr[
    leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
  ] = js.undefined
  /**
  			 * The maximum length of the guide line
  			 *
  			 * Default value: 4000
  			 */
  var maxGuideLineLength: js.UndefOr[scala.Double] = js.undefined
  /**
  			 * Once this number of points are placed, finish shape
  			 *
  			 * Default value: 0
  			 */
  var maxPoints: js.UndefOr[scala.Double] = js.undefined
  /**
  			 * Determines which measurement system (metric or imperial) is used.
  			 *
  			 * Default value: true
  			 */
  var metric: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When not metric, not feet use nautic mile for display
  			 *
  			 * Default value: false
  			 */
  var nautic: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * Determines if the draw tool remains enabled after drawing a shape.
  			 *
  			 * Default value: false
  			 */
  var repeatMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * The options used when drawing the polyline/polygon on the map.
  			 *
  			 * Default value: See code
  			 */
  var shapeOptions: js.UndefOr[leafletLib.leafletMod.PathOptions] = js.undefined
  /**
  			 * Whether to display distance in the tooltip
  			 *
  			 * Default value: true
  			 */
  var showLength: js.UndefOr[scala.Boolean] = js.undefined
  var touchIcon: js.UndefOr[
    leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
  ] = js.undefined
  /**
  			 * This should be a high number to ensure that you can draw over all other layers on the map.
  			 *
  			 * Default value: 2000
  			 */
  var zIndexOffset: js.UndefOr[scala.Double] = js.undefined
}

