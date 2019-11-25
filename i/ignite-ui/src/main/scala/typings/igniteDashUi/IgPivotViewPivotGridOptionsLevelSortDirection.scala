package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewPivotGridOptionsLevelSortDirection
  extends /**
	 * Option for IgPivotViewPivotGridOptionsLevelSortDirection
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the unique name of the level, which will be sorted.
  	 */
  var levelUniqueName: js.UndefOr[String] = js.undefined
  /**
  	 * optional="true" Specifies the sort direction. If no direction is specified,the level is going to be sorted in the direction specified by the firstLevelSortDirection option.
  	 *
  	 */
  var sortDirection: js.UndefOr[js.Any] = js.undefined
}

object IgPivotViewPivotGridOptionsLevelSortDirection {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewPivotGridOptionsLevelSortDirection
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    levelUniqueName: String = null,
    sortDirection: js.Any = null
  ): IgPivotViewPivotGridOptionsLevelSortDirection = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (levelUniqueName != null) __obj.updateDynamic("levelUniqueName")(levelUniqueName.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewPivotGridOptionsLevelSortDirection]
  }
}

