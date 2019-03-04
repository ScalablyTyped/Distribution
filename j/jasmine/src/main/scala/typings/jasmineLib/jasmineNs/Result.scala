package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var `type`: java.lang.String
}

object Result {
  @scala.inline
  def apply(`type`: java.lang.String): Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Result]
  }
}

