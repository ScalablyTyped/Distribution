package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WipeAction extends StObject {
  
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
  implicit class WipeActionMutableBuilder[Self <: WipeAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreserveFrp(value: Boolean): Self = StObject.set(x, "preserveFrp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveFrpUndefined: Self = StObject.set(x, "preserveFrp", js.undefined)
    
    @scala.inline
    def setWipeAfterDays(value: Double): Self = StObject.set(x, "wipeAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWipeAfterDaysUndefined: Self = StObject.set(x, "wipeAfterDays", js.undefined)
  }
}
