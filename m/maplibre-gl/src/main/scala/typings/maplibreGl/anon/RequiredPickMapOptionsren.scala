package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'renderWorldCopies'>> */
trait RequiredPickMapOptionsren extends StObject {
  
  var renderWorldCopies: Boolean
}
object RequiredPickMapOptionsren {
  
  inline def apply(renderWorldCopies: Boolean): RequiredPickMapOptionsren = {
    val __obj = js.Dynamic.literal(renderWorldCopies = renderWorldCopies.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsren]
  }
  
  extension [Self <: RequiredPickMapOptionsren](x: Self) {
    
    inline def setRenderWorldCopies(value: Boolean): Self = StObject.set(x, "renderWorldCopies", value.asInstanceOf[js.Any])
  }
}
