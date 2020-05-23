package typings.hlsParser.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var formatVersion: js.UndefOr[String] = js.undefined
  var iv: js.UndefOr[Buffer] = js.undefined
  var method: String
  var uri: js.UndefOr[String] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    method: String,
    format: String = null,
    formatVersion: String = null,
    iv: Buffer = null,
    uri: String = null
  ): Format = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatVersion != null) __obj.updateDynamic("formatVersion")(formatVersion.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

