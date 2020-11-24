package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashEdge extends js.Object {
  
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
  implicit class FlashEdgeOps[Self <: FlashEdge] (val x: Self) extends AnyVal {
    
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
    def setCubicSegmentIndex(value: Double): Self = this.set("cubicSegmentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetControl(value: Double => FlashPoint): Self = this.set("getControl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHalfEdge(value: Double => FlashHalfEdge): Self = this.set("getHalfEdge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLine(value: Boolean): Self = this.set("isLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetControl(value: (Double, Double, Double) => Unit): Self = this.set("setControl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSplitEdge(value: Double => Unit): Self = this.set("splitEdge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStroke(value: FlashStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
  }
}
