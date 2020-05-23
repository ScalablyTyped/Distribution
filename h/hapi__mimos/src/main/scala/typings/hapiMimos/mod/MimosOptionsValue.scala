package typings.hapiMimos.mod

import typings.mimeDb.mod.MimeEntry
import typings.mimeDb.mod.MimeSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimosOptionsValue extends MimeEntry {
  /**
    * Specify the type value of result objects, defaults to key.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MimosOptionsValue {
  @scala.inline
  def apply(
    charset: String = null,
    compressible: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    source: MimeSource = null,
    `type`: String = null
  ): MimosOptionsValue = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compressible)) __obj.updateDynamic("compressible")(compressible.get.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimosOptionsValue]
  }
}

