package typings.kineticjs.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShape extends INode {
  def applyLineJoin(): Unit = js.native
  def drawImage(): Unit = js.native
  def fill(): Unit = js.native
  def fillText(text: String): Unit = js.native
  def getCanvas(): ICanvas = js.native
  def getContext(): js.Any = js.native
  def getDrawFunc(): js.Any = js.native
  def getFill(): String = js.native
  def getLineJoin(): js.Any = js.native
  def getShadow(): js.Any = js.native
  def getStroke(): js.Any = js.native
  def getStrokeWidth(): Double = js.native
  def intersects(point: js.Any): Boolean = js.native
  def setDrawFunc(drawFunc: js.Function0[_]): js.Any = js.native
  def setFill(fill: String): js.Any = js.native
  def setLineJoin(): js.Any = js.native
  def setShadow(config: js.Any): js.Any = js.native
  def setStroke(stroke: String): js.Any = js.native
  def setStrokeWidth(strokeWidth: Double): js.Any = js.native
  def stroke(): js.Any = js.native
  def strokeText(text: String): js.Any = js.native
}

