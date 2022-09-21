package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'trackResize'> */
trait PickMapOptionstrackResize extends StObject {
  
  var trackResize: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionstrackResize {
  
  inline def apply(): PickMapOptionstrackResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionstrackResize]
  }
  
  extension [Self <: PickMapOptionstrackResize](x: Self) {
    
    inline def setTrackResize(value: Boolean): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
  }
}
