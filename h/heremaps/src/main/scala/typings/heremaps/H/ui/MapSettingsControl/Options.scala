package typings.heremaps.H.ui.MapSettingsControl

import typings.heremaps.H.ui.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://developer.here.com/documentation/maps/api_reference/H.ui.MapSettingsControl.html#.Options}
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
  * @property entries {Array<H.ui.MapSettingsControl.MapTypeEntry>=} - the map type entries to be shown in this map settings control
  * @property incidents {H.map.layer.Layer} - the traffic incidents layer to be activated by the map settings control
  */
@js.native
trait Options extends js.Object {
  var alignment: js.UndefOr[LayoutAlignment] = js.native
  var baseLayers: js.UndefOr[js.Array[Entry]] = js.native
  var layers: js.UndefOr[js.Array[Entry]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAlignment(value: LayoutAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setBaseLayersVarargs(value: Entry*): Self = this.set("baseLayers", js.Array(value :_*))
    @scala.inline
    def setBaseLayers(value: js.Array[Entry]): Self = this.set("baseLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseLayers: Self = this.set("baseLayers", js.undefined)
    @scala.inline
    def setLayersVarargs(value: Entry*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[Entry]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
  
}

