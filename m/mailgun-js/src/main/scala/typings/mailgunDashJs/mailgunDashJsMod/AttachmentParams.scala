package typings.mailgunDashJs.mailgunDashJsMod

import typings.node.Buffer
import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentParams extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var data: String | Buffer | ReadWriteStream
  var filename: js.UndefOr[String] = js.undefined
  var knownLength: js.UndefOr[Double] = js.undefined
}

object AttachmentParams {
  @scala.inline
  def apply(
    data: String | Buffer | ReadWriteStream,
    contentType: String = null,
    filename: String = null,
    knownLength: Int | Double = null
  ): AttachmentParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (knownLength != null) __obj.updateDynamic("knownLength")(knownLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentParams]
  }
}

