package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'refreshExpiredTiles'> */
trait PickMapOptionsrefreshExpi extends StObject {
  
  var refreshExpiredTiles: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsrefreshExpi {
  
  inline def apply(): PickMapOptionsrefreshExpi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsrefreshExpi]
  }
  
  extension [Self <: PickMapOptionsrefreshExpi](x: Self) {
    
    inline def setRefreshExpiredTiles(value: Boolean): Self = StObject.set(x, "refreshExpiredTiles", value.asInstanceOf[js.Any])
    
    inline def setRefreshExpiredTilesUndefined: Self = StObject.set(x, "refreshExpiredTiles", js.undefined)
  }
}
