package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ILanguageInfoMetadata
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The kernel language information specification.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
  */
trait ILanguageInfo extends ILanguageInfoMetadata {
  var nbconverter_exporter: js.UndefOr[String] = js.undefined
  var version: String
}

object ILanguageInfo {
  @scala.inline
  def apply(
    name: String,
    version: String,
    codemirror_mode: String | JSONObject = null,
    file_extension: String = null,
    mimetype: String = null,
    nbconverter_exporter: String = null,
    pygments_lexer: String = null
  ): ILanguageInfo = {
    val __obj = js.Dynamic.literal(name = name, version = version)
    if (codemirror_mode != null) __obj.updateDynamic("codemirror_mode")(codemirror_mode.asInstanceOf[js.Any])
    if (file_extension != null) __obj.updateDynamic("file_extension")(file_extension)
    if (mimetype != null) __obj.updateDynamic("mimetype")(mimetype)
    if (nbconverter_exporter != null) __obj.updateDynamic("nbconverter_exporter")(nbconverter_exporter)
    if (pygments_lexer != null) __obj.updateDynamic("pygments_lexer")(pygments_lexer)
    __obj.asInstanceOf[ILanguageInfo]
  }
}

