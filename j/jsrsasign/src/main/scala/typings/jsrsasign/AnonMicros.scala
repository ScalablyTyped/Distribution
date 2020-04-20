package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMicros extends js.Object {
  var micros: Double
  var millis: Double
  var seconds: Double
}

object AnonMicros {
  @scala.inline
  def apply(micros: Double, millis: Double, seconds: Double): AnonMicros = {
    val __obj = js.Dynamic.literal(micros = micros.asInstanceOf[js.Any], millis = millis.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMicros]
  }
}

