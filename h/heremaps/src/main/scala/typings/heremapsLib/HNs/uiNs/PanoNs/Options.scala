package typings
package heremapsLib.HNs.uiNs.PanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.RIGHT_BOTTOM
  * @property mapTypes {H.service.MapTypes} - The map types to use
  */
trait Options extends js.Object {
  var alignment: js.UndefOr[heremapsLib.HNs.uiNs.LayoutAlignment] = js.undefined
  var mapTypes: heremapsLib.HNs.serviceNs.MapType
}

object Options {
  @scala.inline
  def apply(
    mapTypes: heremapsLib.HNs.serviceNs.MapType,
    alignment: heremapsLib.HNs.uiNs.LayoutAlignment = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mapTypes")(mapTypes)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    __obj.asInstanceOf[Options]
  }
}

