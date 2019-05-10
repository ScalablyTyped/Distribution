package typings
package atHapiNesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: scala.Double
  var explanation: java.lang.String
  var reason: java.lang.String
  var wasClean: scala.Boolean
}

object Anon_Code {
  @scala.inline
  def apply(
    code: scala.Double,
    explanation: java.lang.String,
    reason: java.lang.String,
    wasClean: scala.Boolean
  ): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, explanation = explanation, reason = reason, wasClean = wasClean)
  
    __obj.asInstanceOf[Anon_Code]
  }
}

