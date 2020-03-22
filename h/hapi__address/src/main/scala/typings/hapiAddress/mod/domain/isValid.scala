package typings.hapiAddress.mod.domain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/address", "domain.isValid")
@js.native
object isValid extends js.Object {
  /**
    * Analyzes a string to verify it is a valid domain name.
    * 
    * @param domain - the domain name to validate.
    * @param options - optional settings.
    * 
    * @return - true when valid, otherwise false.
    */
  def apply(domain: String): Boolean = js.native
  def apply(domain: String, options: Options): Boolean = js.native
}

