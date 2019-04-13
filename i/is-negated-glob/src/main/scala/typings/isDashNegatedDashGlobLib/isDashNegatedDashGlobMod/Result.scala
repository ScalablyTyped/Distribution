package typings
package isDashNegatedDashGlobLib.isDashNegatedDashGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var negated: scala.Boolean
  var original: java.lang.String
  var pattern: java.lang.String
}

object Result {
  @scala.inline
  def apply(negated: scala.Boolean, original: java.lang.String, pattern: java.lang.String): Result = {
    val __obj = js.Dynamic.literal(negated = negated, original = original, pattern = pattern)
  
    __obj.asInstanceOf[Result]
  }
}

