package typings
package grammarkdownLib.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncHostOptions extends HostBaseOptions {
  var readFileSync: js.UndefOr[
    (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      java.lang.String
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false`
  ] = js.undefined
  var writeFileSync: js.UndefOr[
    (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* content */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      scala.Unit
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false`
  ] = js.undefined
}

object SyncHostOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    knownGrammars: stdLib.Record[java.lang.String, java.lang.String] = null,
    readFileSync: (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      java.lang.String
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false` = null,
    useBuiltinGrammars: js.UndefOr[scala.Boolean] = js.undefined,
    writeFileSync: (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* content */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      scala.Unit
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false` = null
  ): SyncHostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars)
    if (readFileSync != null) __obj.updateDynamic("readFileSync")(readFileSync.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars)
    if (writeFileSync != null) __obj.updateDynamic("writeFileSync")(writeFileSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncHostOptions]
  }
}

