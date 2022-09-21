package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'pitchWithRotate'>> */
trait RequiredPickMapOptionspit extends StObject {
  
  var pitchWithRotate: Boolean
}
object RequiredPickMapOptionspit {
  
  inline def apply(pitchWithRotate: Boolean): RequiredPickMapOptionspit = {
    val __obj = js.Dynamic.literal(pitchWithRotate = pitchWithRotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionspit]
  }
  
  extension [Self <: RequiredPickMapOptionspit](x: Self) {
    
    inline def setPitchWithRotate(value: Boolean): Self = StObject.set(x, "pitchWithRotate", value.asInstanceOf[js.Any])
  }
}
