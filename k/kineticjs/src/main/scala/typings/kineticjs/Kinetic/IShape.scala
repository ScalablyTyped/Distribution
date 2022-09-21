package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShape
  extends StObject
     with INode {
  
  def applyLineJoin(): Unit = js.native
  
  def drawImage(): Unit = js.native
  
  def fill(): Unit = js.native
  
  def fillText(text: String): Unit = js.native
  
  def getCanvas(): ICanvas = js.native
  
  def getContext(): Any = js.native
  
  def getDrawFunc(): Any = js.native
  
  def getFill(): String = js.native
  
  def getLineJoin(): Any = js.native
  
  def getShadow(): Any = js.native
  
  def getStroke(): Any = js.native
  
  def getStrokeWidth(): Double = js.native
  
  def intersects(point: Any): Boolean = js.native
  
  def setDrawFunc(drawFunc: js.Function0[Any]): Any = js.native
  
  def setFill(fill: String): Any = js.native
  
  def setLineJoin(): Any = js.native
  
  def setShadow(config: Any): Any = js.native
  
  def setStroke(stroke: String): Any = js.native
  
  def setStrokeWidth(strokeWidth: Double): Any = js.native
  
  def stroke(): Any = js.native
  
  def strokeText(text: String): Any = js.native
}
