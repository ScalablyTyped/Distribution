package typings.jqueryPlaceholder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomClass extends js.Object {
  var customClass: String
}

object CustomClass {
  @scala.inline
  def apply(customClass: String): CustomClass = {
    val __obj = js.Dynamic.literal(customClass = customClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomClass]
  }
}

