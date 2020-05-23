package typings.jsqrcode.global

import typings.jsqrcode.ResultPointCallback
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FinderPatternFinder")
@js.native
class FinderPatternFinder ()
  extends typings.jsqrcode.FinderPatternFinder {
  /* CompleteClass */
  override val CrossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  /* CompleteClass */
  override var crossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  /* CompleteClass */
  override var hasSkipped: Boolean = js.native
  /* CompleteClass */
  override var image: Uint8Array = js.native
  /* CompleteClass */
  override var possibleCenters: js.Array[typings.jsqrcode.FinderPattern] = js.native
  /* CompleteClass */
  override var resultPointCallback: ResultPointCallback = js.native
  /* CompleteClass */
  override def centerFromEnd(stateCount: js.Tuple5[Double, Double, Double, Double, Double], end: Double): Double = js.native
  /* CompleteClass */
  override def crossCheckHorizontal(startJ: Double, centerI: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
  /* CompleteClass */
  override def crossCheckVertical(startI: Double, centerJ: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
  /* CompleteClass */
  override def findFinderPattern(image: Uint8Array): typings.jsqrcode.FinderPatternInfo = js.native
  /* CompleteClass */
  override def findRowSkip(): Double = js.native
  /* CompleteClass */
  override def foundPatternCross(stateCount: js.Tuple5[Double, Double, Double, Double, Double]): Boolean = js.native
  /* CompleteClass */
  override def handlePossibleCenter(stateCount: js.Tuple5[Double, Double, Double, Double, Double], i: Double, j: Double): Boolean = js.native
  /* CompleteClass */
  override def haveMultiplyConfirmedCenters(): Boolean = js.native
  /* CompleteClass */
  override def selectBestPatterns(): Double = js.native
}

