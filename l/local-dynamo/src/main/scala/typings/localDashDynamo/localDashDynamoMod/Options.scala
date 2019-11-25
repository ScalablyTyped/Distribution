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
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (heap != null) __obj.updateDynamic("heap")(heap.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedDb)) __obj.updateDynamic("sharedDb")(sharedDb.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

