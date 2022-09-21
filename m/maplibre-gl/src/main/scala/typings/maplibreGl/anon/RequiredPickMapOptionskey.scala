package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'keyboard'>> */
trait RequiredPickMapOptionskey extends StObject {
  
  var keyboard: Boolean
}
object RequiredPickMapOptionskey {
  
  inline def apply(keyboard: Boolean): RequiredPickMapOptionskey = {
    val __obj = js.Dynamic.literal(keyboard = keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionskey]
  }
  
  extension [Self <: RequiredPickMapOptionskey](x: Self) {
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
  }
}
