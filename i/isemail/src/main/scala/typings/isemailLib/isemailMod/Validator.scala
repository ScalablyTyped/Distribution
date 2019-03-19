package typings
package isemailLib.isemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator extends js.Object {
  /**
    * Check that an email address conforms to RFCs 5321, 5322, 6530 and others.
    *
    *  ```
    * import * as IsEmail from "isemail";
    *
    * IsEmail.validate("test@e.com");
    * // => true
    * ```
    */
  def validate(email: java.lang.String): scala.Boolean = js.native
  /**
    * Check that an email address conforms to RFCs 5321, 5322, 6530 and others.
    *
    * ```
    * import * as IsEmail from "isemail";
    *
    * IsEmail.validate("test@iana.org", { errorLevel: true });
    * // => 0
    * IsEmail.validate("test @e.com", { errorLevel: 50 });
    * // => 0
    * IsEmail.validate('test @e.com', { errorLevel: true })
    * // => 49
    * ```
    */
  def validate(email: java.lang.String, options: isemailLib.OptionsWithNumThreshold): scala.Double = js.native
  /**
    * Check that an email address conforms to RFCs 5321, 5322, 6530 and others.
    *
    * ```
    * import * as IsEmail from "isemail";
    *
    * IsEmail.validate("test@iana.org", { errorLevel: false });
    * // => true
    * ```
    */
  @JSName("validate")
  def validate_Boolean(email: java.lang.String, options: isemailLib.OptionsWithBool): scala.Boolean = js.native
}

