package typings.maplibreGl.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'container'> */
trait PickMapOptionscontainer extends StObject {
  
  var container: HTMLElement | String
}
object PickMapOptionscontainer {
  
  inline def apply(container: HTMLElement | String): PickMapOptionscontainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickMapOptionscontainer]
  }
  
  extension [Self <: PickMapOptionscontainer](x: Self) {
    
    inline def setContainer(value: HTMLElement | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
  }
}
