package typings
package localDashDynamoLib.localDashDynamoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cors: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var heap: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
  var sharedDb: js.UndefOr[scala.Boolean] = js.undefined
  var stdio: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    port: scala.Double,
    cors: java.lang.String | js.Array[java.lang.String] = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    dir: java.lang.String = null,
    heap: java.lang.String = null,
    sharedDb: js.UndefOr[scala.Boolean] = js.undefined,
    stdio: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(port = port)
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (heap != null) __obj.updateDynamic("heap")(heap)
    if (!js.isUndefined(sharedDb)) __obj.updateDynamic("sharedDb")(sharedDb)
    if (stdio != null) __obj.updateDynamic("stdio")(stdio)
    __obj.asInstanceOf[Options]
  }
}

