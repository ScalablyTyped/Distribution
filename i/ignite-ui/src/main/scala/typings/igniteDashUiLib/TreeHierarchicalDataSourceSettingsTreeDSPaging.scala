package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TreeHierarchicalDataSourceSettingsTreeDSPaging
  extends /**
	 * Option for TreeHierarchicalDataSourceSettingsTreeDSPaging
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * When data flows to the next page there are a couple of different modes that can help communicate the context of a leaf level row. When mode option is 'rootLevelOnly' then the context row always shows the value of the contextRowRootText option.
  	 *
  	 *
  	 * Valid values:
  	 * "none" Does not render the contextual row
  	 * "parent" Renders a read-only representation of the immediate parent row
  	 * "breadcrumb" Renders a read-only breadcrumb trail representing the full path through all ancestors
  	 */
  var contextRowMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets gets paging mode.
  	 *
  	 * Valid values:
  	 * "allLevels" includes all visible records in paging.
  	 */
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

