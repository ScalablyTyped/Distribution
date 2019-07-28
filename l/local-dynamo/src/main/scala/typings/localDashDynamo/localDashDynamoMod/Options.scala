package typings.localDashDynamo.localDashDynamoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cors: js.UndefOr[String | js.Array[String]] = js.undefined
  var detached: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var heap: js.UndefOr[String] = js.undefined
  var port: Double
  var sharedDb: js.UndefOr[Boolean] = js.undefined
  var stdio: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    port: Double,
    cors: String | js.Array[String] = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    heap: String = null,
    sharedDb: js.UndefOr[Boolean] = js.undefined,
    stdio: String = null
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

