package typings
package grammarkdownLib.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncHostOptions extends HostBaseOptions {
  var readFile: js.UndefOr[
    (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      js.Promise[java.lang.String]
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false`
  ] = js.undefined
  var writeFile: js.UndefOr[
    (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* content */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      js.Promise[scala.Unit]
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false`
  ] = js.undefined
}

object AsyncHostOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    knownGrammars: stdLib.Record[java.lang.String, java.lang.String] = null,
    readFile: (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      js.Promise[java.lang.String]
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false` = null,
    useBuiltinGrammars: js.UndefOr[scala.Boolean] = js.undefined,
    writeFile: (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* content */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      js.Promise[scala.Unit]
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false` = null
  ): AsyncHostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars)
    if (readFile != null) __obj.updateDynamic("readFile")(readFile.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars)
    if (writeFile != null) __obj.updateDynamic("writeFile")(writeFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncHostOptions]
  }
}

