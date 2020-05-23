package typings.jqueryAjaxfile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval extends js.Object {
  /**
    * The rate (in milliseconds) at which animations fire.
    */
  var interval: Double
  /**
    * Globally disable all animations.
    */
  var off: Boolean
  var speeds: Fast
  var step: js.Any
  def stop(): Unit
  def tick(): Unit
}

object Interval {
  @scala.inline
  def apply(interval: Double, off: Boolean, speeds: Fast, step: js.Any, stop: () => Unit, tick: () => Unit): Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), tick = js.Any.fromFunction0(tick))
    __obj.asInstanceOf[Interval]
  }
}

