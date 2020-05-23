package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorDragAndDropSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Which element the draggable helper should be appended to while dragging.
    */
  var appendTo: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies the containment for the drag helper. The area inside of which thehelper is contained would be scrollable while dragging.
    *
    */
  var containment: js.UndefOr[Boolean | String | js.Array[_]] = js.undefined
  /**
    * Specifies z-index that would be set for the drag helper.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IgPivotDataSelectorDragAndDropSettings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    appendTo: js.Any = null,
    containment: Boolean | String | js.Array[_] = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): IgPivotDataSelectorDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotDataSelectorDragAndDropSettings]
  }
}

