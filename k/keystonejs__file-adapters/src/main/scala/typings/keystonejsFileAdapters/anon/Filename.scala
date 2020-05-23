package typings.keystonejsFileAdapters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filename extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var id: String
  var stream: js.Any
}

object Filename {
  @scala.inline
  def apply(id: String, stream: js.Any, filename: String = null): Filename = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
}

