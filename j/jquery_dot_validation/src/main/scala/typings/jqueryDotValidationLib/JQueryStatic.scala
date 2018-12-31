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

