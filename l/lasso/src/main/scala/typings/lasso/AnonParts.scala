package typings.lasso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParts extends js.Object {
  var parts: js.Array[String]
  var value: String
}

object AnonParts {
  @scala.inline
  def apply(parts: js.Array[String], value: String): AnonParts = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParts]
  }
}

