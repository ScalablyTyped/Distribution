package typings.log4js.mod

import typings.log4js.log4jsStrings.master
import typings.log4js.log4jsStrings.multiprocess
import typings.log4js.log4jsStrings.worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiprocessAppender
  extends StObject
     with Appender {
  
  // (only needed if mode == master)- the name of the appender to send the log events to
  var appender: js.UndefOr[String] = js.undefined
  
  // (defaults to localhost) - the host/IP address to listen on, or send to
  var loggerHost: js.UndefOr[String] = js.undefined
  
  // (defaults to 5000) - the port to listen on, or send to
  var loggerPort: js.UndefOr[Double] = js.undefined
  
  // controls whether the appender listens for log events sent over the network, or is responsible for serialising events and sending them to a server.
  var mode: master | worker
  
  var `type`: multiprocess
}
object MultiprocessAppender {
  
  @scala.inline
  def apply(mode: master | worker): MultiprocessAppender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("multiprocess")
    __obj.asInstanceOf[MultiprocessAppender]
  }
  
  @scala.inline
  implicit class MultiprocessAppenderMutableBuilder[Self <: MultiprocessAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppender(value: String): Self = StObject.set(x, "appender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppenderUndefined: Self = StObject.set(x, "appender", js.undefined)
    
    @scala.inline
    def setLoggerHost(value: String): Self = StObject.set(x, "loggerHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerHostUndefined: Self = StObject.set(x, "loggerHost", js.undefined)
    
    @scala.inline
    def setLoggerPort(value: Double): Self = StObject.set(x, "loggerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerPortUndefined: Self = StObject.set(x, "loggerPort", js.undefined)
    
    @scala.inline
    def setMode(value: master | worker): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: multiprocess): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
