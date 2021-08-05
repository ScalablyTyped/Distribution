package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapId extends StObject {
  
  var mapId: String
  
  var tilesetName: js.UndefOr[String] = js.undefined
  
  var url: String
}
object MapId {
  
  inline def apply(mapId: String, url: String): MapId = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapId]
  }
  
  extension [Self <: MapId](x: Self) {
    
    inline def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    
    inline def setTilesetName(value: String): Self = StObject.set(x, "tilesetName", value.asInstanceOf[js.Any])
    
    inline def setTilesetNameUndefined: Self = StObject.set(x, "tilesetName", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
