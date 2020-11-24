package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KioskCustomization extends js.Object {
  
  /** Specifies whether the Settings app is allowed in kiosk mode. */
  var deviceSettings: js.UndefOr[String] = js.native
  
  /** Sets the behavior of a device in kiosk mode when a user presses and holds (long-presses) the Power button. */
  var powerButtonActions: js.UndefOr[String] = js.native
  
  /** Specifies whether system info and notifications are disabled in kiosk mode. */
  var statusBar: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether system error dialogs for crashed or unresponsive apps are blocked in kiosk mode. When blocked, the system will force-stop the app as if the user chooses the "close
    * app" option on the UI.
    */
  var systemErrorWarnings: js.UndefOr[String] = js.native
  
  /** Specifies which navigation features are enabled (e.g. Home, Overview buttons) in kiosk mode. */
  var systemNavigation: js.UndefOr[String] = js.native
}
object KioskCustomization {
  
  @scala.inline
  def apply(): KioskCustomization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KioskCustomization]
  }
  
  @scala.inline
  implicit class KioskCustomizationOps[Self <: KioskCustomization] (val x: Self) extends AnyVal {
    
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
    def setDeviceSettings(value: String): Self = this.set("deviceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSettings: Self = this.set("deviceSettings", js.undefined)
    
    @scala.inline
    def setPowerButtonActions(value: String): Self = this.set("powerButtonActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerButtonActions: Self = this.set("powerButtonActions", js.undefined)
    
    @scala.inline
    def setStatusBar(value: String): Self = this.set("statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBar: Self = this.set("statusBar", js.undefined)
    
    @scala.inline
    def setSystemErrorWarnings(value: String): Self = this.set("systemErrorWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemErrorWarnings: Self = this.set("systemErrorWarnings", js.undefined)
    
    @scala.inline
    def setSystemNavigation(value: String): Self = this.set("systemNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemNavigation: Self = this.set("systemNavigation", js.undefined)
  }
}
