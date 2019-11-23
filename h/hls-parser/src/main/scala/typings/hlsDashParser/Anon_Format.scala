package typings.hlsDashParser

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var formatVersion: js.UndefOr[String] = js.undefined
  var iv: js.UndefOr[Buffer] = js.undefined
  var method: String
  var uri: js.UndefOr[String] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    method: String,
    format: String = null,
    formatVersion: String = null,
    iv: Buffer = null,
    uri: String = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal(method = method)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatVersion != null) __obj.updateDynamic("formatVersion")(formatVersion)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Format]
  }
}

