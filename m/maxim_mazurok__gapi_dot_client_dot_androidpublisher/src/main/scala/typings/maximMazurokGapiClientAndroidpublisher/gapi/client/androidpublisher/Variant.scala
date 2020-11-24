package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variant extends js.Object {
  
  /** The device spec used to generate the APK. */
  var deviceSpec: js.UndefOr[DeviceSpec] = js.native
  
  /** Output only. The ID of a previously created system APK variant. */
  var variantId: js.UndefOr[Double] = js.native
}
object Variant {
  
  @scala.inline
  def apply(): Variant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variant]
  }
  
  @scala.inline
  implicit class VariantOps[Self <: Variant] (val x: Self) extends AnyVal {
    
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
    def setDeviceSpec(value: DeviceSpec): Self = this.set("deviceSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSpec: Self = this.set("deviceSpec", js.undefined)
    
    @scala.inline
    def setVariantId(value: Double): Self = this.set("variantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariantId: Self = this.set("variantId", js.undefined)
  }
}
