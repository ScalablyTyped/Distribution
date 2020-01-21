package typings.hexoFs

import typings.hexoFs.hexoFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferEncoding extends js.Object {
  var encoding: buffer
}

object AnonBufferEncoding {
  @scala.inline
  def apply(encoding: buffer): AnonBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferEncoding]
  }
}

