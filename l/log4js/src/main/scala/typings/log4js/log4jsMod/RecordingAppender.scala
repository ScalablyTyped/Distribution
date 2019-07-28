package typings.log4js.log4jsMod

import typings.log4js.log4jsStrings.recording
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordingAppender extends Appender {
  var `type`: recording
}

object RecordingAppender {
  @scala.inline
  def apply(`type`: recording): RecordingAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecordingAppender]
  }
}

