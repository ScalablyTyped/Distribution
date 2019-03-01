package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorDragAndDropSettings
  extends /**
	 * Option for IgPivotDataSelectorDragAndDropSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Which element the draggable helper should be appended to while dragging.
  	 */
  var appendTo: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies the containment for the drag helper. The area inside of which thehelper is contained would be scrollable while dragging.
  	 *
  	 */
  var containment: js.UndefOr[scala.Boolean | java.lang.String | js.Array[_]] = js.undefined
  /**
  	 * Specifies z-index that would be set for the drag helper.
  	 */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object IgPivotDataSelectorDragAndDropSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotDataSelectorDragAndDropSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    appendTo: js.Any = null,
    containment: scala.Boolean | java.lang.String | js.Array[_] = null,
    zIndex: scala.Int | scala.Double = null
  ): IgPivotDataSelectorDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotDataSelectorDragAndDropSettings]
  }
}

