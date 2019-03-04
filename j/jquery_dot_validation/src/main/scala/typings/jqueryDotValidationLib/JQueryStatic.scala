package typings
package jqueryDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var validator: jqueryDotValidationLib.JQueryValidationNs.ValidatorStatic
  /**
    * Replaces {n} placeholders with arguments.
    *
    * @param template The string to format.
    */
  def format(template: java.lang.String, arguments: java.lang.String*): java.lang.String
}

object JQueryStatic {
  @scala.inline
  def apply(
    format: js.Function2[java.lang.String, /* repeated */ java.lang.String, java.lang.String],
    validator: jqueryDotValidationLib.JQueryValidationNs.ValidatorStatic
  ): JQueryStatic = {
    val __obj = js.Dynamic.literal(format = format, validator = validator)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

