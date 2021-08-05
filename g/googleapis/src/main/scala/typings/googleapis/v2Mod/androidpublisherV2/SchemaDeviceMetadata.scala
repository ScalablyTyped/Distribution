package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceMetadata extends StObject {
  
  /**
    * Device CPU make e.g. &quot;Qualcomm&quot;
    */
  var cpuMake: js.UndefOr[String] = js.undefined
  
  /**
    * Device CPU model e.g. &quot;MSM8974&quot;
    */
  var cpuModel: js.UndefOr[String] = js.undefined
  
  /**
    * Device class (e.g. tablet)
    */
  var deviceClass: js.UndefOr[String] = js.undefined
  
  /**
    * OpenGL version
    */
  var glEsVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Device manufacturer (e.g. Motorola)
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * Comma separated list of native platforms (e.g. &quot;arm&quot;,
    * &quot;arm7&quot;)
    */
  var nativePlatform: js.UndefOr[String] = js.undefined
  
  /**
    * Device model name (e.g. Droid)
    */
  var productName: js.UndefOr[String] = js.undefined
  
  /**
    * Device RAM in Megabytes e.g. &quot;2048&quot;
    */
  var ramMb: js.UndefOr[Double] = js.undefined
  
  /**
    * Screen density in DPI
    */
  var screenDensityDpi: js.UndefOr[Double] = js.undefined
  
  /**
    * Screen height in pixels
    */
  var screenHeightPx: js.UndefOr[Double] = js.undefined
  
  /**
    * Screen width in pixels
    */
  var screenWidthPx: js.UndefOr[Double] = js.undefined
}
object SchemaDeviceMetadata {
  
  inline def apply(): SchemaDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceMetadata]
  }
  
  extension [Self <: SchemaDeviceMetadata](x: Self) {
    
    inline def setCpuMake(value: String): Self = StObject.set(x, "cpuMake", value.asInstanceOf[js.Any])
    
    inline def setCpuMakeUndefined: Self = StObject.set(x, "cpuMake", js.undefined)
    
    inline def setCpuModel(value: String): Self = StObject.set(x, "cpuModel", value.asInstanceOf[js.Any])
    
    inline def setCpuModelUndefined: Self = StObject.set(x, "cpuModel", js.undefined)
    
    inline def setDeviceClass(value: String): Self = StObject.set(x, "deviceClass", value.asInstanceOf[js.Any])
    
    inline def setDeviceClassUndefined: Self = StObject.set(x, "deviceClass", js.undefined)
    
    inline def setGlEsVersion(value: Double): Self = StObject.set(x, "glEsVersion", value.asInstanceOf[js.Any])
    
    inline def setGlEsVersionUndefined: Self = StObject.set(x, "glEsVersion", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setNativePlatform(value: String): Self = StObject.set(x, "nativePlatform", value.asInstanceOf[js.Any])
    
    inline def setNativePlatformUndefined: Self = StObject.set(x, "nativePlatform", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setRamMb(value: Double): Self = StObject.set(x, "ramMb", value.asInstanceOf[js.Any])
    
    inline def setRamMbUndefined: Self = StObject.set(x, "ramMb", js.undefined)
    
    inline def setScreenDensityDpi(value: Double): Self = StObject.set(x, "screenDensityDpi", value.asInstanceOf[js.Any])
    
    inline def setScreenDensityDpiUndefined: Self = StObject.set(x, "screenDensityDpi", js.undefined)
    
    inline def setScreenHeightPx(value: Double): Self = StObject.set(x, "screenHeightPx", value.asInstanceOf[js.Any])
    
    inline def setScreenHeightPxUndefined: Self = StObject.set(x, "screenHeightPx", js.undefined)
    
    inline def setScreenWidthPx(value: Double): Self = StObject.set(x, "screenWidthPx", value.asInstanceOf[js.Any])
    
    inline def setScreenWidthPxUndefined: Self = StObject.set(x, "screenWidthPx", js.undefined)
  }
}
