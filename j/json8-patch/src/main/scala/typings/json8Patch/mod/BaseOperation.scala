package typings.json8Patch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperation extends js.Object {
  var path: String
}

object BaseOperation {
  @scala.inline
  def apply(path: String): BaseOperation = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOperation]
  }
}

