package typings.jsqrcode

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinderPatternFinder extends js.Object {
  val CrossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double]
  var crossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double]
  var hasSkipped: Boolean
  var image: Uint8Array
  var possibleCenters: js.Array[FinderPattern]
  var resultPointCallback: ResultPointCallback
  def centerFromEnd(stateCount: js.Tuple5[Double, Double, Double, Double, Double], end: Double): Double
  def crossCheckHorizontal(startJ: Double, centerI: Double, maxCount: Double, originalStateCountTotal: Double): Double
  def crossCheckVertical(startI: Double, centerJ: Double, maxCount: Double, originalStateCountTotal: Double): Double
  def findFinderPattern(image: Uint8Array): FinderPatternInfo
  def findRowSkip(): Double
  def foundPatternCross(stateCount: js.Tuple5[Double, Double, Double, Double, Double]): Boolean
  def handlePossibleCenter(stateCount: js.Tuple5[Double, Double, Double, Double, Double], i: Double, j: Double): Boolean
  def haveMultiplyConfirmedCenters(): Boolean
  def selectBestPatterns(): Double
}

object FinderPatternFinder {
  @scala.inline
  def apply(
    CrossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double],
    centerFromEnd: (js.Tuple5[Double, Double, Double, Double, Double], Double) => Double,
    crossCheckHorizontal: (Double, Double, Double, Double) => Double,
    crossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double],
    crossCheckVertical: (Double, Double, Double, Double) => Double,
    findFinderPattern: Uint8Array => FinderPatternInfo,
    findRowSkip: () => Double,
    foundPatternCross: js.Tuple5[Double, Double, Double, Double, Double] => Boolean,
    handlePossibleCenter: (js.Tuple5[Double, Double, Double, Double, Double], Double, Double) => Boolean,
    hasSkipped: Boolean,
    haveMultiplyConfirmedCenters: () => Boolean,
    image: Uint8Array,
    possibleCenters: js.Array[FinderPattern],
    resultPointCallback: ResultPointCallback,
    selectBestPatterns: () => Double
  ): FinderPatternFinder = {
    val __obj = js.Dynamic.literal(CrossCheckStateCount = CrossCheckStateCount.asInstanceOf[js.Any], centerFromEnd = js.Any.fromFunction2(centerFromEnd), crossCheckHorizontal = js.Any.fromFunction4(crossCheckHorizontal), crossCheckStateCount = crossCheckStateCount.asInstanceOf[js.Any], crossCheckVertical = js.Any.fromFunction4(crossCheckVertical), findFinderPattern = js.Any.fromFunction1(findFinderPattern), findRowSkip = js.Any.fromFunction0(findRowSkip), foundPatternCross = js.Any.fromFunction1(foundPatternCross), handlePossibleCenter = js.Any.fromFunction3(handlePossibleCenter), hasSkipped = hasSkipped.asInstanceOf[js.Any], haveMultiplyConfirmedCenters = js.Any.fromFunction0(haveMultiplyConfirmedCenters), image = image.asInstanceOf[js.Any], possibleCenters = possibleCenters.asInstanceOf[js.Any], resultPointCallback = resultPointCallback.asInstanceOf[js.Any], selectBestPatterns = js.Any.fromFunction0(selectBestPatterns))
    __obj.asInstanceOf[FinderPatternFinder]
  }
}

