package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'keyboard'> */
trait PickMapOptionskeyboard extends StObject {
  
  var keyboard: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionskeyboard {
  
  inline def apply(): PickMapOptionskeyboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionskeyboard]
  }
  
  extension [Self <: PickMapOptionskeyboard](x: Self) {
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
  }
}
