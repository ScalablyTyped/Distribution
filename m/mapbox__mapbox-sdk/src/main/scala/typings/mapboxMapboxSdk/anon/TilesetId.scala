package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TilesetId extends StObject {
  
  var tilesetId: String
}
object TilesetId {
  
  inline def apply(tilesetId: String): TilesetId = {
    val __obj = js.Dynamic.literal(tilesetId = tilesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TilesetId]
  }
  
  extension [Self <: TilesetId](x: Self) {
    
    inline def setTilesetId(value: String): Self = StObject.set(x, "tilesetId", value.asInstanceOf[js.Any])
  }
}
