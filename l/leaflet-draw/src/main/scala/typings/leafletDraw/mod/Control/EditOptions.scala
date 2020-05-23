package typings.leafletDraw.mod.Control

import typings.leaflet.mod.FeatureGroup_
import typings.leafletDraw.leafletDrawBooleans.`false`
import typings.leafletDraw.mod.DrawOptions.EditHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditOptions extends js.Object {
  /**
    * Edit handler options. Set to false to disable handler.
    *
    * @default null
    */
  var edit: js.UndefOr[EditHandlerOptions | `false`] = js.undefined
  /**
    * This is the FeatureGroup that stores all editable shapes.
    * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
    *
    * @default null
    */
  var featureGroup: FeatureGroup_[_]
  /**
    * Delete handler options. Set to false to disable handler.
    *
    * Default value: null
    */
  var remove: js.UndefOr[Null | `false`] = js.undefined
}

object EditOptions {
  @scala.inline
  def apply(
    featureGroup: FeatureGroup_[_],
    edit: EditHandlerOptions | `false` = null,
    remove: js.UndefOr[Null | `false`] = js.undefined
  ): EditOptions = {
    val __obj = js.Dynamic.literal(featureGroup = featureGroup.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOptions]
  }
}

