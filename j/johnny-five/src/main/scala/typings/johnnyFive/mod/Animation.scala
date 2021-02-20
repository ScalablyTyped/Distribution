package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Animation")
@js.native
class Animation protected () extends StObject {
  def this(option: js.Array[Servo]) = this()
  def this(option: Servo) = this()
  
  var cuePoints: js.Array[Double] = js.native
  
  var currentSpeed: Double = js.native
  
  var duration: Double = js.native
  
  var easing: String = js.native
  
  def enqueue(segment: js.Any): Unit = js.native
  
  var fps: Double = js.native
  
  var keyFrames: Double = js.native
  
  var loop: Boolean = js.native
  
  var loopback: Double = js.native
  
  var metronomic: Boolean = js.native
  
  def next(): Unit = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  var progress: Double = js.native
  
  def speed(speed: js.Array[Double]): Unit = js.native
  
  def stop(): Unit = js.native
  
  var target: Double = js.native
}
