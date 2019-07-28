package typings.mainloopDotJs.mainloopDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainLoop extends js.Object {
  def getFPS(): Double = js.native
  def getMaxAllowedFPS(): Double = js.native
  def getSimulationTimestep(): Double = js.native
  def isRunning(): Boolean = js.native
  def resetFrameDelta(): Double = js.native
  def setBegin(begin: js.Function2[/* timestamp */ Double, /* delta */ Double, Unit]): MainLoop = js.native
  def setDraw(draw: js.Function1[/* interpolationPercentage */ Double, Unit]): MainLoop = js.native
  def setEnd(end: js.Function2[/* fps */ Double, /* panic */ Boolean, Unit]): MainLoop = js.native
  def setMaxAllowedFPS(): MainLoop = js.native
  def setMaxAllowedFPS(fps: Double): MainLoop = js.native
  def setSimulationTimestep(timestep: Double): MainLoop = js.native
  def setUpdate(update: js.Function1[/* delta */ Double, Unit]): MainLoop = js.native
  def start(): MainLoop = js.native
  def stop(): MainLoop = js.native
}

