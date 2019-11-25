package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewDataSelectorOptions
  extends /**
	 * Option for IgPivotViewDataSelectorOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A function that will be called to determine if an item can be moved in or dropped on an area of the data selector.
  	 * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
  	 * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
  	 * paramType="string" The unique name of the item.
  	 * returnType="bool"  The function must return true if the item should be accepted.
  	 */
  var customMoveValidation: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Settings for the drag and drop functionality of the igPivotDataSelector.
  	 */
  var dragAndDropSettings: js.UndefOr[IgPivotViewDataSelectorOptionsDragAndDropSettings] = js.undefined
  /**
  	 * Specifies the parent for the drop downs.
  	 */
  var dropDownParent: js.UndefOr[js.Any] = js.undefined
}

object IgPivotViewDataSelectorOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewDataSelectorOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    customMoveValidation: js.Function = null,
    dragAndDropSettings: IgPivotViewDataSelectorOptionsDragAndDropSettings = null,
    dropDownParent: js.Any = null
  ): IgPivotViewDataSelectorOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (customMoveValidation != null) __obj.updateDynamic("customMoveValidation")(customMoveValidation.asInstanceOf[js.Any])
    if (dragAndDropSettings != null) __obj.updateDynamic("dragAndDropSettings")(dragAndDropSettings.asInstanceOf[js.Any])
    if (dropDownParent != null) __obj.updateDynamic("dropDownParent")(dropDownParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewDataSelectorOptions]
  }
}

