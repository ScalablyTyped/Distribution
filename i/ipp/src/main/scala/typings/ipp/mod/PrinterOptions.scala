package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterOptions extends js.Object {
  var charset: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[IPPVersion] = js.undefined
}

object PrinterOptions {
  @scala.inline
  def apply(charset: String = null, language: String = null, uri: String = null, version: IPPVersion = null): PrinterOptions = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterOptions]
  }
}

