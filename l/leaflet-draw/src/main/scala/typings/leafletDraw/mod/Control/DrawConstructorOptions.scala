package typings.leafletDraw.mod.Control

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawConstructorOptions extends js.Object {
  /**
    * The options used to configure the draw toolbar.
    *
    * @default {}
    */
  var draw: js.UndefOr[DrawOptions] = js.undefined
  /**
    * The options used to configure the edit toolbar.
    *
    * @default false
    */
  var edit: js.UndefOr[EditOptions] = js.undefined
  /**
    * The initial position of the control (one of the map corners).
    *
    * @default 'topleft'
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
}

object DrawConstructorOptions {
  @scala.inline
  def apply(draw: DrawOptions = null, edit: EditOptions = null, position: ControlPosition = null): DrawConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (draw != null) __obj.updateDynamic("draw")(draw.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawConstructorOptions]
  }
}

