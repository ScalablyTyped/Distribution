package typings.jqueryDotValidation

import typings.jqueryDotValidation.JQueryValidationNs.ValidatorStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var validator: ValidatorStatic
  /**
    * Replaces {n} placeholders with arguments.
    *
    * @param template The string to format.
    */
  def format(template: String, arguments: String*): String
}

object JQueryStatic {
  @scala.inline
  def apply(format: (String, /* repeated */ String) => String, validator: ValidatorStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), validator = validator)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

