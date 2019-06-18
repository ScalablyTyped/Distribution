package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstrumentationEvent extends js.Object {
  var id: scala.Double
  var payload: org.scalablytyped.runtime.StringDictionary[js.Any]
  var timestamp: scala.Double
  var `type`: java.lang.String
}

object InstrumentationEvent {
  @scala.inline
  def apply(
    id: scala.Double,
    payload: org.scalablytyped.runtime.StringDictionary[js.Any],
    timestamp: scala.Double,
    `type`: java.lang.String
  ): InstrumentationEvent = {
    val __obj = js.Dynamic.literal(id = id, payload = payload, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InstrumentationEvent]
  }
}

