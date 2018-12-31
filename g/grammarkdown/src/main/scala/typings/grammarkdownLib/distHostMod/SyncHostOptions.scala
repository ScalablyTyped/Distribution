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

