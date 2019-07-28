package typings.heremaps.HNs.uiNs.ScaleBarNs

import typings.heremaps.HNs.uiNs.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
  */
trait Options extends js.Object {
  var alignment: js.UndefOr[LayoutAlignment] = js.undefined
}

object Options {
  @scala.inline
  def apply(alignment: LayoutAlignment = null): Options = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    __obj.asInstanceOf[Options]
  }
}

