package typings.iobroker.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var file: String | Buffer
  var mimeType: String
}

object File {
  @scala.inline
  def apply(file: String | Buffer, mimeType: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

