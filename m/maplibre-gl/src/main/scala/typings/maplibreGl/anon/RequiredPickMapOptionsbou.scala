package typings.maplibreGl.anon

import typings.maplibreGl.mod.LngLatBoundsLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'bounds'>> */
trait RequiredPickMapOptionsbou extends StObject {
  
  var bounds: LngLatBoundsLike
}
object RequiredPickMapOptionsbou {
  
  inline def apply(bounds: LngLatBoundsLike): RequiredPickMapOptionsbou = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsbou]
  }
  
  extension [Self <: RequiredPickMapOptionsbou](x: Self) {
    
    inline def setBounds(value: LngLatBoundsLike): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
  }
}
