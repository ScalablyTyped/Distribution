package typings
package inkLib.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InkElement extends js.Object {
  var _children: js.Array[InkNode]
  var _props: js.Any
  var component: InkComponent[_]
  var instance: (Component[_, _, _]) | scala.Null
  def ref(ref: js.Any): scala.Unit
}

object InkElement {
  @scala.inline
  def apply(
    _children: js.Array[InkNode],
    _props: js.Any,
    component: InkComponent[_],
    ref: js.Any => scala.Unit,
    instance: Component[_, _, _] = null
  ): InkElement = {
    val __obj = js.Dynamic.literal(_children = _children, _props = _props, component = component.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
    if (instance != null) __obj.updateDynamic("instance")(instance)
    __obj.asInstanceOf[InkElement]
  }
}

