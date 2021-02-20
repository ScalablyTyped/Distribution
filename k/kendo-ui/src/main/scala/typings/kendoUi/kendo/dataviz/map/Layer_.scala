package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Class
import typings.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer_ extends Class {
  
  def hide(): Unit = js.native
  
  var map: Map = js.native
  
  var options: LayerOptions = js.native
  
  def show(): Unit = js.native
}
object Layer_ {
  
  @scala.inline
  def apply(hide: () => Unit, map: Map, options: LayerOptions, show: () => Unit): Layer_ = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Layer_]
  }
  
  @scala.inline
  implicit class Layer_MutableBuilder[Self <: Layer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: LayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
