package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HardwareInfo extends StObject {
  
  /** Battery shutdown temperature thresholds in Celsius for each battery on the device. */
  var batteryShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Battery throttling temperature thresholds in Celsius for each battery on the device. */
  var batteryThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Brand of the device. For example, Google. */
  var brand: js.UndefOr[String] = js.undefined
  
  /** CPU shutdown temperature thresholds in Celsius for each CPU on the device. */
  var cpuShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** CPU throttling temperature thresholds in Celsius for each CPU on the device. */
  var cpuThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Baseband version. For example, MDM9625_104662.22.05.34p. */
  var deviceBasebandVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. ID that uniquely identifies a personally-owned device in a particular organization. On the same physical device when enrolled with the same organization, this ID
    * persists across setups and even factory resets. This ID is available on personally-owned devices with a work profile on devices running Android 12 and above.
    */
  var enterpriseSpecificId: js.UndefOr[String] = js.undefined
  
  /** GPU shutdown temperature thresholds in Celsius for each GPU on the device. */
  var gpuShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** GPU throttling temperature thresholds in Celsius for each GPU on the device. */
  var gpuThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Name of the hardware. For example, Angler. */
  var hardware: js.UndefOr[String] = js.undefined
  
  /** Manufacturer. For example, Motorola. */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /** The model of the device. For example, Asus Nexus 7. */
  var model: js.UndefOr[String] = js.undefined
  
  /** The device serial number. */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /** Device skin shutdown temperature thresholds in Celsius. */
  var skinShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Device skin throttling temperature thresholds in Celsius. */
  var skinThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.undefined
}
object HardwareInfo {
  
  inline def apply(): HardwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HardwareInfo]
  }
  
  extension [Self <: HardwareInfo](x: Self) {
    
    inline def setBatteryShutdownTemperatures(value: js.Array[Double]): Self = StObject.set(x, "batteryShutdownTemperatures", value.asInstanceOf[js.Any])
    
    inline def setBatteryShutdownTemperaturesUndefined: Self = StObject.set(x, "batteryShutdownTemperatures", js.undefined)
    
    inline def setBatteryShutdownTemperaturesVarargs(value: Double*): Self = StObject.set(x, "batteryShutdownTemperatures", js.Array(value*))
    
    inline def setBatteryThrottlingTemperatures(value: js.Array[Double]): Self = StObject.set(x, "batteryThrottlingTemperatures", value.asInstanceOf[js.Any])
    
    inline def setBatteryThrottlingTemperaturesUndefined: Self = StObject.set(x, "batteryThrottlingTemperatures", js.undefined)
    
    inline def setBatteryThrottlingTemperaturesVarargs(value: Double*): Self = StObject.set(x, "batteryThrottlingTemperatures", js.Array(value*))
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCpuShutdownTemperatures(value: js.Array[Double]): Self = StObject.set(x, "cpuShutdownTemperatures", value.asInstanceOf[js.Any])
    
    inline def setCpuShutdownTemperaturesUndefined: Self = StObject.set(x, "cpuShutdownTemperatures", js.undefined)
    
    inline def setCpuShutdownTemperaturesVarargs(value: Double*): Self = StObject.set(x, "cpuShutdownTemperatures", js.Array(value*))
    
    inline def setCpuThrottlingTemperatures(value: js.Array[Double]): Self = StObject.set(x, "cpuThrottlingTemperatures", value.asInstanceOf[js.Any])
    
    inline def setCpuThrottlingTemperaturesUndefined: Self = StObject.set(x, "cpuThrottlingTemperatures", js.undefined)
    
    inline def setCpuThrottlingTemperaturesVarargs(value: Double*): Self = StObject.set(x, "cpuThrottlingTemperatures", js.Array(value*))
    
    inline def setDeviceBasebandVersion(value: String): Self = StObject.set(x, "deviceBasebandVersion", value.asInstanceOf[js.Any])
    
    inline def setDeviceBasebandVersionUndefined: Self = StObject.set(x, "deviceBasebandVersion", js.undefined)
    
    inline def setEnterpriseSpecificId(value: String): Self = StObject.set(x, "enterpriseSpecificId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseSpecificIdUndefined: Self = StObject.set(x, "enterpriseSpecificId", js.undefined)
    
    inline def setGpuShutdownTemperatures(value: js.Array[Double]): Self = StObject.set(x, "gpuShutdownTemperatures", value.asInstanceOf[js.Any])
    
    inline def setGpuShutdownTemperaturesUndefined: Self = StObject.set(x, "gpuShutdownTemperatures", js.undefined)
    
    inline def setGpuShutdownTemperaturesVarargs(value: Double*): Self = StObject.set(x, "gpuShutdownTemperatures", js.Array(value*))
    
    inline def setGpuThrottlingTemperatures(value: js.Array[Double]): Self = StObject.set(x, "gpuThrottlingTemperatures", value.asInstanceOf[js.Any])
    
    inline def setGpuThrottlingTemperaturesUndefined: Self = StObject.set(x, "gpuThrottlingTemperatures", js.undefined)
    
    inline def setGpuThrottlingTemperaturesVarargs(value: Double*): Self = StObject.set(x, "gpuThrottlingTemperatures", js.Array(value*))
    
    inline def setHardware(value: String): Self = StObject.set(x, "hardware", value.asInstanceOf[js.Any])
    
    inline def setHardwareUndefined: Self = StObject.set(x, "hardware", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSkinShutdownTemperatures(value: js.Array[Double]): Self = StObject.set(x, "skinShutdownTemperatures", value.asInstanceOf[js.Any])
    
    inline def setSkinShutdownTemperaturesUndefined: Self = StObject.set(x, "skinShutdownTemperatures", js.undefined)
    
    inline def setSkinShutdownTemperaturesVarargs(value: Double*): Self = StObject.set(x, "skinShutdownTemperatures", js.Array(value*))
    
    inline def setSkinThrottlingTemperatures(value: js.Array[Double]): Self = StObject.set(x, "skinThrottlingTemperatures", value.asInstanceOf[js.Any])
    
    inline def setSkinThrottlingTemperaturesUndefined: Self = StObject.set(x, "skinThrottlingTemperatures", js.undefined)
    
    inline def setSkinThrottlingTemperaturesVarargs(value: Double*): Self = StObject.set(x, "skinThrottlingTemperatures", js.Array(value*))
  }
}
