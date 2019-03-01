package typings
package leafletDashDrawLib.leafletMod.ControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditOptions extends js.Object {
  /**
  			 * Edit handler options. Set to false to disable handler.
  			 *
  			 * Default value: null
  			 */
  var edit: js.UndefOr[
    leafletDashDrawLib.leafletMod.DrawOptionsNs.EditHandlerOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false`
  ] = js.undefined
  /**
  			 * This is the FeatureGroup that stores all editable shapes.
  			 * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
  			 *
  			 * Default value: null
  			 */
  var featureGroup: leafletLib.leafletMod.FeatureGroup[_]
  /**
  			 * Delete handler options. Set to false to disable handler.
  			 *
  			 * Default value: null
  			 */
  var remove: js.UndefOr[
    leafletDashDrawLib.leafletMod.DrawOptionsNs.DeleteHandlerOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false`
  ] = js.undefined
}

object EditOptions {
  @scala.inline
  def apply(
    featureGroup: leafletLib.leafletMod.FeatureGroup[_],
    edit: leafletDashDrawLib.leafletMod.DrawOptionsNs.EditHandlerOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false` = null,
    remove: leafletDashDrawLib.leafletMod.DrawOptionsNs.DeleteHandlerOptions | leafletDashDrawLib.leafletDashDrawLibNumbers.`false` = null
  ): EditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("featureGroup")(featureGroup)
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOptions]
  }
}

