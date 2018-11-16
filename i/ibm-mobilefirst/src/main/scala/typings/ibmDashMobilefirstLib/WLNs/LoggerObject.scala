package typings
package ibmDashMobilefirstLib.WLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Artifact to allow chaining of Logger class as: WL.Logger.ctx({pkg: 'something'}).debug('Hello world');
     */
@JSGlobal("WL.LoggerObject")
@js.native
class LoggerObject () extends js.Object {
  /**
          * Configures the logger globally.
          */
  def config(): LoggerObject = js.native
  /**
          * Configures the logger globally.
          */
  def config(options: LoggerOptions): LoggerObject = js.native
  /**
           * Creates an instance of a logger with its own context (also called status or state).
           */
  def create(): LogInstance = js.native
  /**
           * Creates an instance of a logger with its own context (also called status or state).
           */
  def create(options: LoggerOptions): LogInstance = js.native
  /**
           * Updates the state (also called context or status) of the logger.
           */
  def ctx(): LoggerObject = js.native
  /**
           * Updates the state (also called context or status) of the logger.
           */
  def ctx(options: LoggerOptions): LoggerObject = js.native
  /**
           * Prints arguments to the console.
           */
  def debug(message: java.lang.String): scala.Unit = js.native
  /**
           * Prints arguments to the console.
           */
  def error(message: java.lang.String): scala.Unit = js.native
  /**
           * Prints arguments to the console.
           */
  def fatal(message: java.lang.String): scala.Unit = js.native
  /**
           * Prints arguments to the console.
           */
  def info(message: java.lang.String): scala.Unit = js.native
  /**
           * Prints arguments to the console.
           */
  def log(message: java.lang.String): scala.Unit = js.native
  /**
           * Attach additional metadata to the next logger instance call.
           */
  def metadata(options: js.Any): LoggerObject = js.native
  /**
           * @deprecated since version 6.2. WL.Logger.on is now a no-op. WL.Logger is always enabled. Use WL.Logger.config with {'level': 'FATAL'} to reduce verbosity.
           */
  def off(): LoggerObject = js.native
  /**
           * @deprecated since version 6.2. WL.Logger.on is now a no-op. WL.Logger is always enabled. Use WL.Logger.config with {'level': 'FATAL'} to reduce verbosity.
           */
  def on(options: js.Any): LoggerObject = js.native
  /**
           * Send any logs collected up to this point to the IBM® Worklight® server.
           */
  def send(): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * @deprecated since version 6.2. Use WL.Logger.config instead. Sets options in native application layer (iOS and Android only)
           */
  def setNativeOptions(): scala.Unit = js.native
  /**
           * @deprecated since version 6.2. Use WL.Logger.config instead. Sets options in native application layer (iOS and Android only)
           */
  def setNativeOptions(options: NativeOptions): scala.Unit = js.native
  /**
           * Shows the status (current configuration) of the logger.
           */
  def status(): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * Prints arguments to the console.
           */
  def trace(message: java.lang.String): scala.Unit = js.native
  /**
           * Retrieves and applies any matching configuration profile from the IBM® Worklight® Server.
           */
  def updateConfigFromServer(): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * Prints arguments to the console.
           */
  def warn(message: java.lang.String): scala.Unit = js.native
}

