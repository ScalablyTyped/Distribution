package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'pitch'>> */
trait RequiredPickMapOptionspitPitch extends StObject {
  
  var pitch: Double
}
object RequiredPickMapOptionspitPitch {
  
  inline def apply(pitch: Double): RequiredPickMapOptionspitPitch = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionspitPitch]
  }
  
  extension [Self <: RequiredPickMapOptionspitPitch](x: Self) {
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
  }
}
