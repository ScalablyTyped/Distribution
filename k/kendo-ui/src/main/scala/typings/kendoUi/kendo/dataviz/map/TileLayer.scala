package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayer
  extends StObject
     with Layer_ {
  
  @JSName("options")
  var options_TileLayer: TileLayerOptions
}
object TileLayer {
  
  inline def apply(hide: () => Unit, map: Map, options: TileLayerOptions, show: () => Unit): TileLayer = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[TileLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileLayer] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: TileLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
