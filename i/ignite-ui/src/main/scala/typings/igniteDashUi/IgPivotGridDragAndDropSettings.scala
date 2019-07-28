package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDragAndDropSettings
  extends /**
	 * Option for IgPivotGridDragAndDropSettings
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

object IgPivotGridDragAndDropSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridDragAndDropSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    appendTo: js.Any = null,
    containment: Boolean | String | js.Array[_] = null,
    zIndex: Int | Double = null
  ): IgPivotGridDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotGridDragAndDropSettings]
  }
}

