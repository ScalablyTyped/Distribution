package typings.maximMazurokGapiClientCompute.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuestAcceleratorCount extends js.Object {
  
  /** Number of accelerator cards exposed to the guest. */
  var guestAcceleratorCount: js.UndefOr[Double] = js.native
  
  /** The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'. */
  var guestAcceleratorType: js.UndefOr[String] = js.native
}
object GuestAcceleratorCount {
  
  @scala.inline
  def apply(): GuestAcceleratorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestAcceleratorCount]
  }
  
  @scala.inline
  implicit class GuestAcceleratorCountOps[Self <: GuestAcceleratorCount] (val x: Self) extends AnyVal {
    
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
    def setGuestAcceleratorCount(value: Double): Self = this.set("guestAcceleratorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestAcceleratorCount: Self = this.set("guestAcceleratorCount", js.undefined)
    
    @scala.inline
    def setGuestAcceleratorType(value: String): Self = this.set("guestAcceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestAcceleratorType: Self = this.set("guestAcceleratorType", js.undefined)
  }
}
