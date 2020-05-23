package typings.grpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var file: String
  var root: String
}

object File {
  @scala.inline
  def apply(file: String, root: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

