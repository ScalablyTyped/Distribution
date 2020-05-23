package typings.jsqrcode

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignmentPatternFinder extends js.Object {
  var crossCheckStateCount: js.Tuple3[Double, Double, Double]
  var height: Double
  var image: Uint8Array
  var moduleSize: Double
  var possibleCenters: js.Array[AlignmentPattern]
  var resultPointCallback: ResultPointCallback
  var startX: Double
  var startY: Double
  var width: Double
  /* private */ def centerFromEnd(stateCount: Double, end: Double): Double
  def find(): AlignmentPattern
  /* private */ def foundPatternCross(stateCount: Double): Boolean
  /* private */ def handlePossibleCenter(stateCount: Double, i: Double, j: Double): AlignmentPattern
}

object AlignmentPatternFinder {
  @scala.inline
  def apply(
    centerFromEnd: (Double, Double) => Double,
    crossCheckStateCount: js.Tuple3[Double, Double, Double],
    find: () => AlignmentPattern,
    foundPatternCross: Double => Boolean,
    handlePossibleCenter: (Double, Double, Double) => AlignmentPattern,
    height: Double,
    image: Uint8Array,
    moduleSize: Double,
    possibleCenters: js.Array[AlignmentPattern],
    resultPointCallback: ResultPointCallback,
    startX: Double,
    startY: Double,
    width: Double
  ): AlignmentPatternFinder = {
    val __obj = js.Dynamic.literal(centerFromEnd = js.Any.fromFunction2(centerFromEnd), crossCheckStateCount = crossCheckStateCount.asInstanceOf[js.Any], find = js.Any.fromFunction0(find), foundPatternCross = js.Any.fromFunction1(foundPatternCross), handlePossibleCenter = js.Any.fromFunction3(handlePossibleCenter), height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], moduleSize = moduleSize.asInstanceOf[js.Any], possibleCenters = possibleCenters.asInstanceOf[js.Any], resultPointCallback = resultPointCallback.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignmentPatternFinder]
  }
}

