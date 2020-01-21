package typings.ibmMobilefirst.WL

import typings.jquery.JQueryDeferred
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
  def config(options: LoggerOptions): LoggerObject = js.native
  /**
    * Creates an instance of a logger with its own context (also called status or state).
    */
  def create(): LogInstance = js.native
  def create(options: LoggerOptions): LogInstance = js.native
  /**
    * Updates the state (also called context or status) of the logger.
    */
  def ctx(): LoggerObject = js.native
  def ctx(options: LoggerOptions): LoggerObject = js.native
  /**
    * Prints arguments to the console.
    */
  def debug(message: String): Unit = js.native
  /**
    * Prints arguments to the console.
    */
  def error(message: String): Unit = js.native
  /**
    * Prints arguments to the console.
    */
  def fatal(message: String): Unit = js.native
  /**
    * Prints arguments to the console.
    */
  def info(message: String): Unit = js.native
  /**
    * Prints arguments to the console.
    */
  def log(message: String): Unit = js.native
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
  def send(): JQueryDeferred[_] = js.native
  /**
    * @deprecated since version 6.2. Use WL.Logger.config instead. Sets options in native application layer (iOS and Android only)
    */
  def setNativeOptions(): Unit = js.native
  def setNativeOptions(options: NativeOptions): Unit = js.native
  /**
    * Shows the status (current configuration) of the logger.
    */
  def status(): JQueryDeferred[_] = js.native
  /**
    * Prints arguments to the console.
    */
  def trace(message: String): Unit = js.native
  /**
    * Retrieves and applies any matching configuration profile from the IBM® Worklight® Server.
    */
  def updateConfigFromServer(): JQueryDeferred[_] = js.native
  /**
    * Prints arguments to the console.
    */
  def warn(message: String): Unit = js.native
}

