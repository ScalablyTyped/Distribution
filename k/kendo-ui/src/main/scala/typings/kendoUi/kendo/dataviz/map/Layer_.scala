package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Class
import typings.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer_
  extends StObject
     with Class {
  
  def hide(): Unit
  
  var map: Map
  
  var options: LayerOptions
  
  def show(): Unit
}
object Layer_ {
  
  inline def apply(hide: () => Unit, map: Map, options: LayerOptions, show: () => Unit): Layer_ = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Layer_]
  }
  
  extension [Self <: Layer_](x: Self) {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: LayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
