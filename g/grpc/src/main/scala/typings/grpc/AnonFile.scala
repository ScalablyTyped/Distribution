package typings.grpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var file: String
  var root: String
}

object AnonFile {
  @scala.inline
  def apply(file: String, root: String): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
}

