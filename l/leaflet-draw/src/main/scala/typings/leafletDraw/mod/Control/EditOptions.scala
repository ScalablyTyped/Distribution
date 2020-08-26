package typings.leafletDraw.mod.Control

import typings.leaflet.mod.FeatureGroup_
import typings.leafletDraw.leafletDrawBooleans.`false`
import typings.leafletDraw.mod.DrawOptions.EditHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditOptions extends js.Object {
  /**
    * Edit handler options. Set to false to disable handler.
    *
    * @default null
    */
  var edit: js.UndefOr[EditHandlerOptions | `false`] = js.native
  /**
    * This is the FeatureGroup that stores all editable shapes.
    * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
    *
    * @default null
    */
  var featureGroup: FeatureGroup_[_] = js.native
  /**
    * Delete handler options. Set to false to disable handler.
    *
    * Default value: null
    */
  var remove: js.UndefOr[Null | `false`] = js.native
}

object EditOptions {
  @scala.inline
  def apply(featureGroup: FeatureGroup_[_]): EditOptions = {
    val __obj = js.Dynamic.literal(featureGroup = featureGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOptions]
  }
  @scala.inline
  implicit class EditOptionsOps[Self <: EditOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeatureGroup(value: FeatureGroup_[_]): Self = this.set("featureGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit(value: EditHandlerOptions | `false`): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setRemove(value: `false`): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveNull: Self = this.set("remove", null)
  }
  
}

