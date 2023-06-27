package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.tms
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.vector
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.xyz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorSourceSpecification
  extends StObject
     with SourceSpecification {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var bounds: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.undefined
  
  var scheme: js.UndefOr[xyz | tms] = js.undefined
  
  var tiles: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: vector
  
  var url: js.UndefOr[String] = js.undefined
  
  var volatile: js.UndefOr[Boolean] = js.undefined
}
object VectorSourceSpecification {
  
  inline def apply(): VectorSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[VectorSourceSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorSourceSpecification] (val x: Self) extends AnyVal {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setBounds(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setPromoteId(value: PromoteIdSpecification): Self = StObject.set(x, "promoteId", value.asInstanceOf[js.Any])
    
    inline def setPromoteIdUndefined: Self = StObject.set(x, "promoteId", js.undefined)
    
    inline def setScheme(value: xyz | tms): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setTiles(value: js.Array[String]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    inline def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    inline def setTilesVarargs(value: String*): Self = StObject.set(x, "tiles", js.Array(value*))
    
    inline def setType(value: vector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVolatile(value: Boolean): Self = StObject.set(x, "volatile", value.asInstanceOf[js.Any])
    
    inline def setVolatileUndefined: Self = StObject.set(x, "volatile", js.undefined)
  }
}
