package typings.keystonejsFileAdapters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilename extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var id: String
  var stream: js.Any
}

object AnonFilename {
  @scala.inline
  def apply(id: String, stream: js.Any, filename: String = null): AnonFilename = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilename]
  }
}

