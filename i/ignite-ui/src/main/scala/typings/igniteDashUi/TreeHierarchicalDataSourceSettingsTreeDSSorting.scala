package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeHierarchicalDataSourceSettingsTreeDSSorting
  extends /**
	 * Option for TreeHierarchicalDataSourceSettingsTreeDSSorting
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies from which data bound level to be applied sorting - 0 is the first level
  	 */
  var fromLevel: js.UndefOr[Double] = js.undefined
  /**
  	 * Specifies to which data bound level to be applied sorting - if -1 sorting should be applied to the last data bound level
  	 */
  var toLevel: js.UndefOr[Double] = js.undefined
}

object TreeHierarchicalDataSourceSettingsTreeDSSorting {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for TreeHierarchicalDataSourceSettingsTreeDSSorting
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    fromLevel: Int | Double = null,
    toLevel: Int | Double = null
  ): TreeHierarchicalDataSourceSettingsTreeDSSorting = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fromLevel != null) __obj.updateDynamic("fromLevel")(fromLevel.asInstanceOf[js.Any])
    if (toLevel != null) __obj.updateDynamic("toLevel")(toLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSSorting]
  }
}

