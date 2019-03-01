package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiprocessAppender extends Appender {
  // (only needed if mode == master)- the name of the appender to send the log events to
  var appender: js.UndefOr[java.lang.String] = js.undefined
  // (defaults to localhost) - the host/IP address to listen on, or send to
  var loggerHost: js.UndefOr[java.lang.String] = js.undefined
  // (defaults to 5000) - the port to listen on, or send to
  var loggerPort: js.UndefOr[scala.Double] = js.undefined
  // controls whether the appender listens for log events sent over the network, or is responsible for serialising events and sending them to a server.
  var mode: log4jsLib.log4jsLibStrings.master | log4jsLib.log4jsLibStrings.worker
  var `type`: log4jsLib.log4jsLibStrings.multiprocess
}

object MultiprocessAppender {
  @scala.inline
  def apply(
    mode: log4jsLib.log4jsLibStrings.master | log4jsLib.log4jsLibStrings.worker,
    `type`: log4jsLib.log4jsLibStrings.multiprocess,
    appender: java.lang.String = null,
    loggerHost: java.lang.String = null,
    loggerPort: scala.Int | scala.Double = null
  ): MultiprocessAppender = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (appender != null) __obj.updateDynamic("appender")(appender)
    if (loggerHost != null) __obj.updateDynamic("loggerHost")(loggerHost)
    if (loggerPort != null) __obj.updateDynamic("loggerPort")(loggerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiprocessAppender]
  }
}

