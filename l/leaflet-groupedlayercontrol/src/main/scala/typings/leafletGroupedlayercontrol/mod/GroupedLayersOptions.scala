package typings.leafletGroupedlayercontrol.mod

import typings.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupedLayersOptions extends ControlOptions {
  /** Default: true */
  var autoZIndex: js.UndefOr[Boolean] = js.native
  /** Default: true */
  var collapsed: js.UndefOr[Boolean] = js.native
  var exclusiveGroups: js.UndefOr[js.Array[String]] = js.native
  /** Default: false */
  var groupCheckboxes: js.UndefOr[Boolean] = js.native
}

object GroupedLayersOptions {
  @scala.inline
  def apply(): GroupedLayersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupedLayersOptions]
  }
  @scala.inline
  implicit class GroupedLayersOptionsOps[Self <: GroupedLayersOptions] (val x: Self) extends AnyVal {
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
    def setAutoZIndex(value: Boolean): Self = this.set("autoZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoZIndex: Self = this.set("autoZIndex", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setExclusiveGroupsVarargs(value: String*): Self = this.set("exclusiveGroups", js.Array(value :_*))
    @scala.inline
    def setExclusiveGroups(value: js.Array[String]): Self = this.set("exclusiveGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveGroups: Self = this.set("exclusiveGroups", js.undefined)
    @scala.inline
    def setGroupCheckboxes(value: Boolean): Self = this.set("groupCheckboxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupCheckboxes: Self = this.set("groupCheckboxes", js.undefined)
  }
  
}

