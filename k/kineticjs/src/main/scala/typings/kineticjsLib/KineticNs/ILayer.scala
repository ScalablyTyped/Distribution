package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayer extends IContainer {
  def afterDraw(handler: js.Function0[_]): js.Any = js.native
  def beforeDraw(handler: js.Function0[_]): js.Any = js.native
  def clear(): js.Any = js.native
  def getCanvas(): ICanvas = js.native
  def getClearBeforeDraw(): js.Any = js.native
  def getContext(): stdLib.CanvasRenderingContext2D = js.native
  def setClearBeforeDraw(clearBeforeDraw: scala.Boolean): js.Any = js.native
}

