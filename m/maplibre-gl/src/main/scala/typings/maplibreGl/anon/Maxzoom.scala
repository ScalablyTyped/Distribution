package typings.maplibreGl.anon

import typings.maplibreGl.mod.Terrain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxzoom extends StObject {
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var renderWorldCopies: js.UndefOr[Boolean] = js.undefined
  
  var reparseOverscaled: js.UndefOr[Boolean] = js.undefined
  
  var roundZoom: js.UndefOr[Boolean] = js.undefined
  
  var terrain: js.UndefOr[Terrain] = js.undefined
  
  var tileSize: Double
}
object Maxzoom {
  
  inline def apply(tileSize: Double): Maxzoom = {
    val __obj = js.Dynamic.literal(tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxzoom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maxzoom] (val x: Self) extends AnyVal {
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setRenderWorldCopies(value: Boolean): Self = StObject.set(x, "renderWorldCopies", value.asInstanceOf[js.Any])
    
    inline def setRenderWorldCopiesUndefined: Self = StObject.set(x, "renderWorldCopies", js.undefined)
    
    inline def setReparseOverscaled(value: Boolean): Self = StObject.set(x, "reparseOverscaled", value.asInstanceOf[js.Any])
    
    inline def setReparseOverscaledUndefined: Self = StObject.set(x, "reparseOverscaled", js.undefined)
    
    inline def setRoundZoom(value: Boolean): Self = StObject.set(x, "roundZoom", value.asInstanceOf[js.Any])
    
    inline def setRoundZoomUndefined: Self = StObject.set(x, "roundZoom", js.undefined)
    
    inline def setTerrain(value: Terrain): Self = StObject.set(x, "terrain", value.asInstanceOf[js.Any])
    
    inline def setTerrainUndefined: Self = StObject.set(x, "terrain", js.undefined)
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
  }
}
