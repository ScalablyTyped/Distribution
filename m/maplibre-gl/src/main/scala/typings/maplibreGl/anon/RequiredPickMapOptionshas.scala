package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'hash'>> */
trait RequiredPickMapOptionshas extends StObject {
  
  var hash: Boolean | String
}
object RequiredPickMapOptionshas {
  
  inline def apply(hash: Boolean | String): RequiredPickMapOptionshas = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionshas]
  }
  
  extension [Self <: RequiredPickMapOptionshas](x: Self) {
    
    inline def setHash(value: Boolean | String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
