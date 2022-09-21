package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDerived extends StObject {
  
  /**
    * Output only. This contains the base image URL for the derived image occurrence.
    */
  var baseResourceUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of layers by which this image differs from the associated image basis.
    */
  var distance: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The fingerprint of the derived image.
    */
  var fingerprint: js.UndefOr[SchemaFingerprint] = js.undefined
  
  /**
    * This contains layer-specific metadata, if populated it has length "distance" and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
    */
  var layerInfo: js.UndefOr[js.Array[SchemaLayer]] = js.undefined
}
object SchemaDerived {
  
  inline def apply(): SchemaDerived = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDerived]
  }
  
  extension [Self <: SchemaDerived](x: Self) {
    
    inline def setBaseResourceUrl(value: String): Self = StObject.set(x, "baseResourceUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseResourceUrlNull: Self = StObject.set(x, "baseResourceUrl", null)
    
    inline def setBaseResourceUrlUndefined: Self = StObject.set(x, "baseResourceUrl", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceNull: Self = StObject.set(x, "distance", null)
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setFingerprint(value: SchemaFingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setLayerInfo(value: js.Array[SchemaLayer]): Self = StObject.set(x, "layerInfo", value.asInstanceOf[js.Any])
    
    inline def setLayerInfoUndefined: Self = StObject.set(x, "layerInfo", js.undefined)
    
    inline def setLayerInfoVarargs(value: SchemaLayer*): Self = StObject.set(x, "layerInfo", js.Array(value*))
  }
}
