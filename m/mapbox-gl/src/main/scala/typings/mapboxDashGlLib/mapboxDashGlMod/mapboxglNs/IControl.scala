package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControl extends js.Object {
  var getDefaultPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  def onAdd(map: Map): stdLib.HTMLElement
  def onRemove(map: Map): js.Any
}

object IControl {
  @scala.inline
  def apply(
    onAdd: js.Function1[Map, stdLib.HTMLElement],
    onRemove: js.Function1[Map, js.Any],
    getDefaultPosition: js.Function0[java.lang.String] = null
  ): IControl = {
    val __obj = js.Dynamic.literal(onAdd = onAdd, onRemove = onRemove)
    if (getDefaultPosition != null) __obj.updateDynamic("getDefaultPosition")(getDefaultPosition)
    __obj.asInstanceOf[IControl]
  }
}

