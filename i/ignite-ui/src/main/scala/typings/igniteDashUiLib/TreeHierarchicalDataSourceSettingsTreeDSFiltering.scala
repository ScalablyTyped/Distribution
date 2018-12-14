package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TreeHierarchicalDataSourceSettingsTreeDSFiltering
  extends /**
	 * Option for TreeHierarchicalDataSourceSettingsTreeDSFiltering
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don't match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don't match filtering conditions
  	 */
  var displayMode: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies from which data bound level to be applied filtering - 0 is the first level
  	 */
  var fromLevel: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Filtering data source specific property - name of property in dataRecord object - indicates whether dataRow matches filtering conditions. It is used ONLY when filtering is applied.
  	 */
  var matchFiltering: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
  	 */
  var toLevel: js.UndefOr[scala.Double] = js.undefined
}

