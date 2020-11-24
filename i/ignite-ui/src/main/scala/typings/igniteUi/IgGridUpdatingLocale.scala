package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridUpdatingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies the label for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowLabel is used.
    *
    */
  var addRowLabel: js.UndefOr[String] = js.native
  
  /**
    * Specifies the title for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowTooltip is used.
    *
    */
  var addRowTooltip: js.UndefOr[String] = js.native
  
  /**
    * Specifies the label for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelLabel is used.
    *
    */
  var cancelLabel: js.UndefOr[String] = js.native
  
  /**
    * Specifies the title for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelTooltip is used.
    *
    */
  var cancelTooltip: js.UndefOr[String] = js.native
  
  /**
    * Specifies the label for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowLabel is used.
    *
    */
  var deleteRowLabel: js.UndefOr[String] = js.native
  
  /**
    * Specifies the title for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowTooltip is used.
    *
    */
  var deleteRowTooltip: js.UndefOr[String] = js.native
  
  /**
    * Specifies the label for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneLabel is used.
    *
    */
  var doneLabel: js.UndefOr[String] = js.native
  
  /**
    * Specifies the title for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneTooltip is used.
    *
    */
  var doneTooltip: js.UndefOr[String] = js.native
}
object IgGridUpdatingLocale {
  
  @scala.inline
  def apply(): IgGridUpdatingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridUpdatingLocale]
  }
  
  @scala.inline
  implicit class IgGridUpdatingLocaleOps[Self <: IgGridUpdatingLocale] (val x: Self) extends AnyVal {
    
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
    def setAddRowLabel(value: String): Self = this.set("addRowLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddRowLabel: Self = this.set("addRowLabel", js.undefined)
    
    @scala.inline
    def setAddRowTooltip(value: String): Self = this.set("addRowTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddRowTooltip: Self = this.set("addRowTooltip", js.undefined)
    
    @scala.inline
    def setCancelLabel(value: String): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    
    @scala.inline
    def setCancelTooltip(value: String): Self = this.set("cancelTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelTooltip: Self = this.set("cancelTooltip", js.undefined)
    
    @scala.inline
    def setDeleteRowLabel(value: String): Self = this.set("deleteRowLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteRowLabel: Self = this.set("deleteRowLabel", js.undefined)
    
    @scala.inline
    def setDeleteRowTooltip(value: String): Self = this.set("deleteRowTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteRowTooltip: Self = this.set("deleteRowTooltip", js.undefined)
    
    @scala.inline
    def setDoneLabel(value: String): Self = this.set("doneLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneLabel: Self = this.set("doneLabel", js.undefined)
    
    @scala.inline
    def setDoneTooltip(value: String): Self = this.set("doneTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneTooltip: Self = this.set("doneTooltip", js.undefined)
  }
}
