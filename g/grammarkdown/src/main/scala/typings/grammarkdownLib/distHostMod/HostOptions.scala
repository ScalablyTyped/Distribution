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

