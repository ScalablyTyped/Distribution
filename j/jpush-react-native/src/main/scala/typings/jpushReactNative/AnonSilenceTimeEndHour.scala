package typings.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSilenceTimeEndHour extends js.Object {
  var silenceTimeEndHour: Double
  var silenceTimeEndMinute: Double
  var silenceTimeStartHour: Double
  var silenceTimeStartMinute: Double
}

object AnonSilenceTimeEndHour {
  @scala.inline
  def apply(
    silenceTimeEndHour: Double,
    silenceTimeEndMinute: Double,
    silenceTimeStartHour: Double,
    silenceTimeStartMinute: Double
  ): AnonSilenceTimeEndHour = {
    val __obj = js.Dynamic.literal(silenceTimeEndHour = silenceTimeEndHour.asInstanceOf[js.Any], silenceTimeEndMinute = silenceTimeEndMinute.asInstanceOf[js.Any], silenceTimeStartHour = silenceTimeStartHour.asInstanceOf[js.Any], silenceTimeStartMinute = silenceTimeStartMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSilenceTimeEndHour]
  }
}

