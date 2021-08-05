package typings.jsqrcode

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinderPatternFinder extends StObject {
  
  val CrossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double]
  
  def centerFromEnd(stateCount: js.Tuple5[Double, Double, Double, Double, Double], end: Double): Double
  
  def crossCheckHorizontal(startJ: Double, centerI: Double, maxCount: Double, originalStateCountTotal: Double): Double
  
  /* private */ var crossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double]
  
  def crossCheckVertical(startI: Double, centerJ: Double, maxCount: Double, originalStateCountTotal: Double): Double
  
  def findFinderPattern(image: Uint8Array): FinderPatternInfo
  
  def findRowSkip(): Double
  
  def foundPatternCross(stateCount: js.Tuple5[Double, Double, Double, Double, Double]): Boolean
  
  def handlePossibleCenter(stateCount: js.Tuple5[Double, Double, Double, Double, Double], i: Double, j: Double): Boolean
  
  var hasSkipped: Boolean
  
  def haveMultiplyConfirmedCenters(): Boolean
  
  var image: Uint8Array
  
  var possibleCenters: js.Array[FinderPattern]
  
  var resultPointCallback: ResultPointCallback
  
  def selectBestPatterns(): Double
}
object FinderPatternFinder {
  
  inline def apply(
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
  
  extension [Self <: FinderPatternFinder](x: Self) {
    
    inline def setCenterFromEnd(value: (js.Tuple5[Double, Double, Double, Double, Double], Double) => Double): Self = StObject.set(x, "centerFromEnd", js.Any.fromFunction2(value))
    
    inline def setCrossCheckHorizontal(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "crossCheckHorizontal", js.Any.fromFunction4(value))
    
    inline def setCrossCheckStateCount(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "CrossCheckStateCount", value.asInstanceOf[js.Any])
    
    inline def setCrossCheckVertical(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "crossCheckVertical", js.Any.fromFunction4(value))
    
    inline def setFindFinderPattern(value: Uint8Array => FinderPatternInfo): Self = StObject.set(x, "findFinderPattern", js.Any.fromFunction1(value))
    
    inline def setFindRowSkip(value: () => Double): Self = StObject.set(x, "findRowSkip", js.Any.fromFunction0(value))
    
    inline def setFoundPatternCross(value: js.Tuple5[Double, Double, Double, Double, Double] => Boolean): Self = StObject.set(x, "foundPatternCross", js.Any.fromFunction1(value))
    
    inline def setHandlePossibleCenter(value: (js.Tuple5[Double, Double, Double, Double, Double], Double, Double) => Boolean): Self = StObject.set(x, "handlePossibleCenter", js.Any.fromFunction3(value))
    
    inline def setHasSkipped(value: Boolean): Self = StObject.set(x, "hasSkipped", value.asInstanceOf[js.Any])
    
    inline def setHaveMultiplyConfirmedCenters(value: () => Boolean): Self = StObject.set(x, "haveMultiplyConfirmedCenters", js.Any.fromFunction0(value))
    
    inline def setImage(value: Uint8Array): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setPossibleCenters(value: js.Array[FinderPattern]): Self = StObject.set(x, "possibleCenters", value.asInstanceOf[js.Any])
    
    inline def setPossibleCentersVarargs(value: FinderPattern*): Self = StObject.set(x, "possibleCenters", js.Array(value :_*))
    
    inline def setResultPointCallback(value: ResultPointCallback): Self = StObject.set(x, "resultPointCallback", value.asInstanceOf[js.Any])
    
    inline def setSelectBestPatterns(value: () => Double): Self = StObject.set(x, "selectBestPatterns", js.Any.fromFunction0(value))
  }
}
