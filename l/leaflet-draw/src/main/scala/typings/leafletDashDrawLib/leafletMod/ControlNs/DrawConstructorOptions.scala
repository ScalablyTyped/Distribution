package typings
package leafletDashDrawLib.leafletMod.ControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawConstructorOptions extends js.Object {
  /**
  			 * The options used to configure the draw toolbar.
  			 *
  			 * Default value: {}
  			 */
  var draw: js.UndefOr[DrawOptions] = js.undefined
  /**
  			 * The options used to configure the edit toolbar.
  			 *
  			 * Default value: false
  			 */
  var edit: js.UndefOr[EditOptions] = js.undefined
  /**
  			 * The initial position of the control (one of the map corners).
  			 *
  			 * Default value: 'topleft'
  			 */
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object DrawConstructorOptions {
  @scala.inline
  def apply(draw: DrawOptions = null, edit: EditOptions = null, position: java.lang.String = null): DrawConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (draw != null) __obj.updateDynamic("draw")(draw)
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[DrawConstructorOptions]
  }
}

