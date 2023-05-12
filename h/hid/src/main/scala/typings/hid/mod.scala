package typings.hid

import typings.hid.hidInts.`0`
import typings.hid.hidInts.`1`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enumerate(): js.Array[DeviceDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")().asInstanceOf[js.Array[DeviceDescriptor]]
  inline def enumerate(vendor_id: Double): js.Array[DeviceDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(vendor_id.asInstanceOf[js.Any]).asInstanceOf[js.Array[DeviceDescriptor]]
  inline def enumerate(vendor_id: Double, product_id: Double): js.Array[DeviceDescriptor] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(vendor_id.asInstanceOf[js.Any], product_id.asInstanceOf[js.Any])).asInstanceOf[js.Array[DeviceDescriptor]]
  inline def enumerate(vendor_id: Unit, product_id: Double): js.Array[DeviceDescriptor] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(vendor_id.asInstanceOf[js.Any], product_id.asInstanceOf[js.Any])).asInstanceOf[js.Array[DeviceDescriptor]]
  
  inline def getFeatureReport(device: OpaqueDevice, data: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get_feature_report")(device.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getFeatureReportAsync(
    device: OpaqueDevice,
    data: Buffer,
    cb: js.Function2[/* error */ js.Error, /* data */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get_feature_report_async")(device.asInstanceOf[js.Any], data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def open(vendor_id: Double, product_id: Double): OpaqueDevice = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(vendor_id.asInstanceOf[js.Any], product_id.asInstanceOf[js.Any])).asInstanceOf[OpaqueDevice]
  inline def open(vendor_id: Double, product_id: Double, serial_number: String): OpaqueDevice = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(vendor_id.asInstanceOf[js.Any], product_id.asInstanceOf[js.Any], serial_number.asInstanceOf[js.Any])).asInstanceOf[OpaqueDevice]
  
  inline def openPath(path: String): OpaqueDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("open_path")(path.asInstanceOf[js.Any]).asInstanceOf[OpaqueDevice]
  
  inline def read(device: OpaqueDevice, data: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(device.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readAsync(
    device: OpaqueDevice,
    data: Buffer,
    cb: js.Function2[/* error */ js.Error, /* bytes */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read_async")(device.asInstanceOf[js.Any], data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readTimeout(device: OpaqueDevice, data: Buffer, milliseconds: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read_timeout")(device.asInstanceOf[js.Any], data.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readTimeoutAsync(
    device: OpaqueDevice,
    data: Buffer,
    milliseconds: Double,
    cb: js.Function2[/* error */ js.Error, /* bytes */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read_timeout_async")(device.asInstanceOf[js.Any], data.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendFeatureReport(device: OpaqueDevice, data: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("send_feature_report")(device.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setNonblocking(device: OpaqueDevice, nonblock: `0` | `1`): `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("set_nonblocking")(device.asInstanceOf[js.Any], nonblock.asInstanceOf[js.Any])).asInstanceOf[`0`]
  
  inline def write(device: OpaqueDevice, data: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(device.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait DeviceDescriptor extends StObject {
    
    var interface_number: Double
    
    var manufacturer_string: String
    
    var product_id: Double
    
    var product_string: String
    
    var release_number: Double
    
    var serial_number: String
    
    var usage: Double
    
    var usage_page: Double
    
    var vendor_id: Double
  }
  object DeviceDescriptor {
    
    inline def apply(
      interface_number: Double,
      manufacturer_string: String,
      product_id: Double,
      product_string: String,
      release_number: Double,
      serial_number: String,
      usage: Double,
      usage_page: Double,
      vendor_id: Double
    ): DeviceDescriptor = {
      val __obj = js.Dynamic.literal(interface_number = interface_number.asInstanceOf[js.Any], manufacturer_string = manufacturer_string.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], product_string = product_string.asInstanceOf[js.Any], release_number = release_number.asInstanceOf[js.Any], serial_number = serial_number.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usage_page = usage_page.asInstanceOf[js.Any], vendor_id = vendor_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceDescriptor] (val x: Self) extends AnyVal {
      
      inline def setInterface_number(value: Double): Self = StObject.set(x, "interface_number", value.asInstanceOf[js.Any])
      
      inline def setManufacturer_string(value: String): Self = StObject.set(x, "manufacturer_string", value.asInstanceOf[js.Any])
      
      inline def setProduct_id(value: Double): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
      
      inline def setProduct_string(value: String): Self = StObject.set(x, "product_string", value.asInstanceOf[js.Any])
      
      inline def setRelease_number(value: Double): Self = StObject.set(x, "release_number", value.asInstanceOf[js.Any])
      
      inline def setSerial_number(value: String): Self = StObject.set(x, "serial_number", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsage_page(value: Double): Self = StObject.set(x, "usage_page", value.asInstanceOf[js.Any])
      
      inline def setVendor_id(value: Double): Self = StObject.set(x, "vendor_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpaqueDevice extends StObject
}
