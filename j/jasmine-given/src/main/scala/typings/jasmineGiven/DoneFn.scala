package typings.jasmineGiven

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoneFn extends StObject {
  
  def apply(): Unit = js.native
  
  /** fails the spec and indicates that it has completed. If the message is an Error, Error.message is used */
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  def fail(message: js.Error): Unit = js.native
}
