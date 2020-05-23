package typings.keystonejsFileAdapters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var originalFilename: String
}

object Id {
  @scala.inline
  def apply(id: String, originalFilename: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

