package typings.ipp.mod

import typings.ipp.anon.Documenturi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendURIRequest extends js.Object {
  var `operation-attributes-tag`: Documenturi
}

object SendURIRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Documenturi): SendURIRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendURIRequest]
  }
}

