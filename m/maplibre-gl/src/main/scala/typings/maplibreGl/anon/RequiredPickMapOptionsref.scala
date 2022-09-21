package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'refreshExpiredTiles'>> */
trait RequiredPickMapOptionsref extends StObject {
  
  var refreshExpiredTiles: Boolean
}
object RequiredPickMapOptionsref {
  
  inline def apply(refreshExpiredTiles: Boolean): RequiredPickMapOptionsref = {
    val __obj = js.Dynamic.literal(refreshExpiredTiles = refreshExpiredTiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsref]
  }
  
  extension [Self <: RequiredPickMapOptionsref](x: Self) {
    
    inline def setRefreshExpiredTiles(value: Boolean): Self = StObject.set(x, "refreshExpiredTiles", value.asInstanceOf[js.Any])
  }
}
