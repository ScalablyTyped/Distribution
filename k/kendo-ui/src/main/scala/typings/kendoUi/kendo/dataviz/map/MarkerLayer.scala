package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerLayer
  extends StObject
     with Layer_ {
  
  def add(marker: Marker): Unit
  
  def clear(): Unit
  
  var items: js.Any
  
  @JSName("options")
  var options_MarkerLayer: MarkerLayerOptions
  
  def remove(marker: Marker): Unit
  
  def setDataSource(dataSource: js.Any): Unit
}
object MarkerLayer {
  
  @scala.inline
  def apply(
    add: Marker => Unit,
    clear: () => Unit,
    hide: () => Unit,
    items: js.Any,
    map: Map,
    options: MarkerLayerOptions,
    remove: Marker => Unit,
    setDataSource: js.Any => Unit,
    show: () => Unit
  ): MarkerLayer = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), hide = js.Any.fromFunction0(hide), items = items.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), setDataSource = js.Any.fromFunction1(setDataSource), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[MarkerLayer]
  }
  
  @scala.inline
  implicit class MarkerLayerMutableBuilder[Self <: MarkerLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Marker => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: MarkerLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: Marker => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataSource(value: js.Any => Unit): Self = StObject.set(x, "setDataSource", js.Any.fromFunction1(value))
  }
}
