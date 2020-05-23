package typings.looksSame.ignoreCaretComparatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreCaretComparator extends js.Object {
  var _baseComparator: js.Any
  var _state: js.Any
  var caretBottomRight: js.Any
  var caretTopLeft: js.Any
  var pixelRatio: js.Any
  def _checkIsCaret(data: js.Any): js.Any
  /**
    * Compare pixels for current active comparator state
    * @param {Object} data
    * @param {Object} data.color1
    * @param {Object} data.color2
    * @param {Number} data.x coordinate
    * @param {Number} data.y coordinate
    * @returns {boolean}
    */
  def compare(data: js.Any): js.Any
  def switchState(stateName: js.Any): Unit
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
}

