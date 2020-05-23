package typings.jsqrcode.global

import typings.jsqrcode.ResultPointCallback
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AlignmentPatternFinder")
@js.native
class AlignmentPatternFinder protected ()
  extends typings.jsqrcode.AlignmentPatternFinder {
  def this(
    image: Uint8Array,
    startX: Double,
    startY: Double,
    width: Double,
    height: Double,
    moduleSize: Double,
    resultPointCallback: ResultPointCallback
  ) = this()
  /* CompleteClass */
  override var crossCheckStateCount: js.Tuple3[Double, Double, Double] = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var image: Uint8Array = js.native
  /* CompleteClass */
  override var moduleSize: Double = js.native
  /* CompleteClass */
  override var possibleCenters: js.Array[typings.jsqrcode.AlignmentPattern] = js.native
  /* CompleteClass */
  override var resultPointCallback: ResultPointCallback = js.native
  /* CompleteClass */
  override var startX: Double = js.native
  /* CompleteClass */
  override var startY: Double = js.native
  /* CompleteClass */
  override var width: Double = js.native
  /* CompleteClass */
  /* private */ override def centerFromEnd(stateCount: Double, end: Double): Double = js.native
  /* CompleteClass */
  override def find(): typings.jsqrcode.AlignmentPattern = js.native
  /* CompleteClass */
  /* private */ override def foundPatternCross(stateCount: Double): Boolean = js.native
  /* CompleteClass */
  /* private */ override def handlePossibleCenter(stateCount: Double, i: Double, j: Double): typings.jsqrcode.AlignmentPattern = js.native
}

