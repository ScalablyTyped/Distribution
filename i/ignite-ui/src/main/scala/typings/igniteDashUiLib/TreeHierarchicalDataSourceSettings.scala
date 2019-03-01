package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeHierarchicalDataSourceSettings
  extends /**
	 * Option for TreeHierarchicalDataSourceSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Configure tree datasource specific settings
  	 */
  var treeDS: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDS] = js.undefined
}

object TreeHierarchicalDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for TreeHierarchicalDataSourceSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    treeDS: TreeHierarchicalDataSourceSettingsTreeDS = null
  ): TreeHierarchicalDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (treeDS != null) __obj.updateDynamic("treeDS")(treeDS)
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettings]
  }
}

