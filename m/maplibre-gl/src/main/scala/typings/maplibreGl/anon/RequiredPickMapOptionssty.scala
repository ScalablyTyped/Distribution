package typings.maplibreGl.anon

import typings.maplibreGl.mod.StyleSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'style'>> */
trait RequiredPickMapOptionssty extends StObject {
  
  var style: StyleSpecification | String
}
object RequiredPickMapOptionssty {
  
  inline def apply(style: StyleSpecification | String): RequiredPickMapOptionssty = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionssty]
  }
  
  extension [Self <: RequiredPickMapOptionssty](x: Self) {
    
    inline def setStyle(value: StyleSpecification | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
