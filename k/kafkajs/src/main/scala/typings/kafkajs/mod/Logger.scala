package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends StObject {
  
  def debug(message: String): Unit = js.native
  def debug(message: String, extra: js.Object): Unit = js.native
  
  def error(message: String): Unit = js.native
  def error(message: String, extra: js.Object): Unit = js.native
  
  def info(message: String): Unit = js.native
  def info(message: String, extra: js.Object): Unit = js.native
  
  def namespace(namespace: String): Logger = js.native
  def namespace(namespace: String, logLevel: logLevel): Logger = js.native
  
  def setLogLevel(logLevel: logLevel): Unit = js.native
  
  def warn(message: String): Unit = js.native
  def warn(message: String, extra: js.Object): Unit = js.native
}
