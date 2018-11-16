package typings
package klawLib.klawMod.KNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options
  extends nodeLib.streamMod.internalNs.ReadableOptions {
  var depthLimit: js.UndefOr[scala.Double] = js.undefined
  // fs or mock-fs
  var filter: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Boolean]] = js.undefined
  var fs: js.UndefOr[js.Any] = js.undefined
  var pathSorter: js.UndefOr[
    js.Function2[/* pathA */ java.lang.String, /* pathB */ java.lang.String, scala.Double]
  ] = js.undefined
  var queueMethod: js.UndefOr[QueueMethod] = js.undefined
}

