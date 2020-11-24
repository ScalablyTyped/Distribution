package typings.jsqrcode

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinderPatternFinder extends js.Object {
  
  val CrossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  
  def centerFromEnd(stateCount: js.Tuple5[Double, Double, Double, Double, Double], end: Double): Double = js.native
  
  def crossCheckHorizontal(startJ: Double, centerI: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
  
  var crossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  
  def crossCheckVertical(startI: Double, centerJ: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
  
  def findFinderPattern(image: Uint8Array): FinderPatternInfo = js.native
  
  def findRowSkip(): Double = js.native
  
  def foundPatternCross(stateCount: js.Tuple5[Double, Double, Double, Double, Double]): Boolean = js.native
  
  def handlePossibleCenter(stateCount: js.Tuple5[Double, Double, Double, Double, Double], i: Double, j: Double): Boolean = js.native
  
  var hasSkipped: Boolean = js.native
  
  def haveMultiplyConfirmedCenters(): Boolean = js.native
  
  var image: Uint8Array = js.native
  
  var possibleCenters: js.Array[FinderPattern] = js.native
  
  var resultPointCallback: ResultPointCallback = js.native
  
  def selectBestPatterns(): Double = js.native
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
  
  @scala.inline
  implicit class FinderPatternFinderOps[Self <: FinderPatternFinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCrossCheckStateCount(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = this.set("CrossCheckStateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterFromEnd(value: (js.Tuple5[Double, Double, Double, Double, Double], Double) => Double): Self = this.set("centerFromEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCrossCheckHorizontal(value: (Double, Double, Double, Double) => Double): Self = this.set("crossCheckHorizontal", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCrossCheckVertical(value: (Double, Double, Double, Double) => Double): Self = this.set("crossCheckVertical", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFindFinderPattern(value: Uint8Array => FinderPatternInfo): Self = this.set("findFinderPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindRowSkip(value: () => Double): Self = this.set("findRowSkip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFoundPatternCross(value: js.Tuple5[Double, Double, Double, Double, Double] => Boolean): Self = this.set("foundPatternCross", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandlePossibleCenter(value: (js.Tuple5[Double, Double, Double, Double, Double], Double, Double) => Boolean): Self = this.set("handlePossibleCenter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHasSkipped(value: Boolean): Self = this.set("hasSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaveMultiplyConfirmedCenters(value: () => Boolean): Self = this.set("haveMultiplyConfirmedCenters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImage(value: Uint8Array): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleCentersVarargs(value: FinderPattern*): Self = this.set("possibleCenters", js.Array(value :_*))
    
    @scala.inline
    def setPossibleCenters(value: js.Array[FinderPattern]): Self = this.set("possibleCenters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultPointCallback(value: ResultPointCallback): Self = this.set("resultPointCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectBestPatterns(value: () => Double): Self = this.set("selectBestPatterns", js.Any.fromFunction0(value))
  }
}
