package typings.igniteDashUi

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

object TileMaximizingEventUIParam {
  @scala.inline
  def apply(minimizingTile: js.Any = null, owner: js.Any = null, tile: js.Any = null): TileMaximizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (minimizingTile != null) __obj.updateDynamic("minimizingTile")(minimizingTile.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileMaximizingEventUIParam]
  }
}

