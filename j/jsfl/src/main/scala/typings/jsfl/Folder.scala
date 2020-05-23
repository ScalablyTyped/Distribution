package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  var contents: js.Array[File]
}

object Folder {
  @scala.inline
  def apply(contents: js.Array[File]): Folder = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
}

