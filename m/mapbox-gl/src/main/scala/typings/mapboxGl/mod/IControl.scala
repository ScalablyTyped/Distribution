package typings.mapboxGl.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControl extends js.Object {
  var getDefaultPosition: js.UndefOr[js.Function0[String]] = js.undefined
  def onAdd(map: Map): HTMLElement
  def onRemove(map: Map): js.Any
}

object IControl {
  @scala.inline
  def apply(onAdd: Map => HTMLElement, onRemove: Map => js.Any, getDefaultPosition: () => String = null): IControl = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove))
    if (getDefaultPosition != null) __obj.updateDynamic("getDefaultPosition")(js.Any.fromFunction0(getDefaultPosition))
    __obj.asInstanceOf[IControl]
  }
}

