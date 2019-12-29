package typings.grammarkdown.distHostMod

import typings.grammarkdown.grammarkdownBooleans.`false`
import typings.prex.prexMod.CancellationToken
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncHostOptions extends HostBaseOptions {
  var readFile: js.UndefOr[
    (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[String]
    ]) | `false`
  ] = js.undefined
  var writeFile: js.UndefOr[
    (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[Unit]
    ]) | `false`
  ] = js.undefined
}

object AsyncHostOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    knownGrammars: Record[String, String] = null,
    readFile: (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[String]
    ]) | `false` = null,
    useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined,
    writeFile: (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[Unit]
    ]) | `false` = null
  ): AsyncHostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(readFile.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars.asInstanceOf[js.Any])
    if (writeFile != null) __obj.updateDynamic("writeFile")(writeFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncHostOptions]
  }
}

