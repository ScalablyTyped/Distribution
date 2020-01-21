package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditHandlerOptions extends js.Object {
  /**
    * The path options for how the layers will look while in edit mode.
    * If this is set to null the editable path options will not be set.
    *
    * @default { dashArray: '10, 10', fill: true, fillColor: '#fe57a1', fillOpacity: 0.1, maintainColor: false }
    */
  var selectedPathOptions: js.UndefOr[PathOptions] = js.undefined
}

object EditHandlerOptions {
  @scala.inline
  def apply(selectedPathOptions: PathOptions = null): EditHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (selectedPathOptions != null) __obj.updateDynamic("selectedPathOptions")(selectedPathOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditHandlerOptions]
  }
}

