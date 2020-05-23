package typings.lasso.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parts extends js.Object {
  var parts: js.Array[String]
  var value: String
}

object Parts {
  @scala.inline
  def apply(parts: js.Array[String], value: String): Parts = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parts]
  }
}

