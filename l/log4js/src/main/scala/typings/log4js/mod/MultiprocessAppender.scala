package typings.log4js.mod

import typings.log4js.log4jsStrings.master
import typings.log4js.log4jsStrings.multiprocess
import typings.log4js.log4jsStrings.worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiprocessAppender extends Appender {
  
  // (only needed if mode == master)- the name of the appender to send the log events to
  var appender: js.UndefOr[String] = js.native
  
  // (defaults to localhost) - the host/IP address to listen on, or send to
  var loggerHost: js.UndefOr[String] = js.native
  
  // (defaults to 5000) - the port to listen on, or send to
  var loggerPort: js.UndefOr[Double] = js.native
  
  // controls whether the appender listens for log events sent over the network, or is responsible for serialising events and sending them to a server.
  var mode: master | worker = js.native
  
  var `type`: multiprocess = js.native
}
object MultiprocessAppender {
  
  @scala.inline
  def apply(mode: master | worker, `type`: multiprocess): MultiprocessAppender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiprocessAppender]
  }
  
  @scala.inline
  implicit class MultiprocessAppenderOps[Self <: MultiprocessAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMode(value: master | worker): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: multiprocess): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppender(value: String): Self = this.set("appender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppender: Self = this.set("appender", js.undefined)
    
    @scala.inline
    def setLoggerHost(value: String): Self = this.set("loggerHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggerHost: Self = this.set("loggerHost", js.undefined)
    
    @scala.inline
    def setLoggerPort(value: Double): Self = this.set("loggerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggerPort: Self = this.set("loggerPort", js.undefined)
  }
}
