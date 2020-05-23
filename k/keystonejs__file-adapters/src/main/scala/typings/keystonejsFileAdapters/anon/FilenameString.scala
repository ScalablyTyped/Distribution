package typings.keystonejsFileAdapters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilenameString extends js.Object {
  var filename: String
}

object FilenameString {
  @scala.inline
  def apply(filename: String): FilenameString = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilenameString]
  }
}

