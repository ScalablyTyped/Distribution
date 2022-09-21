package typings.mapboxGl.mod

import typings.mapboxGl.anon.Signal
import typings.mapboxGl.anon.X
import typings.mapboxGl.mapboxGlStrings.custom
import typings.mapboxGl.mapboxGlStrings.raster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSourceInterface[T] extends StObject {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var bounds: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  
  var dataType: raster
  
  var hasTile: js.UndefOr[js.Function1[/* tileID */ X, Boolean]] = js.undefined
  
  var id: String
  
  def loadTile(tileID: X, options: Signal): js.Promise[T]
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var onAdd: js.UndefOr[js.Function1[/* map */ Map, Unit]] = js.undefined
  
  var onRemove: js.UndefOr[js.Function1[/* map */ Map, Unit]] = js.undefined
  
  var prepareTile: js.UndefOr[js.Function1[/* tileID */ X, js.UndefOr[T]]] = js.undefined
  
  var scheme: js.UndefOr[String] = js.undefined
  
  var tileSize: js.UndefOr[Double] = js.undefined
  
  var `type`: custom
  
  var unloadTile: js.UndefOr[js.Function1[/* tileID */ X, Unit]] = js.undefined
}
object CustomSourceInterface {
  
  inline def apply[T](id: String, loadTile: (X, Signal) => js.Promise[T]): CustomSourceInterface[T] = {
    val __obj = js.Dynamic.literal(dataType = "raster", id = id.asInstanceOf[js.Any], loadTile = js.Any.fromFunction2(loadTile))
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[CustomSourceInterface[T]]
  }
  
  extension [Self <: CustomSourceInterface[?], T](x: Self & CustomSourceInterface[T]) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setBounds(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setDataType(value: raster): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setHasTile(value: /* tileID */ X => Boolean): Self = StObject.set(x, "hasTile", js.Any.fromFunction1(value))
    
    inline def setHasTileUndefined: Self = StObject.set(x, "hasTile", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLoadTile(value: (X, Signal) => js.Promise[T]): Self = StObject.set(x, "loadTile", js.Any.fromFunction2(value))
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setOnAdd(value: /* map */ Map => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnRemove(value: /* map */ Map => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setPrepareTile(value: /* tileID */ X => js.UndefOr[T]): Self = StObject.set(x, "prepareTile", js.Any.fromFunction1(value))
    
    inline def setPrepareTileUndefined: Self = StObject.set(x, "prepareTile", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnloadTile(value: /* tileID */ X => Unit): Self = StObject.set(x, "unloadTile", js.Any.fromFunction1(value))
    
    inline def setUnloadTileUndefined: Self = StObject.set(x, "unloadTile", js.undefined)
  }
}
