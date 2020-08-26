package typings.looksSame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Area extends js.Object {
  var _diffArea: Bottom = js.native
  var _updated: Boolean = js.native
  val area: Bottom = js.native
  def isEmpty(): Boolean = js.native
  def isPointInArea(x: js.Any, y: js.Any, radius: js.Any): Boolean = js.native
  def update(x: js.Any, y: js.Any): js.Any = js.native
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
  @scala.inline
  implicit class AreaOps[Self <: Area] (val x: Self) extends AnyVal {
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
    def set_diffArea(value: Bottom): Self = this.set("_diffArea", value.asInstanceOf[js.Any])
    @scala.inline
    def set_updated(value: Boolean): Self = this.set("_updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setArea(value: Bottom): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPointInArea(value: (js.Any, js.Any, js.Any) => Boolean): Self = this.set("isPointInArea", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdate(value: (js.Any, js.Any) => js.Any): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

