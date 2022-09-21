package typings.jsJodaCore.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "DateTimeParseException")
@js.native
open class DateTimeParseException ()
  extends StObject
     with Error {
  def this(message: String) = this()
  def this(message: String, text: String) = this()
  def this(message: Unit, text: String) = this()
  def this(message: String, text: String, index: Double) = this()
  def this(message: String, text: Unit, index: Double) = this()
  def this(message: Unit, text: String, index: Double) = this()
  def this(message: Unit, text: Unit, index: Double) = this()
  def this(message: String, text: String, index: Double, cause: js.Error) = this()
  def this(message: String, text: String, index: Unit, cause: js.Error) = this()
  def this(message: String, text: Unit, index: Double, cause: js.Error) = this()
  def this(message: String, text: Unit, index: Unit, cause: js.Error) = this()
  def this(message: Unit, text: String, index: Double, cause: js.Error) = this()
  def this(message: Unit, text: String, index: Unit, cause: js.Error) = this()
  def this(message: Unit, text: Unit, index: Double, cause: js.Error) = this()
  def this(message: Unit, text: Unit, index: Unit, cause: js.Error) = this()
  
  def errorIndex(): Double = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  def parsedString(): String = js.native
}
