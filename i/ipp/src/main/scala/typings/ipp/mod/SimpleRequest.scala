package typings.ipp.mod

import typings.ipp.anon.Attributescharset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleRequest extends js.Object {
  var `operation-attributes-tag`: Attributescharset
}

object SimpleRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Attributescharset): SimpleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRequest]
  }
}

