package typings
package historyLib.createBrowserHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BrowserHistoryBuildOptions extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var forceRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var keyLength: js.UndefOr[scala.Double] = js.undefined
}

