package typings.jupyterlabServices.messagesMod

import typings.jupyterlabNbformat.mod.ILanguageInfoMetadata
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageInfo extends ILanguageInfoMetadata {
  var nbconverter_exporter: js.UndefOr[String] = js.undefined
  var version: String
}

object ILanguageInfo {
  @scala.inline
  def apply(
    name: String,
    version: String,
    codemirror_mode: String | PartialJSONObject = null,
    file_extension: String = null,
    mimetype: String = null,
    nbconverter_exporter: String = null,
    pygments_lexer: String = null
  ): ILanguageInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (codemirror_mode != null) __obj.updateDynamic("codemirror_mode")(codemirror_mode.asInstanceOf[js.Any])
    if (file_extension != null) __obj.updateDynamic("file_extension")(file_extension.asInstanceOf[js.Any])
    if (mimetype != null) __obj.updateDynamic("mimetype")(mimetype.asInstanceOf[js.Any])
    if (nbconverter_exporter != null) __obj.updateDynamic("nbconverter_exporter")(nbconverter_exporter.asInstanceOf[js.Any])
    if (pygments_lexer != null) __obj.updateDynamic("pygments_lexer")(pygments_lexer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfo]
  }
}

