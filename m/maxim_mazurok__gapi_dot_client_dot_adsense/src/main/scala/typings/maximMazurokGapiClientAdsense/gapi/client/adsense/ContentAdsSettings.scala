package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentAdsSettings extends StObject {
  
  /** Required. Size of the ad unit. e.g. "728x90", "1x3" (for responsive ad units). */
  var size: js.UndefOr[String] = js.undefined
  
  /** Required. Type of the ad unit. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ContentAdsSettings {
  
  inline def apply(): ContentAdsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentAdsSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentAdsSettings] (val x: Self) extends AnyVal {
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
