package typings.keystonejsFileAdapters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilenameString extends js.Object {
  var filename: String
}

object AnonFilenameString {
  @scala.inline
  def apply(filename: String): AnonFilenameString = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilenameString]
  }
}

