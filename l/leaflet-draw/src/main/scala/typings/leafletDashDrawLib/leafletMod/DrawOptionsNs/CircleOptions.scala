package typings
package leafletDashDrawLib.leafletMod.DrawOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends SimpleShapeOptions {
  /**
  			 * When not metric, use feet instead of yards for display
  			 *
  			 * Default value: true
  			 */
  var feet: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * Whether to use the metric measurement system or imperial
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
  			 * The options used when drawing the circle on the map.
  			 *
  			 * Default value: See code
  			 */
  var shapeOptions: js.UndefOr[leafletLib.leafletMod.PathOptions] = js.undefined
  /**
  			 * Whether to show the radius in the tooltip
  			 *
  			 * Default value: true
  			 */
  var showRadius: js.UndefOr[scala.Boolean] = js.undefined
}

