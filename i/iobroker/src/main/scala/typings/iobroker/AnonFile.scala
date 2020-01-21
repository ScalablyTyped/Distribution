package typings.iobroker

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var file: String | Buffer
  var mimeType: String
}

object AnonFile {
  @scala.inline
  def apply(file: String | Buffer, mimeType: String): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFile]
  }
}

