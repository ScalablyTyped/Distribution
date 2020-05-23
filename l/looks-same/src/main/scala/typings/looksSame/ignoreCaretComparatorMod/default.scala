package typings.looksSame.ignoreCaretComparatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same/build/src/lib/ignore-caret-comparator", JSImport.Default)
@js.native
class default protected () extends IgnoreCaretComparator {
  def this(baseComparator: js.Any, pixelRatio: js.Any) = this()
  /* CompleteClass */
  override var _baseComparator: js.Any = js.native
  /* CompleteClass */
  override var _state: js.Any = js.native
  /* CompleteClass */
  override var caretBottomRight: js.Any = js.native
  /* CompleteClass */
  override var caretTopLeft: js.Any = js.native
  /* CompleteClass */
  override var pixelRatio: js.Any = js.native
  /* CompleteClass */
  override def _checkIsCaret(data: js.Any): js.Any = js.native
  /**
    * Compare pixels for current active comparator state
    * @param {Object} data
    * @param {Object} data.color1
    * @param {Object} data.color2
    * @param {Number} data.x coordinate
    * @param {Number} data.y coordinate
    * @returns {boolean}
    */
  /* CompleteClass */
  override def compare(data: js.Any): js.Any = js.native
  /* CompleteClass */
  override def switchState(stateName: js.Any): Unit = js.native
}

