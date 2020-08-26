package typings.looksSame.ignoreCaretComparatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreCaretComparator extends js.Object {
  var _baseComparator: js.Any = js.native
  var _state: js.Any = js.native
  var caretBottomRight: js.Any = js.native
  var caretTopLeft: js.Any = js.native
  var pixelRatio: js.Any = js.native
  def _checkIsCaret(data: js.Any): js.Any = js.native
  /**
    * Compare pixels for current active comparator state
    * @param {Object} data
    * @param {Object} data.color1
    * @param {Object} data.color2
    * @param {Number} data.x coordinate
    * @param {Number} data.y coordinate
    * @returns {boolean}
    */
  def compare(data: js.Any): js.Any = js.native
  def switchState(stateName: js.Any): Unit = js.native
}

object IgnoreCaretComparator {
  @scala.inline
  def apply(
    _baseComparator: js.Any,
    _checkIsCaret: js.Any => js.Any,
    _state: js.Any,
    caretBottomRight: js.Any,
    caretTopLeft: js.Any,
    compare: js.Any => js.Any,
    pixelRatio: js.Any,
    switchState: js.Any => Unit
  ): IgnoreCaretComparator = {
    val __obj = js.Dynamic.literal(_baseComparator = _baseComparator.asInstanceOf[js.Any], _checkIsCaret = js.Any.fromFunction1(_checkIsCaret), _state = _state.asInstanceOf[js.Any], caretBottomRight = caretBottomRight.asInstanceOf[js.Any], caretTopLeft = caretTopLeft.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), pixelRatio = pixelRatio.asInstanceOf[js.Any], switchState = js.Any.fromFunction1(switchState))
    __obj.asInstanceOf[IgnoreCaretComparator]
  }
  @scala.inline
  implicit class IgnoreCaretComparatorOps[Self <: IgnoreCaretComparator] (val x: Self) extends AnyVal {
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
    def set_baseComparator(value: js.Any): Self = this.set("_baseComparator", value.asInstanceOf[js.Any])
    @scala.inline
    def set_checkIsCaret(value: js.Any => js.Any): Self = this.set("_checkIsCaret", js.Any.fromFunction1(value))
    @scala.inline
    def set_state(value: js.Any): Self = this.set("_state", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretBottomRight(value: js.Any): Self = this.set("caretBottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretTopLeft(value: js.Any): Self = this.set("caretTopLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompare(value: js.Any => js.Any): Self = this.set("compare", js.Any.fromFunction1(value))
    @scala.inline
    def setPixelRatio(value: js.Any): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitchState(value: js.Any => Unit): Self = this.set("switchState", js.Any.fromFunction1(value))
  }
  
}

