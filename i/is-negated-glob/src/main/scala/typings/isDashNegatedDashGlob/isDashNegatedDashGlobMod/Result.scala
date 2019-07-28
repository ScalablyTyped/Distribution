package typings.isDashNegatedDashGlob.isDashNegatedDashGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var negated: Boolean
  var original: String
  var pattern: String
}

object Result {
  @scala.inline
  def apply(negated: Boolean, original: String, pattern: String): Result = {
    val __obj = js.Dynamic.literal(negated = negated, original = original, pattern = pattern)
  
    __obj.asInstanceOf[Result]
  }
}

