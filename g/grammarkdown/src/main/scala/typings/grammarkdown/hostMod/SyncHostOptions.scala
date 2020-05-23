package typings.grammarkdown.hostMod

import typings.grammarkdown.grammarkdownBooleans.`false`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncHostOptions extends HostBaseOptions {
  var readFileSync: js.UndefOr[LegacyReadFileSyncCallback | ReadFileSyncCallback | `false`] = js.undefined
  var writeFileSync: js.UndefOr[LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false`] = js.undefined
}

object SyncHostOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    knownGrammars: Record[String, String] = null,
    readFileSync: LegacyReadFileSyncCallback | ReadFileSyncCallback | `false` = null,
    useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined,
    writeFileSync: LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false` = null
  ): SyncHostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars.asInstanceOf[js.Any])
    if (readFileSync != null) __obj.updateDynamic("readFileSync")(readFileSync.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars.get.asInstanceOf[js.Any])
    if (writeFileSync != null) __obj.updateDynamic("writeFileSync")(writeFileSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncHostOptions]
  }
}

