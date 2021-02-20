package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashEdge extends StObject {
  
  var cubicSegmentIndex: Double = js.native
  
  def getControl(i: Double): FlashPoint = js.native
  
  def getHalfEdge(index: Double): FlashHalfEdge = js.native
  
  var id: Double = js.native
  
  var isLine: Boolean = js.native
  
  def setControl(index: Double, x: Double, y: Double): Unit = js.native
  
  def splitEdge(t: Double): Unit = js.native
  
  var stroke: FlashStroke = js.native
}
object FlashEdge {
  
  @scala.inline
  def apply(
    cubicSegmentIndex: Double,
    getControl: Double => FlashPoint,
    getHalfEdge: Double => FlashHalfEdge,
    id: Double,
    isLine: Boolean,
    setControl: (Double, Double, Double) => Unit,
    splitEdge: Double => Unit,
    stroke: FlashStroke
  ): FlashEdge = {
    val __obj = js.Dynamic.literal(cubicSegmentIndex = cubicSegmentIndex.asInstanceOf[js.Any], getControl = js.Any.fromFunction1(getControl), getHalfEdge = js.Any.fromFunction1(getHalfEdge), id = id.asInstanceOf[js.Any], isLine = isLine.asInstanceOf[js.Any], setControl = js.Any.fromFunction3(setControl), splitEdge = js.Any.fromFunction1(splitEdge), stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashEdge]
  }
  
  @scala.inline
  implicit class FlashEdgeMutableBuilder[Self <: FlashEdge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCubicSegmentIndex(value: Double): Self = StObject.set(x, "cubicSegmentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetControl(value: Double => FlashPoint): Self = StObject.set(x, "getControl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHalfEdge(value: Double => FlashHalfEdge): Self = StObject.set(x, "getHalfEdge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLine(value: Boolean): Self = StObject.set(x, "isLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetControl(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setControl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSplitEdge(value: Double => Unit): Self = StObject.set(x, "splitEdge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStroke(value: FlashStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
