package typings.looksSame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Area extends js.Object {
  var _diffArea: Bottom
  var _updated: Boolean
  val area: Bottom
  def isEmpty(): Boolean
  def isPointInArea(x: js.Any, y: js.Any, radius: js.Any): Boolean
  def update(x: js.Any, y: js.Any): js.Any
}

object Area {
  @scala.inline
  def apply(
    _diffArea: Bottom,
    _updated: Boolean,
    area: Bottom,
    isEmpty: () => Boolean,
    isPointInArea: (js.Any, js.Any, js.Any) => Boolean,
    update: (js.Any, js.Any) => js.Any
  ): Area = {
    val __obj = js.Dynamic.literal(_diffArea = _diffArea.asInstanceOf[js.Any], _updated = _updated.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), isPointInArea = js.Any.fromFunction3(isPointInArea), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Area]
  }
}

