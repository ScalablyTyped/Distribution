package typings.grammarkdown.hostMod

import typings.grammarkdown.grammarkdownBooleans.`false`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncHostOptions extends HostBaseOptions {
  var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback | `false`] = js.undefined
  var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback | `false`] = js.undefined
}

object AsyncHostOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    knownGrammars: Record[String, String] = null,
    readFile: ReadFileCallback | LegacyReadFileCallback | `false` = null,
    useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined,
    writeFile: WriteFileCallback | LegacyWriteFileCallback | `false` = null
  ): AsyncHostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(readFile.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars.get.asInstanceOf[js.Any])
    if (writeFile != null) __obj.updateDynamic("writeFile")(writeFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncHostOptions]
  }
}

