package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HardwareStatus extends js.Object {
  
  /** Current battery temperatures in Celsius for each battery on the device. */
  var batteryTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /** Current CPU temperatures in Celsius for each CPU on the device. */
  var cpuTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /** CPU usages in percentage for each core available on the device. Usage is 0 for each unplugged core. Empty array implies that CPU usage is not supported in the system. */
  var cpuUsages: js.UndefOr[js.Array[Double]] = js.native
  
  /** The time the measurements were taken. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Fan speeds in RPM for each fan on the device. Empty array means that there are no fans or fan speed is not supported on the system. */
  var fanSpeeds: js.UndefOr[js.Array[Double]] = js.native
  
  /** Current GPU temperatures in Celsius for each GPU on the device. */
  var gpuTemperatures: js.UndefOr[js.Array[Double]] = js.native
  
  /** Current device skin temperatures in Celsius. */
  var skinTemperatures: js.UndefOr[js.Array[Double]] = js.native
}
object HardwareStatus {
  
  @scala.inline
  def apply(): HardwareStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HardwareStatus]
  }
  
  @scala.inline
  implicit class HardwareStatusOps[Self <: HardwareStatus] (val x: Self) extends AnyVal {
    
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
    def setBatteryTemperaturesVarargs(value: Double*): Self = this.set("batteryTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setBatteryTemperatures(value: js.Array[Double]): Self = this.set("batteryTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatteryTemperatures: Self = this.set("batteryTemperatures", js.undefined)
    
    @scala.inline
    def setCpuTemperaturesVarargs(value: Double*): Self = this.set("cpuTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setCpuTemperatures(value: js.Array[Double]): Self = this.set("cpuTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuTemperatures: Self = this.set("cpuTemperatures", js.undefined)
    
    @scala.inline
    def setCpuUsagesVarargs(value: Double*): Self = this.set("cpuUsages", js.Array(value :_*))
    
    @scala.inline
    def setCpuUsages(value: js.Array[Double]): Self = this.set("cpuUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuUsages: Self = this.set("cpuUsages", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setFanSpeedsVarargs(value: Double*): Self = this.set("fanSpeeds", js.Array(value :_*))
    
    @scala.inline
    def setFanSpeeds(value: js.Array[Double]): Self = this.set("fanSpeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFanSpeeds: Self = this.set("fanSpeeds", js.undefined)
    
    @scala.inline
    def setGpuTemperaturesVarargs(value: Double*): Self = this.set("gpuTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setGpuTemperatures(value: js.Array[Double]): Self = this.set("gpuTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpuTemperatures: Self = this.set("gpuTemperatures", js.undefined)
    
    @scala.inline
    def setSkinTemperaturesVarargs(value: Double*): Self = this.set("skinTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setSkinTemperatures(value: js.Array[Double]): Self = this.set("skinTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkinTemperatures: Self = this.set("skinTemperatures", js.undefined)
  }
}
