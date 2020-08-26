package typings.heremaps.H.ui.Pano

import typings.heremaps.H.service.MapType
import typings.heremaps.H.ui.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.RIGHT_BOTTOM
  * @property mapTypes {H.service.MapTypes} - The map types to use
  */
@js.native
trait Options extends js.Object {
  var alignment: js.UndefOr[LayoutAlignment] = js.native
  var mapTypes: MapType = js.native
}

object Options {
  @scala.inline
  def apply(mapTypes: MapType): Options = {
    val __obj = js.Dynamic.literal(mapTypes = mapTypes.asInstanceOf[js.Any])
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
    def setMapTypes(value: MapType): Self = this.set("mapTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlignment(value: LayoutAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
  }
  
}

