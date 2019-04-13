package typings
package mapboxDashGlLib.mapboxDashGlMod

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
    onAdd: Map => stdLib.HTMLElement,
    onRemove: Map => js.Any,
    getDefaultPosition: () => java.lang.String = null
  ): IControl = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove))
    if (getDefaultPosition != null) __obj.updateDynamic("getDefaultPosition")(js.Any.fromFunction0(getDefaultPosition))
    __obj.asInstanceOf[IControl]
  }
}

