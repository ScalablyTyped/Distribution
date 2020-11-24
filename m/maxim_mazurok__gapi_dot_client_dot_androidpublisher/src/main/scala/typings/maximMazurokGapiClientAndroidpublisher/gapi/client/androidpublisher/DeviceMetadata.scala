package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMetadata extends js.Object {
  
  /** Device CPU make, e.g. "Qualcomm" */
  var cpuMake: js.UndefOr[String] = js.native
  
  /** Device CPU model, e.g. "MSM8974" */
  var cpuModel: js.UndefOr[String] = js.native
  
  /** Device class (e.g. tablet) */
  var deviceClass: js.UndefOr[String] = js.native
  
  /** OpenGL version */
  var glEsVersion: js.UndefOr[Double] = js.native
  
  /** Device manufacturer (e.g. Motorola) */
  var manufacturer: js.UndefOr[String] = js.native
  
  /** Comma separated list of native platforms (e.g. "arm", "arm7") */
  var nativePlatform: js.UndefOr[String] = js.native
  
  /** Device model name (e.g. Droid) */
  var productName: js.UndefOr[String] = js.native
  
  /** Device RAM in Megabytes, e.g. "2048" */
  var ramMb: js.UndefOr[Double] = js.native
  
  /** Screen density in DPI */
  var screenDensityDpi: js.UndefOr[Double] = js.native
  
  /** Screen height in pixels */
  var screenHeightPx: js.UndefOr[Double] = js.native
  
  /** Screen width in pixels */
  var screenWidthPx: js.UndefOr[Double] = js.native
}
object DeviceMetadata {
  
  @scala.inline
  def apply(): DeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMetadata]
  }
  
  @scala.inline
  implicit class DeviceMetadataOps[Self <: DeviceMetadata] (val x: Self) extends AnyVal {
    
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
    def setCpuMake(value: String): Self = this.set("cpuMake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuMake: Self = this.set("cpuMake", js.undefined)
    
    @scala.inline
    def setCpuModel(value: String): Self = this.set("cpuModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuModel: Self = this.set("cpuModel", js.undefined)
    
    @scala.inline
    def setDeviceClass(value: String): Self = this.set("deviceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceClass: Self = this.set("deviceClass", js.undefined)
    
    @scala.inline
    def setGlEsVersion(value: Double): Self = this.set("glEsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlEsVersion: Self = this.set("glEsVersion", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setNativePlatform(value: String): Self = this.set("nativePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativePlatform: Self = this.set("nativePlatform", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    
    @scala.inline
    def setRamMb(value: Double): Self = this.set("ramMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamMb: Self = this.set("ramMb", js.undefined)
    
    @scala.inline
    def setScreenDensityDpi(value: Double): Self = this.set("screenDensityDpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenDensityDpi: Self = this.set("screenDensityDpi", js.undefined)
    
    @scala.inline
    def setScreenHeightPx(value: Double): Self = this.set("screenHeightPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenHeightPx: Self = this.set("screenHeightPx", js.undefined)
    
    @scala.inline
    def setScreenWidthPx(value: Double): Self = this.set("screenWidthPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenWidthPx: Self = this.set("screenWidthPx", js.undefined)
  }
}
