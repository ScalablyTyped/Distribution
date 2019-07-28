package typings.iobroker

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: String | Buffer
  var mimeType: String
}

object Anon_File {
  @scala.inline
  def apply(file: String | Buffer, mimeType: String): Anon_File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mimeType = mimeType)
  
    __obj.asInstanceOf[Anon_File]
  }
}

