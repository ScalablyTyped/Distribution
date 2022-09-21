package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'pitchWithRotate'> */
trait PickMapOptionspitchWithRo extends StObject {
  
  var pitchWithRotate: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionspitchWithRo {
  
  inline def apply(): PickMapOptionspitchWithRo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionspitchWithRo]
  }
  
  extension [Self <: PickMapOptionspitchWithRo](x: Self) {
    
    inline def setPitchWithRotate(value: Boolean): Self = StObject.set(x, "pitchWithRotate", value.asInstanceOf[js.Any])
    
    inline def setPitchWithRotateUndefined: Self = StObject.set(x, "pitchWithRotate", js.undefined)
  }
}
