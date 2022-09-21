package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'antialias'> */
trait PickMapOptionsantialias extends StObject {
  
  var antialias: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsantialias {
  
  inline def apply(): PickMapOptionsantialias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsantialias]
  }
  
  extension [Self <: PickMapOptionsantialias](x: Self) {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
  }
}
