package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WipeAction extends js.Object {
  
  /** Whether the factory-reset protection data is preserved on the device. This setting doesn’t apply to work profiles. */
  var preserveFrp: js.UndefOr[Boolean] = js.native
  
  /** Number of days the policy is non-compliant before the device or work profile is wiped. wipeAfterDays must be greater than blockAfterDays. */
  var wipeAfterDays: js.UndefOr[Double] = js.native
}
object WipeAction {
  
  @scala.inline
  def apply(): WipeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WipeAction]
  }
  
  @scala.inline
  implicit class WipeActionOps[Self <: WipeAction] (val x: Self) extends AnyVal {
    
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
    def setPreserveFrp(value: Boolean): Self = this.set("preserveFrp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveFrp: Self = this.set("preserveFrp", js.undefined)
    
    @scala.inline
    def setWipeAfterDays(value: Double): Self = this.set("wipeAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWipeAfterDays: Self = this.set("wipeAfterDays", js.undefined)
  }
}
