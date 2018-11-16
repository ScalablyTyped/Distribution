package typings
package mainloopDotJsLib.mainloopDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainLoop extends js.Object {
  def getFPS(): scala.Double = js.native
  def getMaxAllowedFPS(): scala.Double = js.native
  def getSimulationTimestep(): scala.Double = js.native
  def isRunning(): scala.Boolean = js.native
  def resetFrameDelta(): scala.Double = js.native
  def setBegin(begin: js.Function2[/* timestamp */ scala.Double, /* delta */ scala.Double, scala.Unit]): MainLoop = js.native
  def setDraw(draw: js.Function1[/* interpolationPercentage */ scala.Double, scala.Unit]): MainLoop = js.native
  def setEnd(end: js.Function2[/* fps */ scala.Double, /* panic */ scala.Boolean, scala.Unit]): MainLoop = js.native
  def setMaxAllowedFPS(): MainLoop = js.native
  def setMaxAllowedFPS(fps: scala.Double): MainLoop = js.native
  def setSimulationTimestep(timestep: scala.Double): MainLoop = js.native
  def setUpdate(update: js.Function1[/* delta */ scala.Double, scala.Unit]): MainLoop = js.native
  def start(): MainLoop = js.native
  def stop(): MainLoop = js.native
}

