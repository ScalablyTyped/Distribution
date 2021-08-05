package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSpec extends StObject {
  
  /** Screen dpi. */
  var screenDensity: js.UndefOr[Double] = js.undefined
  
  /** Supported ABI architectures in the order of preference. The values should be the string as reported by the platform, e.g. "armeabi-v7a", "x86_64". */
  var supportedAbis: js.UndefOr[js.Array[String]] = js.undefined
  
  /** All installed locales represented as BCP-47 strings, e.g. "en-US". */
  var supportedLocales: js.UndefOr[js.Array[String]] = js.undefined
}
object DeviceSpec {
  
  inline def apply(): DeviceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSpec]
  }
  
  extension [Self <: DeviceSpec](x: Self) {
    
    inline def setScreenDensity(value: Double): Self = StObject.set(x, "screenDensity", value.asInstanceOf[js.Any])
    
    inline def setScreenDensityUndefined: Self = StObject.set(x, "screenDensity", js.undefined)
    
    inline def setSupportedAbis(value: js.Array[String]): Self = StObject.set(x, "supportedAbis", value.asInstanceOf[js.Any])
    
    inline def setSupportedAbisUndefined: Self = StObject.set(x, "supportedAbis", js.undefined)
    
    inline def setSupportedAbisVarargs(value: String*): Self = StObject.set(x, "supportedAbis", js.Array(value :_*))
    
    inline def setSupportedLocales(value: js.Array[String]): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
    
    inline def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
    
    inline def setSupportedLocalesVarargs(value: String*): Self = StObject.set(x, "supportedLocales", js.Array(value :_*))
  }
}
