package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FinderPatternFinder")
@js.native
class FinderPatternFinder () extends js.Object {
  val CrossCheckStateCount: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double] = js.native
  var crossCheckStateCount: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double] = js.native
  var hasSkipped: scala.Boolean = js.native
  var image: stdLib.Uint8Array = js.native
  var possibleCenters: js.Array[FinderPattern] = js.native
  var resultPointCallback: ResultPointCallback = js.native
  def centerFromEnd(
    stateCount: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    end: scala.Double
  ): scala.Double = js.native
  def crossCheckHorizontal(
    startJ: scala.Double,
    centerI: scala.Double,
    maxCount: scala.Double,
    originalStateCountTotal: scala.Double
  ): scala.Double = js.native
  def crossCheckVertical(
    startI: scala.Double,
    centerJ: scala.Double,
    maxCount: scala.Double,
    originalStateCountTotal: scala.Double
  ): scala.Double = js.native
  def findFinderPattern(image: stdLib.Uint8Array): FinderPatternInfo = js.native
  def findRowSkip(): scala.Double = js.native
  def foundPatternCross(stateCount: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]): scala.Boolean = js.native
  def handlePossibleCenter(
    stateCount: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    i: scala.Double,
    j: scala.Double
  ): scala.Boolean = js.native
  def haveMultiplyConfirmedCenters(): scala.Boolean = js.native
  def selectBestPatterns(): scala.Double = js.native
}

