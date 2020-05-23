package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: Double
  var source_type: String
}

object Length {
  @scala.inline
  def apply(length: Double, source_type: String): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

