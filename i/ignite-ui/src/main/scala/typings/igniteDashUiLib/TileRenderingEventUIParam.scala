package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileRenderingEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the tile manager performing rendering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the tile being rendered
  	 */
  var tile: js.UndefOr[js.Any] = js.undefined
}

object TileRenderingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, tile: js.Any = null): TileRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (tile != null) __obj.updateDynamic("tile")(tile)
    __obj.asInstanceOf[TileRenderingEventUIParam]
  }
}

