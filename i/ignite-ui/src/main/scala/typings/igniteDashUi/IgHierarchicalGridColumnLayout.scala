package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridColumnLayout
  extends /**
	 * Option for IgHierarchicalGridColumnLayout
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the foreignKey of the columnLayout. This is also the column key of the parent grid.
  	 */
  var foreignKey: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the columnLayout key. This is the property that holds the data records for the current column layout.
  	 */
  var key: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the primaryKey of the columnLayout. This also serves as the column key for the current column layout.
  	 */
  var primaryKey: js.UndefOr[String] = js.undefined
}

object IgHierarchicalGridColumnLayout {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgHierarchicalGridColumnLayout
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    foreignKey: String = null,
    key: String = null,
    primaryKey: String = null
  ): IgHierarchicalGridColumnLayout = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHierarchicalGridColumnLayout]
  }
}

