package typings.jestValidate

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("jest-validate/build/utils", "DEPRECATION")
  @js.native
  val DEPRECATION: String = js.native
  
  @JSImport("jest-validate/build/utils", "ERROR")
  @js.native
  val ERROR: String = js.native
  
  @JSImport("jest-validate/build/utils", "ValidationError")
  @js.native
  class ValidationError protected () extends Error {
    def this(name: String, message: String) = this()
    def this(name: String, message: String, comment: String) = this()
  }
  
  @JSImport("jest-validate/build/utils", "WARNING")
  @js.native
  val WARNING: String = js.native
  
  @JSImport("jest-validate/build/utils", "createDidYouMeanMessage")
  @js.native
  def createDidYouMeanMessage(unrecognized: String, allowedOptions: js.Array[String]): String = js.native
  
  @JSImport("jest-validate/build/utils", "format")
  @js.native
  def format(value: js.Any): String = js.native
  
  @JSImport("jest-validate/build/utils", "formatPrettyObject")
  @js.native
  def formatPrettyObject(value: js.Any): String = js.native
  
  @JSImport("jest-validate/build/utils", "logValidationWarning")
  @js.native
  def logValidationWarning(name: String, message: String): Unit = js.native
  @JSImport("jest-validate/build/utils", "logValidationWarning")
  @js.native
  def logValidationWarning(name: String, message: String, comment: String): Unit = js.native
}
