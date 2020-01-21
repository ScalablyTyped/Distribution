package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeHierarchicalDataSourceSettings
  extends /**
	 * Option for TreeHierarchicalDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
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
  /* optionName */ StringDictionary[js.Any] = null,
    treeDS: TreeHierarchicalDataSourceSettingsTreeDS = null
  ): TreeHierarchicalDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (treeDS != null) __obj.updateDynamic("treeDS")(treeDS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettings]
  }
}

