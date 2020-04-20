package typings.gulpUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var file: AnonPath
}

object AnonFile {
  @scala.inline
  def apply(file: AnonPath): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
}

