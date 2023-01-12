package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceRam extends StObject {
  
  /** Maximum RAM in bytes (bound excluded). */
  var maxBytes: js.UndefOr[String] = js.undefined
  
  /** Minimum RAM in bytes (bound included). */
  var minBytes: js.UndefOr[String] = js.undefined
}
object DeviceRam {
  
  inline def apply(): DeviceRam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceRam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceRam] (val x: Self) extends AnyVal {
    
    inline def setMaxBytes(value: String): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
    
    inline def setMinBytes(value: String): Self = StObject.set(x, "minBytes", value.asInstanceOf[js.Any])
    
    inline def setMinBytesUndefined: Self = StObject.set(x, "minBytes", js.undefined)
  }
}
