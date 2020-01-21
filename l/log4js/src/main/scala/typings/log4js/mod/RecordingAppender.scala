package typings.log4js.mod

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
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingAppender]
  }
}

