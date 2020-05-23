package typings.looksSame

import typings.looksSame.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("looks-same/build/src/lib/ignore-caret-comparator/states/init", JSImport.Namespace)
@js.native
object initMod extends js.Object {
  @js.native
  trait InitState
    extends typings.looksSame.stateMod.default {
    def _areColorsSame(point: js.Any, imgs: js.Any): Boolean = js.native
    def _caretHeight(firstCaretPoint: js.Any, lastCaretPoint: js.Any): Double = js.native
    def _caretWidth(firstCaretPoint: js.Any, lastCaretPoint: js.Any): Double = js.native
    def _getLastCaretPoint(firstCaretPoint: js.Any, imgs: js.Any): js.Any = js.native
    def _getNextCaretPoint(firstCaretPoint: js.Any, currPoint: js.Any): X = js.native
    def _isPointOutsideImages(point: js.Any, imgs: js.Any): js.Any = js.native
    def _looksLikeCaret(firstCaretPoint: js.Any, lastCaretPoint: js.Any): Boolean = js.native
  }
  
  @js.native
  class default () extends InitState
  
}

