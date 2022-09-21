package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'pitch'> */
trait PickMapOptionspitch extends StObject {
  
  var pitch: js.UndefOr[Double] = js.undefined
}
object PickMapOptionspitch {
  
  inline def apply(): PickMapOptionspitch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionspitch]
  }
  
  extension [Self <: PickMapOptionspitch](x: Self) {
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
  }
}
