package typings
package historyLib.createMemoryHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MemoryHistoryBuildOptions extends js.Object {
  var getUserConfirmation: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var initialEntries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var initialIndex: js.UndefOr[scala.Double] = js.undefined
  var keyLength: js.UndefOr[scala.Double] = js.undefined
}

