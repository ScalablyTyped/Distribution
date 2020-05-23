package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgComboLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets title for html element which represent the clear button.
    *
    */
  var clearButtonTitle: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets/Sets title for html element which represent the drop-down button.
    *
    */
  var dropDownButtonTitle: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets/Sets text of list item for condition when [filteringType](ui.igcombo#options:filteringType) option is enabled and no match was found.
    *
    */
  var noMatchFoundText: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets/Sets value that is displayed when input field is empty.
    *
    */
  var placeHolder: js.UndefOr[js.Any] = js.undefined
}

object IgComboLocale {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    clearButtonTitle: js.Any = null,
    dropDownButtonTitle: js.Any = null,
    noMatchFoundText: js.Any = null,
    placeHolder: js.Any = null
  ): IgComboLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (clearButtonTitle != null) __obj.updateDynamic("clearButtonTitle")(clearButtonTitle.asInstanceOf[js.Any])
    if (dropDownButtonTitle != null) __obj.updateDynamic("dropDownButtonTitle")(dropDownButtonTitle.asInstanceOf[js.Any])
    if (noMatchFoundText != null) __obj.updateDynamic("noMatchFoundText")(noMatchFoundText.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgComboLocale]
  }
}

