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
      stdLib.Promise[java.lang.String]
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false`
  ] = js.undefined
  var writeFile: js.UndefOr[
    (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ java.lang.String, 
      /* content */ java.lang.String, 
      /* cancellationToken */ js.UndefOr[prexLib.prexMod.CancellationToken], 
      stdLib.Promise[scala.Unit]
    ]) | grammarkdownLib.grammarkdownLibNumbers.`false`
  ] = js.undefined
}

