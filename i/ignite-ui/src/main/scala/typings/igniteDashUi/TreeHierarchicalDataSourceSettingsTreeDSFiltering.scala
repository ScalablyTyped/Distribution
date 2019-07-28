package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeHierarchicalDataSourceSettingsTreeDSFiltering
  extends /**
	 * Option for TreeHierarchicalDataSourceSettingsTreeDSFiltering
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don't match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don't match filtering conditions
  	 */
  var displayMode: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies from which data bound level to be applied filtering - 0 is the first level
  	 */
  var fromLevel: js.UndefOr[Double] = js.undefined
  /**
  	 * Filtering data source specific property - name of property in dataRecord object - indicates whether dataRow matches filtering conditions. It is used ONLY when filtering is applied.
  	 */
  var matchFiltering: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
  	 */
  var toLevel: js.UndefOr[Double] = js.undefined
}

object TreeHierarchicalDataSourceSettingsTreeDSFiltering {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for TreeHierarchicalDataSourceSettingsTreeDSFiltering
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    displayMode: js.Any = null,
    fromLevel: Int | Double = null,
    matchFiltering: String = null,
    toLevel: Int | Double = null
  ): TreeHierarchicalDataSourceSettingsTreeDSFiltering = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode)
    if (fromLevel != null) __obj.updateDynamic("fromLevel")(fromLevel.asInstanceOf[js.Any])
    if (matchFiltering != null) __obj.updateDynamic("matchFiltering")(matchFiltering)
    if (toLevel != null) __obj.updateDynamic("toLevel")(toLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSFiltering]
  }
}

