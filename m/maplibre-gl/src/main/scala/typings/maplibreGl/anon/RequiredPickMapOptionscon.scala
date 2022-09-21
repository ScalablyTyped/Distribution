package typings.maplibreGl.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'container'>> */
trait RequiredPickMapOptionscon extends StObject {
  
  var container: HTMLElement | String
}
object RequiredPickMapOptionscon {
  
  inline def apply(container: HTMLElement | String): RequiredPickMapOptionscon = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionscon]
  }
  
  extension [Self <: RequiredPickMapOptionscon](x: Self) {
    
    inline def setContainer(value: HTMLElement | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
  }
}
