package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Animation")
@js.native
class Animation protected () extends js.Object {
  def this(option: Servo) = this()
  def this(option: js.Array[Servo]) = this()
  var cuePoints: js.Array[scala.Double] = js.native
  var currentSpeed: scala.Double = js.native
  var duration: scala.Double = js.native
  var easing: java.lang.String = js.native
  var fps: scala.Double = js.native
  var keyFrames: scala.Double = js.native
  var loop: scala.Boolean = js.native
  var loopback: scala.Double = js.native
  var metronomic: scala.Boolean = js.native
  var progress: scala.Double = js.native
  var target: scala.Double = js.native
  def enqueue(segment: js.Any): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def speed(speed: js.Array[scala.Double]): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

