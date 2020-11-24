package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgToolbarButton
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Event fired after the toolbar button is activated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var activated: js.UndefOr[ActivatedEvent] = js.native
  
  /**
    * Event fired before the toolbar button is activated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var activating: js.UndefOr[ActivatingEvent] = js.native
  
  /**
    * Enable/Disable the "Toggling" of a button.
    *
    */
  var allowToggling: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired after the toolbar button is deactivated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var deactivated: js.UndefOr[DeactivatedEvent] = js.native
  
  /**
    * Event fired before the toolbar button is deactivated.
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get reference to this igToolbarButton.
    */
  var deactivating: js.UndefOr[DeactivatingEvent] = js.native
  
  /**
    * Get/Set whether the toolbar button is selected.
    *
    */
  var isSelected: js.UndefOr[Boolean] = js.native
}
object IgToolbarButton {
  
  @scala.inline
  def apply(): IgToolbarButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbarButton]
  }
  
  @scala.inline
  implicit class IgToolbarButtonOps[Self <: IgToolbarButton] (val x: Self) extends AnyVal {
    
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
    def setActivated(value: (/* event */ Event, /* ui */ ActivatedEventUIParam) => Unit): Self = this.set("activated", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActivated: Self = this.set("activated", js.undefined)
    
    @scala.inline
    def setActivating(value: (/* event */ Event, /* ui */ ActivatingEventUIParam) => Unit): Self = this.set("activating", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActivating: Self = this.set("activating", js.undefined)
    
    @scala.inline
    def setAllowToggling(value: Boolean): Self = this.set("allowToggling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowToggling: Self = this.set("allowToggling", js.undefined)
    
    @scala.inline
    def setDeactivated(value: (/* event */ Event, /* ui */ DeactivatedEventUIParam) => Unit): Self = this.set("deactivated", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeactivated: Self = this.set("deactivated", js.undefined)
    
    @scala.inline
    def setDeactivating(value: (/* event */ Event, /* ui */ DeactivatingEventUIParam) => Unit): Self = this.set("deactivating", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeactivating: Self = this.set("deactivating", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
  }
}
