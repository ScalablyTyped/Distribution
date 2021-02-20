package typings.jsqrcode

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignmentPatternFinder extends StObject {
  
  /* private */ def centerFromEnd(stateCount: Double, end: Double): Double = js.native
  
  var crossCheckStateCount: js.Tuple3[Double, Double, Double] = js.native
  
  def find(): AlignmentPattern = js.native
  
  /* private */ def foundPatternCross(stateCount: Double): Boolean = js.native
  
  /* private */ def handlePossibleCenter(stateCount: Double, i: Double, j: Double): AlignmentPattern = js.native
  
  var height: Double = js.native
  
  var image: Uint8Array = js.native
  
  var moduleSize: Double = js.native
  
  var possibleCenters: js.Array[AlignmentPattern] = js.native
  
  var resultPointCallback: ResultPointCallback = js.native
  
  var startX: Double = js.native
  
  var startY: Double = js.native
  
  var width: Double = js.native
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
  
  @scala.inline
  implicit class AlignmentPatternFinderMutableBuilder[Self <: AlignmentPatternFinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterFromEnd(value: (Double, Double) => Double): Self = StObject.set(x, "centerFromEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCrossCheckStateCount(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "crossCheckStateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFind(value: () => AlignmentPattern): Self = StObject.set(x, "find", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFoundPatternCross(value: Double => Boolean): Self = StObject.set(x, "foundPatternCross", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandlePossibleCenter(value: (Double, Double, Double) => AlignmentPattern): Self = StObject.set(x, "handlePossibleCenter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Uint8Array): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSize(value: Double): Self = StObject.set(x, "moduleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleCenters(value: js.Array[AlignmentPattern]): Self = StObject.set(x, "possibleCenters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleCentersVarargs(value: AlignmentPattern*): Self = StObject.set(x, "possibleCenters", js.Array(value :_*))
    
    @scala.inline
    def setResultPointCallback(value: ResultPointCallback): Self = StObject.set(x, "resultPointCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
