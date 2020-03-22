package typings.hapiAddress.mod.email

import typings.hapiAddress.mod.Analysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/address", "email.analyze")
@js.native
object analyze extends js.Object {
  /**
    * Analyzes a string to verify it is a valid email address.
    * 
    * @param email - the email address to validate.
    * @param options - optional settings.
    * 
    * @return - undefined when valid, otherwise an object with single error key with a string message value.
    */
  def apply(email: String): Analysis | Null = js.native
  def apply(email: String, options: Options): Analysis | Null = js.native
}

