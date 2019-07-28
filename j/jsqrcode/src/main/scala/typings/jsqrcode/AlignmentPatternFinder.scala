package typings.jsqrcode

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AlignmentPatternFinder")
@js.native
class AlignmentPatternFinder protected () extends js.Object {
  def this(
    image: Uint8Array,
    startX: Double,
    startY: Double,
    width: Double,
    height: Double,
    moduleSize: Double,
    resultPointCallback: ResultPointCallback
  ) = this()
  var crossCheckStateCount: js.Tuple3[Double, Double, Double] = js.native
  var height: Double = js.native
  var image: Uint8Array = js.native
  var moduleSize: Double = js.native
  var possibleCenters: js.Array[AlignmentPattern] = js.native
  var resultPointCallback: ResultPointCallback = js.native
  var startX: Double = js.native
  var startY: Double = js.native
  var width: Double = js.native
  /* private */ def centerFromEnd(stateCount: Double, end: Double): Double = js.native
  def find(): AlignmentPattern = js.native
  /* private */ def foundPatternCross(stateCount: Double): Boolean = js.native
  /* private */ def handlePossibleCenter(stateCount: Double, i: Double, j: Double): AlignmentPattern = js.native
}

