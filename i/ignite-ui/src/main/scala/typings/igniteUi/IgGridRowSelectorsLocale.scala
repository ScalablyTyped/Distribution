package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridRowSelectorsLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Deselect all text for the select/deselect all overlay.
    *
    */
  var deselectAllText: js.UndefOr[String] = js.native
  /**
    * Deselected records text for the select/deselect all overlay.
    *
    */
  var deselectedRecordsText: js.UndefOr[String] = js.native
  /**
    * Select all text for the select/deselect all overlay.
    *
    */
  var selectAllText: js.UndefOr[String] = js.native
  /**
    * Selected records text for the select/deselect all overlay.
    *
    */
  var selectedRecordsText: js.UndefOr[String] = js.native
}

object IgGridRowSelectorsLocale {
  @scala.inline
  def apply(): IgGridRowSelectorsLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridRowSelectorsLocale]
  }
  @scala.inline
  implicit class IgGridRowSelectorsLocaleOps[Self <: IgGridRowSelectorsLocale] (val x: Self) extends AnyVal {
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
    def setDeselectAllText(value: String): Self = this.set("deselectAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeselectAllText: Self = this.set("deselectAllText", js.undefined)
    @scala.inline
    def setDeselectedRecordsText(value: String): Self = this.set("deselectedRecordsText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeselectedRecordsText: Self = this.set("deselectedRecordsText", js.undefined)
    @scala.inline
    def setSelectAllText(value: String): Self = this.set("selectAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllText: Self = this.set("selectAllText", js.undefined)
    @scala.inline
    def setSelectedRecordsText(value: String): Self = this.set("selectedRecordsText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRecordsText: Self = this.set("selectedRecordsText", js.undefined)
  }
  
}

