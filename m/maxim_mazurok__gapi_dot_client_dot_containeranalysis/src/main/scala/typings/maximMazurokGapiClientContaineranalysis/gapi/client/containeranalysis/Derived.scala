package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Derived extends StObject {
  
  /** Output only. This contains the base image URL for the derived image occurrence. */
  var baseResourceUrl: js.UndefOr[String] = js.native
  
  /** Output only. The number of layers by which this image differs from the associated image basis. */
  var distance: js.UndefOr[Double] = js.native
  
  /** Required. The fingerprint of the derived image. */
  var fingerprint: js.UndefOr[Fingerprint] = js.native
  
  /**
    * This contains layer-specific metadata, if populated it has length "distance" and is ordered with [distance] being the layer immediately following the base image and [1] being the
    * final layer.
    */
  var layerInfo: js.UndefOr[js.Array[Layer]] = js.native
}
object Derived {
  
  @scala.inline
  def apply(): Derived = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Derived]
  }
  
  @scala.inline
  implicit class DerivedMutableBuilder[Self <: Derived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseResourceUrl(value: String): Self = StObject.set(x, "baseResourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseResourceUrlUndefined: Self = StObject.set(x, "baseResourceUrl", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setFingerprint(value: Fingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setLayerInfo(value: js.Array[Layer]): Self = StObject.set(x, "layerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerInfoUndefined: Self = StObject.set(x, "layerInfo", js.undefined)
    
    @scala.inline
    def setLayerInfoVarargs(value: Layer*): Self = StObject.set(x, "layerInfo", js.Array(value :_*))
  }
}
