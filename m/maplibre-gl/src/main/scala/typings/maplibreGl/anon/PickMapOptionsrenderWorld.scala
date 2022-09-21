package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'renderWorldCopies'> */
trait PickMapOptionsrenderWorld extends StObject {
  
  var renderWorldCopies: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsrenderWorld {
  
  inline def apply(): PickMapOptionsrenderWorld = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsrenderWorld]
  }
  
  extension [Self <: PickMapOptionsrenderWorld](x: Self) {
    
    inline def setRenderWorldCopies(value: Boolean): Self = StObject.set(x, "renderWorldCopies", value.asInstanceOf[js.Any])
    
    inline def setRenderWorldCopiesUndefined: Self = StObject.set(x, "renderWorldCopies", js.undefined)
  }
}
