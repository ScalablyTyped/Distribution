package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingLayer
  extends StObject
     with TileLayer {
  
  def imagerySet(): Unit
  
  @JSName("options")
  var options_BingLayer: BingLayerOptions
}
object BingLayer {
  
  inline def apply(hide: () => Unit, imagerySet: () => Unit, map: Map, options: BingLayerOptions, show: () => Unit): BingLayer = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), imagerySet = js.Any.fromFunction0(imagerySet), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BingLayer]
  }
  
  extension [Self <: BingLayer](x: Self) {
    
    inline def setImagerySet(value: () => Unit): Self = StObject.set(x, "imagerySet", js.Any.fromFunction0(value))
    
    inline def setOptions(value: BingLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
