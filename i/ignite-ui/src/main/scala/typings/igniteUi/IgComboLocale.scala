package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgComboLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets title for html element which represent the clear button.
    *
    */
  var clearButtonTitle: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets title for html element which represent the drop-down button.
    *
    */
  var dropDownButtonTitle: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets text of list item for condition when [filteringType](ui.igcombo#options:filteringType) option is enabled and no match was found.
    *
    */
  var noMatchFoundText: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets value that is displayed when input field is empty.
    *
    */
  var placeHolder: js.UndefOr[js.Any] = js.native
}

object IgComboLocale {
  @scala.inline
  def apply(): IgComboLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboLocale]
  }
  @scala.inline
  implicit class IgComboLocaleOps[Self <: IgComboLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearButtonTitle(value: js.Any): Self = this.set("clearButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearButtonTitle: Self = this.set("clearButtonTitle", js.undefined)
    @scala.inline
    def setDropDownButtonTitle(value: js.Any): Self = this.set("dropDownButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownButtonTitle: Self = this.set("dropDownButtonTitle", js.undefined)
    @scala.inline
    def setNoMatchFoundText(value: js.Any): Self = this.set("noMatchFoundText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoMatchFoundText: Self = this.set("noMatchFoundText", js.undefined)
    @scala.inline
    def setPlaceHolder(value: js.Any): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
  }
  
}

