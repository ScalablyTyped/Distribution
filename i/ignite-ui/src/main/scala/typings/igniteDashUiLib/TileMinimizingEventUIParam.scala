package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TileMinimizingEventUIParam extends js.Object {
  /**
  	 * Used to get reference to the tile that is maximizing simultaneously or null if no tile is maximizing.
  	 */
  var maximizingTile: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the tile manager performing the minimizing the tile belongs to.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get the jQuery element of the tile being minimized
  	 */
  var tile: js.UndefOr[js.Any] = js.undefined
}

