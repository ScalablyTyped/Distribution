package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var data: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.ReadWriteStream
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var knownLength: js.UndefOr[scala.Double] = js.undefined
  def getType(): java.lang.String
}

object Attachment {
  @scala.inline
  def apply(
    data: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.ReadWriteStream,
    getType: js.Function0[java.lang.String],
    contentType: java.lang.String = null,
    filename: java.lang.String = null,
    knownLength: scala.Int | scala.Double = null
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("getType")(getType)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (knownLength != null) __obj.updateDynamic("knownLength")(knownLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

