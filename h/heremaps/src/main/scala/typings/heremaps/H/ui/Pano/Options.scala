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
trait Options extends js.Object {
  var alignment: js.UndefOr[LayoutAlignment] = js.undefined
  var mapTypes: MapType
}

object Options {
  @scala.inline
  def apply(mapTypes: MapType, alignment: LayoutAlignment = null): Options = {
    val __obj = js.Dynamic.literal(mapTypes = mapTypes.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

