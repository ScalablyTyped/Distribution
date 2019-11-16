package typings.atKeystonejsFileDashAdapters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var id: String
  var stream: js.Any
}

object Anon_Filename {
  @scala.inline
  def apply(id: String, stream: js.Any, filename: String = null): Anon_Filename = {
    val __obj = js.Dynamic.literal(id = id, stream = stream)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Anon_Filename]
  }
}

