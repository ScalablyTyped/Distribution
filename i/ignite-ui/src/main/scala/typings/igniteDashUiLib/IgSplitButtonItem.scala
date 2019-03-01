package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSplitButtonItem
  extends /**
	 * Option for IgSplitButtonItem
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Css class to represent the iconClass of the item
  	 */
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Item display label
  	 */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Item name
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IgSplitButtonItem {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSplitButtonItem
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    iconClass: java.lang.String = null,
    label: java.lang.String = null,
    name: java.lang.String = null
  ): IgSplitButtonItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgSplitButtonItem]
  }
}

