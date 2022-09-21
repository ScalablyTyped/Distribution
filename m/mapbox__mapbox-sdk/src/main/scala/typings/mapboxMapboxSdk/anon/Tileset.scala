package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tileset extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var tileset: String
  
  var url: String
}
object Tileset {
  
  inline def apply(tileset: String, url: String): Tileset = {
    val __obj = js.Dynamic.literal(tileset = tileset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tileset]
  }
  
  extension [Self <: Tileset](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTileset(value: String): Self = StObject.set(x, "tileset", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
