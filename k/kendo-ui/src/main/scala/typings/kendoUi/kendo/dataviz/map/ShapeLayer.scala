package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeLayer
  extends StObject
     with Layer_ {
  
  @JSName("options")
  var options_ShapeLayer: ShapeLayerOptions
  
  def setDataSource(): Unit
}
object ShapeLayer {
  
  inline def apply(
    hide: () => Unit,
    map: Map,
    options: ShapeLayerOptions,
    setDataSource: () => Unit,
    show: () => Unit
  ): ShapeLayer = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setDataSource = js.Any.fromFunction0(setDataSource), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ShapeLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeLayer] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: ShapeLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSetDataSource(value: () => Unit): Self = StObject.set(x, "setDataSource", js.Any.fromFunction0(value))
  }
}
