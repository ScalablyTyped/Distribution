package typings.gulpFlatten.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var newPath: String
}

object IOptions {
  @scala.inline
  def apply(newPath: String): IOptions = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

