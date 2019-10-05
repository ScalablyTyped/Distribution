package typings.mailgunDashJs.mailgunDashJsMod

import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var data: String | Buffer | ReadWriteStream
  var filename: js.UndefOr[String] = js.undefined
  var knownLength: js.UndefOr[Double] = js.undefined
  def getType(): String
}

object Attachment {
  @scala.inline
  def apply(
    data: String | Buffer | ReadWriteStream,
    getType: () => String,
    contentType: String = null,
    filename: String = null,
    knownLength: Int | Double = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getType = js.Any.fromFunction0(getType))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (knownLength != null) __obj.updateDynamic("knownLength")(knownLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

