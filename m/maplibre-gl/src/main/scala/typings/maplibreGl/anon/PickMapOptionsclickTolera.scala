package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'clickTolerance'> */
trait PickMapOptionsclickTolera extends StObject {
  
  var clickTolerance: js.UndefOr[Double] = js.undefined
}
object PickMapOptionsclickTolera {
  
  inline def apply(): PickMapOptionsclickTolera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsclickTolera]
  }
  
  extension [Self <: PickMapOptionsclickTolera](x: Self) {
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    inline def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
  }
}
