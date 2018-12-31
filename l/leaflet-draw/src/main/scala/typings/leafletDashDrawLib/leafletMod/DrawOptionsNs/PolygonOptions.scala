package typings
package leafletDashDrawLib.leafletMod.DrawOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonOptions extends PolylineOptions {
  /**
  			 * Defines the precision for each type of unit (e.g. {km: 2, ft: 0}
  			 *
  			 * Default value: {}
  			 */
  var precision: js.UndefOr[leafletDashDrawLib.leafletMod.PrecisionOptions] = js.undefined
  /**
  			 * Show the area of the drawn polygon in m², ha or km².
  			 * The area is only approximate and become less accurate the larger the polygon is.
  			 *
  			 * Default value: false
  			 */
  var showArea: js.UndefOr[scala.Boolean] = js.undefined
}

