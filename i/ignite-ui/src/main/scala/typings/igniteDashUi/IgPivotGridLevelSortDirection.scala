package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridLevelSortDirection
  extends /**
	 * Option for IgPivotGridLevelSortDirection
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the unique name of the level, which will be sorted.
  	 */
  var levelUniqueName: js.UndefOr[String] = js.undefined
  /**
  	 * optional="true" Specifies what type of sorting will be applied to the header cells. If no behavior is specified, the level is going to be sorted with the behavior specified in the defaultLevelSortBehavior option.
  	 *
  	 * Valid values:
  	 * "system" Sorts the headers by a specified sort key.
  	 * "alphabetical" Sorts alphabetically the header captions.
  	 */
  var sortBehavior: js.UndefOr[String] = js.undefined
  /**
  	 * optional="true" Specifies the sort direction. If no direction is specified, the level is going to be sorted in the direction specified by the firstLevelSortDirection option.
  	 */
  var sortDirection: js.UndefOr[js.Any] = js.undefined
}

object IgPivotGridLevelSortDirection {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridLevelSortDirection
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    levelUniqueName: String = null,
    sortBehavior: String = null,
    sortDirection: js.Any = null
  ): IgPivotGridLevelSortDirection = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (levelUniqueName != null) __obj.updateDynamic("levelUniqueName")(levelUniqueName)
    if (sortBehavior != null) __obj.updateDynamic("sortBehavior")(sortBehavior)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    __obj.asInstanceOf[IgPivotGridLevelSortDirection]
  }
}

