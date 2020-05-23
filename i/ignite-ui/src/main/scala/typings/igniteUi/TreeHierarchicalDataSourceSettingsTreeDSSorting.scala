package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeHierarchicalDataSourceSettingsTreeDSSorting
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    fromLevel: js.UndefOr[Double] = js.undefined,
    toLevel: js.UndefOr[Double] = js.undefined
  ): TreeHierarchicalDataSourceSettingsTreeDSSorting = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(fromLevel)) __obj.updateDynamic("fromLevel")(fromLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toLevel)) __obj.updateDynamic("toLevel")(toLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSSorting]
  }
}

