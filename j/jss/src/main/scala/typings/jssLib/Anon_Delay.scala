package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.Any
  var direction: js.Any
  var duration: js.Any
  var iterationCount: js.Any
  var name: js.Any
  var playState: js.Any
  var timingFunction: js.Any
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: js.Any,
    direction: js.Any,
    duration: js.Any,
    iterationCount: js.Any,
    name: js.Any,
    playState: js.Any,
    timingFunction: js.Any
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay, direction = direction, duration = duration, iterationCount = iterationCount, name = name, playState = playState, timingFunction = timingFunction)
  
    __obj.asInstanceOf[Anon_Delay]
  }
}

