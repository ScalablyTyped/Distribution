package typings.kafkajs.kafkajsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstrumentationEvent extends js.Object {
  var id: Double
  var payload: StringDictionary[js.Any]
  var timestamp: Double
  var `type`: String
}

object InstrumentationEvent {
  @scala.inline
  def apply(id: Double, payload: StringDictionary[js.Any], timestamp: Double, `type`: String): InstrumentationEvent = {
    val __obj = js.Dynamic.literal(id = id, payload = payload, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InstrumentationEvent]
  }
}

