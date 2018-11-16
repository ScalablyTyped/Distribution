package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShape extends INode {
  def applyLineJoin(): scala.Unit = js.native
  def drawImage(): scala.Unit = js.native
  def fill(): scala.Unit = js.native
  def fillText(text: java.lang.String): scala.Unit = js.native
  def getCanvas(): ICanvas = js.native
  def getContext(): js.Any = js.native
  def getDrawFunc(): js.Any = js.native
  def getFill(): java.lang.String = js.native
  def getLineJoin(): js.Any = js.native
  def getShadow(): js.Any = js.native
  def getStroke(): js.Any = js.native
  def getStrokeWidth(): scala.Double = js.native
  def intersects(point: js.Any): scala.Boolean = js.native
  def setDrawFunc(drawFunc: js.Function0[_]): js.Any = js.native
  def setFill(fill: java.lang.String): js.Any = js.native
  def setLineJoin(): js.Any = js.native
  def setShadow(config: js.Any): js.Any = js.native
  def setStroke(stroke: java.lang.String): js.Any = js.native
  def setStrokeWidth(strokeWidth: scala.Double): js.Any = js.native
  def stroke(): js.Any = js.native
  def strokeText(text: java.lang.String): js.Any = js.native
}

