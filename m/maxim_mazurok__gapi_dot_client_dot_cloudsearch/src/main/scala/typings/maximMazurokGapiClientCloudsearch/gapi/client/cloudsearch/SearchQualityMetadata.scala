package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQualityMetadata extends StObject {
  
  /** An indication of the quality of the item, used to influence search quality. Value should be between 0.0 (lowest quality) and 1.0 (highest quality). The default value is 0.0. */
  var quality: js.UndefOr[Double] = js.undefined
}
object SearchQualityMetadata {
  
  inline def apply(): SearchQualityMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchQualityMetadata]
  }
  
  extension [Self <: SearchQualityMetadata](x: Self) {
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
