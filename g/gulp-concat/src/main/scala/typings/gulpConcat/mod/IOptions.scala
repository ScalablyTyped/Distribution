package typings.gulpConcat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var newLine: String
}

object IOptions {
  @scala.inline
  def apply(newLine: String): IOptions = {
    val __obj = js.Dynamic.literal(newLine = newLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

