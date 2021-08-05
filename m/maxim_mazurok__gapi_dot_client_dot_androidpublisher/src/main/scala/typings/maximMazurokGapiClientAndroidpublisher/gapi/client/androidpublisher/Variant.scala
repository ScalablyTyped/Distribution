package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variant extends StObject {
  
  /** The device spec used to generate the APK. */
  var deviceSpec: js.UndefOr[DeviceSpec] = js.undefined
  
  /** Output only. The ID of a previously created system APK variant. */
  var variantId: js.UndefOr[Double] = js.undefined
}
object Variant {
  
  inline def apply(): Variant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variant]
  }
  
  extension [Self <: Variant](x: Self) {
    
    inline def setDeviceSpec(value: DeviceSpec): Self = StObject.set(x, "deviceSpec", value.asInstanceOf[js.Any])
    
    inline def setDeviceSpecUndefined: Self = StObject.set(x, "deviceSpec", js.undefined)
    
    inline def setVariantId(value: Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    inline def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
