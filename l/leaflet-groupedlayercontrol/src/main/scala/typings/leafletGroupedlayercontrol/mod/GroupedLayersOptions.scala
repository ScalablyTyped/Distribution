package typings.leafletGroupedlayercontrol.mod

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupedLayersOptions extends ControlOptions {
  /** Default: true */
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  /** Default: true */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var exclusiveGroups: js.UndefOr[js.Array[String]] = js.undefined
  /** Default: false */
  var groupCheckboxes: js.UndefOr[Boolean] = js.undefined
}

object GroupedLayersOptions {
  @scala.inline
  def apply(
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    exclusiveGroups: js.Array[String] = null,
    groupCheckboxes: js.UndefOr[Boolean] = js.undefined,
    position: ControlPosition = null
  ): GroupedLayersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (exclusiveGroups != null) __obj.updateDynamic("exclusiveGroups")(exclusiveGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(groupCheckboxes)) __obj.updateDynamic("groupCheckboxes")(groupCheckboxes.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedLayersOptions]
  }
}

