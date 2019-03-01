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

object TileMinimizingEventUIParam {
  @scala.inline
  def apply(maximizingTile: js.Any = null, owner: js.Any = null, tile: js.Any = null): TileMinimizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (maximizingTile != null) __obj.updateDynamic("maximizingTile")(maximizingTile)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (tile != null) __obj.updateDynamic("tile")(tile)
    __obj.asInstanceOf[TileMinimizingEventUIParam]
  }
}

