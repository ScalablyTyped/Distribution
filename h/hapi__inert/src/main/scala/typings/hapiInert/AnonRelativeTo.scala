package typings.hapiInert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelativeTo extends js.Object {
  /**
    * Set the relative path
    */
  var relativeTo: String
}

object AnonRelativeTo {
  @scala.inline
  def apply(relativeTo: String): AnonRelativeTo = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelativeTo]
  }
}

