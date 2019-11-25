package typings.grammarkdown.distHostMod

import typings.grammarkdown.grammarkdownNumbers.`false`
import typings.prex.prexMod.CancellationToken
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncHostOptions extends HostBaseOptions {
  var readFileSync: js.UndefOr[
    (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      String
    ]) | `false`
  ] = js.undefined
  var writeFileSync: js.UndefOr[
    (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit
    ]) | `false`
  ] = js.undefined
}

object SyncHostOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    knownGrammars: Record[String, String] = null,
    readFileSync: (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      String
    ]) | `false` = null,
    useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined,
    writeFileSync: (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit
    ]) | `false` = null
  ): SyncHostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars.asInstanceOf[js.Any])
    if (readFileSync != null) __obj.updateDynamic("readFileSync")(readFileSync.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars.asInstanceOf[js.Any])
    if (writeFileSync != null) __obj.updateDynamic("writeFileSync")(writeFileSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncHostOptions]
  }
}

