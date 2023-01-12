package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.mapbox
import typings.maplibreGl.maplibreGlStrings.terrarium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  var bounds: js.Tuple4[Double, Double, Double, Double]
  
  var encoding: mapbox | terrarium
  
  var tileSize: Double
  
  var tiles: js.Array[String]
  
  var `type`: String
  
  var url: String
}
object Bounds {
  
  inline def apply(
    bounds: js.Tuple4[Double, Double, Double, Double],
    encoding: mapbox | terrarium,
    tileSize: Double,
    tiles: js.Array[String],
    `type`: String,
    url: String
  ): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: mapbox | terrarium): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTiles(value: js.Array[String]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    inline def setTilesVarargs(value: String*): Self = StObject.set(x, "tiles", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
