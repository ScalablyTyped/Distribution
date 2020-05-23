package typings.grammarkdown.hostMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostOptions extends HostBaseOptions {
  var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback] = js.undefined
  var readFileSync: js.UndefOr[ReadFileSyncCallback | LegacyReadFileSyncCallback] = js.undefined
  var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback] = js.undefined
  var writeFileSync: js.UndefOr[WriteFileSyncCallback | LegacyWriteFileSyncCallback] = js.undefined
}

object HostOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    knownGrammars: Record[String, String] = null,
    readFile: ReadFileCallback | LegacyReadFileCallback = null,
    readFileSync: ReadFileSyncCallback | LegacyReadFileSyncCallback = null,
    useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined,
    writeFile: WriteFileCallback | LegacyWriteFileCallback = null,
    writeFileSync: WriteFileSyncCallback | LegacyWriteFileSyncCallback = null
  ): HostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(readFile.asInstanceOf[js.Any])
    if (readFileSync != null) __obj.updateDynamic("readFileSync")(readFileSync.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars.get.asInstanceOf[js.Any])
    if (writeFile != null) __obj.updateDynamic("writeFile")(writeFile.asInstanceOf[js.Any])
    if (writeFileSync != null) __obj.updateDynamic("writeFileSync")(writeFileSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostOptions]
  }
}

