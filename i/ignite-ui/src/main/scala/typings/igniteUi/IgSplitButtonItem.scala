package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSplitButtonItem
  extends /**
	 * Option for IgSplitButtonItem
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Css class to represent the iconClass of the item
  	 */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
  	 * Item display label
  	 */
  var label: js.UndefOr[String] = js.undefined
  /**
  	 * Item name
  	 */
  var name: js.UndefOr[String] = js.undefined
}

object IgSplitButtonItem {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSplitButtonItem
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    iconClass: String = null,
    label: String = null,
    name: String = null
  ): IgSplitButtonItem = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSplitButtonItem]
  }
}

