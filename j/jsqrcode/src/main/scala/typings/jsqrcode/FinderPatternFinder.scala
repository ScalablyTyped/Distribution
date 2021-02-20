package typings.jsqrcode

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinderPatternFinder extends StObject {
  
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
  implicit class FinderPatternFinderMutableBuilder[Self <: FinderPatternFinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterFromEnd(value: (js.Tuple5[Double, Double, Double, Double, Double], Double) => Double): Self = StObject.set(x, "centerFromEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCrossCheckHorizontal(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "crossCheckHorizontal", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCrossCheckStateCount(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "CrossCheckStateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossCheckVertical(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "crossCheckVertical", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFindFinderPattern(value: Uint8Array => FinderPatternInfo): Self = StObject.set(x, "findFinderPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindRowSkip(value: () => Double): Self = StObject.set(x, "findRowSkip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFoundPatternCross(value: js.Tuple5[Double, Double, Double, Double, Double] => Boolean): Self = StObject.set(x, "foundPatternCross", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandlePossibleCenter(value: (js.Tuple5[Double, Double, Double, Double, Double], Double, Double) => Boolean): Self = StObject.set(x, "handlePossibleCenter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHasSkipped(value: Boolean): Self = StObject.set(x, "hasSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaveMultiplyConfirmedCenters(value: () => Boolean): Self = StObject.set(x, "haveMultiplyConfirmedCenters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImage(value: Uint8Array): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleCenters(value: js.Array[FinderPattern]): Self = StObject.set(x, "possibleCenters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleCentersVarargs(value: FinderPattern*): Self = StObject.set(x, "possibleCenters", js.Array(value :_*))
    
    @scala.inline
    def setResultPointCallback(value: ResultPointCallback): Self = StObject.set(x, "resultPointCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectBestPatterns(value: () => Double): Self = StObject.set(x, "selectBestPatterns", js.Any.fromFunction0(value))
  }
}
