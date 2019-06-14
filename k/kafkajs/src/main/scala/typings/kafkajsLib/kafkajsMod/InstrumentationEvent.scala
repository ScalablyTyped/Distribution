package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstrumentationEvent[T] extends js.Object {
  var id: java.lang.String
  var payload: T
  var timestamp: scala.Double
  var `type`: java.lang.String
}

object InstrumentationEvent {
  @scala.inline
  def apply[T](id: java.lang.String, payload: T, timestamp: scala.Double, `type`: java.lang.String): InstrumentationEvent[T] = {
    val __obj = js.Dynamic.literal(id = id, payload = payload.asInstanceOf[js.Any], timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InstrumentationEvent[T]]
  }
}

