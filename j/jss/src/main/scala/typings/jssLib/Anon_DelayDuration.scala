package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayDuration extends js.Object {
  var delay: js.Any
  var duration: js.Any
  var property: js.Any
  var timingFunction: js.Any
}

object Anon_DelayDuration {
  @scala.inline
  def apply(delay: js.Any, duration: js.Any, property: js.Any, timingFunction: js.Any): Anon_DelayDuration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("property")(property)
    __obj.updateDynamic("timingFunction")(timingFunction)
    __obj.asInstanceOf[Anon_DelayDuration]
  }
}

