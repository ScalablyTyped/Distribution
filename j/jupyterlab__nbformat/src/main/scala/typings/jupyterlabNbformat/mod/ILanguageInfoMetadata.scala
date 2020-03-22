package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageInfoMetadata extends PartialJSONObject {
  var codemirror_mode: js.UndefOr[String | PartialJSONObject] = js.undefined
  var file_extension: js.UndefOr[String] = js.undefined
  var mimetype: js.UndefOr[String] = js.undefined
  var name: String
  var pygments_lexer: js.UndefOr[String] = js.undefined
}

object ILanguageInfoMetadata {
  @scala.inline
  def apply(
    name: String,
    codemirror_mode: String | PartialJSONObject = null,
    file_extension: String = null,
    mimetype: String = null,
    pygments_lexer: String = null
  ): ILanguageInfoMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (codemirror_mode != null) __obj.updateDynamic("codemirror_mode")(codemirror_mode.asInstanceOf[js.Any])
    if (file_extension != null) __obj.updateDynamic("file_extension")(file_extension.asInstanceOf[js.Any])
    if (mimetype != null) __obj.updateDynamic("mimetype")(mimetype.asInstanceOf[js.Any])
    if (pygments_lexer != null) __obj.updateDynamic("pygments_lexer")(pygments_lexer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfoMetadata]
  }
}

