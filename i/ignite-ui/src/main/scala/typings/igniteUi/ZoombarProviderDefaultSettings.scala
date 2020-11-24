package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoombarProviderDefaultSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Contains the target component's instance
    */
  var targetObject: js.UndefOr[js.Any] = js.native
  
  /**
    * Expects two parameters
    * a jQuery Event to pass as original for Zoombar's own zoomChanged event
    * an object with the following structure:
    * {
    * oldLeft: number,
    * oldWidth: number,
    * newLeft: number,
    * newWdith: number
    * }
    * The values should represent the fractions of the total width of the zoomed component in a number ranging from 0 to 1
    */
  var zoomChangedCallback: js.UndefOr[js.Any] = js.native
}
object ZoombarProviderDefaultSettings {
  
  @scala.inline
  def apply(): ZoombarProviderDefaultSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoombarProviderDefaultSettings]
  }
  
  @scala.inline
  implicit class ZoombarProviderDefaultSettingsOps[Self <: ZoombarProviderDefaultSettings] (val x: Self) extends AnyVal {
    
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
    def setTargetObject(value: js.Any): Self = this.set("targetObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetObject: Self = this.set("targetObject", js.undefined)
    
    @scala.inline
    def setZoomChangedCallback(value: js.Any): Self = this.set("zoomChangedCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomChangedCallback: Self = this.set("zoomChangedCallback", js.undefined)
  }
}
