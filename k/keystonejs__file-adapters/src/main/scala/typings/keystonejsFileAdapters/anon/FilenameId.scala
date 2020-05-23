package typings.keystonejsFileAdapters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilenameId extends js.Object {
  var filename: String
  var id: String
}

object FilenameId {
  @scala.inline
  def apply(filename: String, id: String): FilenameId = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilenameId]
  }
}

