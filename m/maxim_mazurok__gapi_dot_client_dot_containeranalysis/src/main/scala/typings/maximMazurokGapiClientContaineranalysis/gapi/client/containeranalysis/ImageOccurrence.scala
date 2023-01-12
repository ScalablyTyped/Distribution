package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageOccurrence extends StObject {
  
  /** Output only. This contains the base image URL for the derived image occurrence. */
  var baseResourceUrl: js.UndefOr[String] = js.undefined
  
  /** Output only. The number of layers by which this image differs from the associated image basis. */
  var distance: js.UndefOr[Double] = js.undefined
  
  /** Required. The fingerprint of the derived image. */
  var fingerprint: js.UndefOr[Fingerprint] = js.undefined
  
  /**
    * This contains layer-specific metadata, if populated it has length "distance" and is ordered with [distance] being the layer immediately following the base image and [1] being the
    * final layer.
    */
  var layerInfo: js.UndefOr[js.Array[Layer]] = js.undefined
}
object ImageOccurrence {
  
  inline def apply(): ImageOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOccurrence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageOccurrence] (val x: Self) extends AnyVal {
    
    inline def setBaseResourceUrl(value: String): Self = StObject.set(x, "baseResourceUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseResourceUrlUndefined: Self = StObject.set(x, "baseResourceUrl", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setFingerprint(value: Fingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setLayerInfo(value: js.Array[Layer]): Self = StObject.set(x, "layerInfo", value.asInstanceOf[js.Any])
    
    inline def setLayerInfoUndefined: Self = StObject.set(x, "layerInfo", js.undefined)
    
    inline def setLayerInfoVarargs(value: Layer*): Self = StObject.set(x, "layerInfo", js.Array(value*))
  }
}
