package typings.hapiInert.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTo extends js.Object {
  /**
    * Set the relative path
    */
  var relativeTo: String
}

object RelativeTo {
  @scala.inline
  def apply(relativeTo: String): RelativeTo = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTo]
  }
}

