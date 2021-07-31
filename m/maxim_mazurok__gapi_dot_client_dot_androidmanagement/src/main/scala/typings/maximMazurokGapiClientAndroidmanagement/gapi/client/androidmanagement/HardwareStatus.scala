package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HardwareStatus extends StObject {
  
  /** Current battery temperatures in Celsius for each battery on the device. */
  var batteryTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Current CPU temperatures in Celsius for each CPU on the device. */
  var cpuTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** CPU usages in percentage for each core available on the device. Usage is 0 for each unplugged core. Empty array implies that CPU usage is not supported in the system. */
  var cpuUsages: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The time the measurements were taken. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Fan speeds in RPM for each fan on the device. Empty array means that there are no fans or fan speed is not supported on the system. */
  var fanSpeeds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Current GPU temperatures in Celsius for each GPU on the device. */
  var gpuTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Current device skin temperatures in Celsius. */
  var skinTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
}
object HardwareStatus {
  
  @scala.inline
  def apply(): HardwareStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HardwareStatus]
  }
  
  @scala.inline
  implicit class HardwareStatusMutableBuilder[Self <: HardwareStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatteryTemperatures(value: js.Array[Double]): Self = StObject.set(x, "batteryTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatteryTemperaturesUndefined: Self = StObject.set(x, "batteryTemperatures", js.undefined)
    
    @scala.inline
    def setBatteryTemperaturesVarargs(value: Double*): Self = StObject.set(x, "batteryTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setCpuTemperatures(value: js.Array[Double]): Self = StObject.set(x, "cpuTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuTemperaturesUndefined: Self = StObject.set(x, "cpuTemperatures", js.undefined)
    
    @scala.inline
    def setCpuTemperaturesVarargs(value: Double*): Self = StObject.set(x, "cpuTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setCpuUsages(value: js.Array[Double]): Self = StObject.set(x, "cpuUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUsagesUndefined: Self = StObject.set(x, "cpuUsages", js.undefined)
    
    @scala.inline
    def setCpuUsagesVarargs(value: Double*): Self = StObject.set(x, "cpuUsages", js.Array(value :_*))
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setFanSpeeds(value: js.Array[Double]): Self = StObject.set(x, "fanSpeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFanSpeedsUndefined: Self = StObject.set(x, "fanSpeeds", js.undefined)
    
    @scala.inline
    def setFanSpeedsVarargs(value: Double*): Self = StObject.set(x, "fanSpeeds", js.Array(value :_*))
    
    @scala.inline
    def setGpuTemperatures(value: js.Array[Double]): Self = StObject.set(x, "gpuTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpuTemperaturesUndefined: Self = StObject.set(x, "gpuTemperatures", js.undefined)
    
    @scala.inline
    def setGpuTemperaturesVarargs(value: Double*): Self = StObject.set(x, "gpuTemperatures", js.Array(value :_*))
    
    @scala.inline
    def setSkinTemperatures(value: js.Array[Double]): Self = StObject.set(x, "skinTemperatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinTemperaturesUndefined: Self = StObject.set(x, "skinTemperatures", js.undefined)
    
    @scala.inline
    def setSkinTemperaturesVarargs(value: Double*): Self = StObject.set(x, "skinTemperatures", js.Array(value :_*))
  }
}
