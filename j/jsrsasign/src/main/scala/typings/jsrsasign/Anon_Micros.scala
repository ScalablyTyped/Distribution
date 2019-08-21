package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Micros extends js.Object {
  var micros: Double
  var millis: Double
  var seconds: Double
}

object Anon_Micros {
  @scala.inline
  def apply(micros: Double, millis: Double, seconds: Double): Anon_Micros = {
    val __obj = js.Dynamic.literal(micros = micros, millis = millis, seconds = seconds)
  
    __obj.asInstanceOf[Anon_Micros]
  }
}

