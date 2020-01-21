package typings.grammarkdown.hostMod

import typings.prex.mod.CancellationToken
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostOptions extends HostBaseOptions {
  var readFile: js.UndefOr[
    js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[String]
    ]
  ] = js.undefined
  var readFileSync: js.UndefOr[
    js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      String
    ]
  ] = js.undefined
  var writeFile: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[Unit]
    ]
  ] = js.undefined
  var writeFileSync: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit
    ]
  ] = js.undefined
}

object HostOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    knownGrammars: Record[String, String] = null,
    readFile: js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[String]
    ] = null,
    readFileSync: js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      String
    ] = null,
    useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined,
    writeFile: js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[Unit]
    ] = null,
    writeFileSync: js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit
    ] = null
  ): HostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(readFile.asInstanceOf[js.Any])
    if (readFileSync != null) __obj.updateDynamic("readFileSync")(readFileSync.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars.asInstanceOf[js.Any])
    if (writeFile != null) __obj.updateDynamic("writeFile")(writeFile.asInstanceOf[js.Any])
    if (writeFileSync != null) __obj.updateDynamic("writeFileSync")(writeFileSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostOptions]
  }
}

