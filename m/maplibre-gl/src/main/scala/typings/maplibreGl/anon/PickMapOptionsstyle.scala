package typings.maplibreGl.anon

import typings.maplibreGl.mod.StyleSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'style'> */
trait PickMapOptionsstyle extends StObject {
  
  var style: StyleSpecification | String
}
object PickMapOptionsstyle {
  
  inline def apply(style: StyleSpecification | String): PickMapOptionsstyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickMapOptionsstyle]
  }
  
  extension [Self <: PickMapOptionsstyle](x: Self) {
    
    inline def setStyle(value: StyleSpecification | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
