package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoundZoom extends StObject {
  
  var roundZoom: js.UndefOr[Boolean] = js.undefined
  
  var tileSize: Double
}
object RoundZoom {
  
  inline def apply(tileSize: Double): RoundZoom = {
    val __obj = js.Dynamic.literal(tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundZoom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoundZoom] (val x: Self) extends AnyVal {
    
    inline def setRoundZoom(value: Boolean): Self = StObject.set(x, "roundZoom", value.asInstanceOf[js.Any])
    
    inline def setRoundZoomUndefined: Self = StObject.set(x, "roundZoom", js.undefined)
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
  }
}
