package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgComboMultiSelection
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Set addWithKeyModifier to true to disable the additive selection, then additive selection can be done by ctrl + mouse click / enter.
    *
    */
  var addWithKeyModifier: js.UndefOr[Boolean] = js.native
  /**
    * Set enabled to true to turn multi selection on. Set to true by default when target element for the combo is a select with the multiple attribute set.
    *
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Use itemSeparator to set what string to be rendered between items in field.
    *
    */
  var itemSeparator: js.UndefOr[String] = js.native
  /**
    * Set showCheckboxes to true to render check boxes in front of each drop down item.
    *
    */
  var showCheckboxes: js.UndefOr[Boolean] = js.native
}

object IgComboMultiSelection {
  @scala.inline
  def apply(): IgComboMultiSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboMultiSelection]
  }
  @scala.inline
  implicit class IgComboMultiSelectionOps[Self <: IgComboMultiSelection] (val x: Self) extends AnyVal {
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
    def setAddWithKeyModifier(value: Boolean): Self = this.set("addWithKeyModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddWithKeyModifier: Self = this.set("addWithKeyModifier", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setItemSeparator(value: String): Self = this.set("itemSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemSeparator: Self = this.set("itemSeparator", js.undefined)
    @scala.inline
    def setShowCheckboxes(value: Boolean): Self = this.set("showCheckboxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCheckboxes: Self = this.set("showCheckboxes", js.undefined)
  }
  
}

