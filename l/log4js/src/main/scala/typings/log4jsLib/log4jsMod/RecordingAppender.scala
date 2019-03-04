package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordingAppender extends Appender {
  var `type`: log4jsLib.log4jsLibStrings.recording
}

object RecordingAppender {
  @scala.inline
  def apply(`type`: log4jsLib.log4jsLibStrings.recording): RecordingAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecordingAppender]
  }
}

