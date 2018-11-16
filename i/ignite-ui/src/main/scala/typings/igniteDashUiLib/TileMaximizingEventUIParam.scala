package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TileMaximizingEventUIParam extends js.Object {
  /**
  	 * Used to get reference to the tile that is minimizing simultaneously or null if no tile is minimizing.
  	 */
  var minimizingTile: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the tile manager performing the maximizing the tile belongs to.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get the jQuery element of the tile being maximized
  	 */
  var tile: js.UndefOr[js.Any] = js.undefined
}

