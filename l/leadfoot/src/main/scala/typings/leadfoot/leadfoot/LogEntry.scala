package typings.leadfoot.leadfoot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A remote log entry.
	 */
trait LogEntry extends js.Object {
  /**
  		 * The severity level of the entry. This level is not currently normalised.
  		 */
  var level: String
  /**
  		 * The log entry message.
  		 */
  var message: String
  /**
  		 * The timestamp of the entry in seconds since unix epoch.
  		 */
  var timestamp: Double
}

object LogEntry {
  @scala.inline
  def apply(level: String, message: String, timestamp: Double): LogEntry = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogEntry]
  }
}

