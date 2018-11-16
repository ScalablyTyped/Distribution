package typings
package historyLib.createHashHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HashHistoryBuildOptions extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var hashType: js.UndefOr[HashType] = js.undefined
}

