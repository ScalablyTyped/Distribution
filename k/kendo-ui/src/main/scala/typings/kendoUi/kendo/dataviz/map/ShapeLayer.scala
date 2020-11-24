package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeLayer extends Layer_ {
  
  @JSName("options")
  var options_ShapeLayer: ShapeLayerOptions = js.native
  
  def setDataSource(): Unit = js.native
}
object ShapeLayer {
  
  @scala.inline
  def apply(
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
  implicit class ShapeLayerOps[Self <: ShapeLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOptions(value: ShapeLayerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDataSource(value: () => Unit): Self = this.set("setDataSource", js.Any.fromFunction0(value))
  }
}
