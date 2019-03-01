package typings
package grammarkdownLib.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostOptions extends HostBaseOptions {
  var readFile: js.UndefOr[
    js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      js.Promise[java.lang.String]
    ]
  ] = js.undefined
  var readFileSync: js.UndefOr[
    js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      java.lang.String
    ]
  ] = js.undefined
  var writeFile: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* content */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      js.Promise[scala.Unit]
    ]
  ] = js.undefined
  var writeFileSync: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* content */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      scala.Unit
    ]
  ] = js.undefined
}

object HostOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    knownGrammars: stdLib.Record[java.lang.String, java.lang.String] = null,
    readFile: js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      js.Promise[java.lang.String]
    ] = null,
    readFileSync: js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      java.lang.String
    ] = null,
    useBuiltinGrammars: js.UndefOr[scala.Boolean] = js.undefined,
    writeFile: js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* content */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      js.Promise[scala.Unit]
    ] = null,
    writeFileSync: js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* content */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      scala.Unit
    ] = null
  ): HostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars)
    if (readFile != null) __obj.updateDynamic("readFile")(readFile)
    if (readFileSync != null) __obj.updateDynamic("readFileSync")(readFileSync)
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars)
    if (writeFile != null) __obj.updateDynamic("writeFile")(writeFile)
    if (writeFileSync != null) __obj.updateDynamic("writeFileSync")(writeFileSync)
    __obj.asInstanceOf[HostOptions]
  }
}

