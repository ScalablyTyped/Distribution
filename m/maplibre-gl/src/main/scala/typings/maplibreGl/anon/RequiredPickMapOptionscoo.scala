package typings.maplibreGl.anon

import typings.maplibreGl.mod.GestureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'cooperativeGestures'>> */
trait RequiredPickMapOptionscoo extends StObject {
  
  var cooperativeGestures: Boolean | GestureOptions
}
object RequiredPickMapOptionscoo {
  
  inline def apply(cooperativeGestures: Boolean | GestureOptions): RequiredPickMapOptionscoo = {
    val __obj = js.Dynamic.literal(cooperativeGestures = cooperativeGestures.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionscoo]
  }
  
  extension [Self <: RequiredPickMapOptionscoo](x: Self) {
    
    inline def setCooperativeGestures(value: Boolean | GestureOptions): Self = StObject.set(x, "cooperativeGestures", value.asInstanceOf[js.Any])
  }
}
