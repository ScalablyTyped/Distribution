package typings.jsqrcode

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FinderPatternFinder")
@js.native
class FinderPatternFinder () extends js.Object {
  val CrossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var crossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var hasSkipped: Boolean = js.native
  var image: Uint8Array = js.native
  var possibleCenters: js.Array[FinderPattern] = js.native
  var resultPointCallback: ResultPointCallback = js.native
  def centerFromEnd(stateCount: js.Tuple5[Double, Double, Double, Double, Double], end: Double): Double = js.native
  def crossCheckHorizontal(startJ: Double, centerI: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
  def crossCheckVertical(startI: Double, centerJ: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
  def findFinderPattern(image: Uint8Array): FinderPatternInfo = js.native
  def findRowSkip(): Double = js.native
  def foundPatternCross(stateCount: js.Tuple5[Double, Double, Double, Double, Double]): Boolean = js.native
  def handlePossibleCenter(stateCount: js.Tuple5[Double, Double, Double, Double, Double], i: Double, j: Double): Boolean = js.native
  def haveMultiplyConfirmedCenters(): Boolean = js.native
  def selectBestPatterns(): Double = js.native
}

