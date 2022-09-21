package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'fadeDuration'> */
trait PickMapOptionsfadeDuratio extends StObject {
  
  var fadeDuration: js.UndefOr[Double] = js.undefined
}
object PickMapOptionsfadeDuratio {
  
  inline def apply(): PickMapOptionsfadeDuratio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsfadeDuratio]
  }
  
  extension [Self <: PickMapOptionsfadeDuratio](x: Self) {
    
    inline def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
    
    inline def setFadeDurationUndefined: Self = StObject.set(x, "fadeDuration", js.undefined)
  }
}
