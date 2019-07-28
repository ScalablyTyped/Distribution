package typings.leafletDashDraw.leafletMod.ControlNs

import typings.leaflet.leafletMod.FeatureGroup
import typings.leafletDashDraw.leafletDashDrawNumbers.`false`
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.DeleteHandlerOptions
import typings.leafletDashDraw.leafletMod.DrawOptionsNs.EditHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditOptions extends js.Object {
  /**
  			 * Edit handler options. Set to false to disable handler.
  			 *
  			 * Default value: null
  			 */
  var edit: js.UndefOr[EditHandlerOptions | `false`] = js.undefined
  /**
  			 * This is the FeatureGroup that stores all editable shapes.
  			 * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
  			 *
  			 * Default value: null
  			 */
  var featureGroup: FeatureGroup[_]
  /**
  			 * Delete handler options. Set to false to disable handler.
  			 *
  			 * Default value: null
  			 */
  var remove: js.UndefOr[DeleteHandlerOptions | `false`] = js.undefined
}

object EditOptions {
  @scala.inline
  def apply(
    featureGroup: FeatureGroup[_],
    edit: EditHandlerOptions | `false` = null,
    remove: DeleteHandlerOptions | `false` = null
  ): EditOptions = {
    val __obj = js.Dynamic.literal(featureGroup = featureGroup)
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOptions]
  }
}

