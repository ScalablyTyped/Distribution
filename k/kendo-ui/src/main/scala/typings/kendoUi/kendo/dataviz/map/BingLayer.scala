package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.ui.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingLayer extends TileLayer {
  @JSName("options")
  var options_BingLayer: BingLayerOptions = js.native
  def imagerySet(): Unit = js.native
}

object BingLayer {
  @scala.inline
  def apply(hide: () => Unit, imagerySet: () => Unit, map: Map, options: BingLayerOptions, show: () => Unit): BingLayer = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), imagerySet = js.Any.fromFunction0(imagerySet), map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BingLayer]
  }
  @scala.inline
  implicit class BingLayerOps[Self <: BingLayer] (val x: Self) extends AnyVal {
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
    def setImagerySet(value: () => Unit): Self = this.set("imagerySet", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: BingLayerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

