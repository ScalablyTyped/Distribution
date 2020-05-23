package typings.ipp.mod

import typings.ipp.anon.Documentnaturallanguage
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDocumentRequest extends js.Object {
  var data: js.UndefOr[Buffer] = js.undefined
  var `operation-attributes-tag`: Documentnaturallanguage
}

object SendDocumentRequest {
  @scala.inline
  def apply(`operation-attributes-tag`: Documentnaturallanguage, data: Buffer = null): SendDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDocumentRequest]
  }
}

