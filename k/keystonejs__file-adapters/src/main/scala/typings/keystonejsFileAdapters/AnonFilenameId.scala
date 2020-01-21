package typings.keystonejsFileAdapters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilenameId extends js.Object {
  var filename: String
  var id: String
}

object AnonFilenameId {
  @scala.inline
  def apply(filename: String, id: String): AnonFilenameId = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilenameId]
  }
}

