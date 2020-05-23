package typings.lgtv2.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var clientKey: js.UndefOr[String] = js.undefined
  var keyFile: js.UndefOr[String] = js.undefined
  var reconnect: js.UndefOr[Double] = js.undefined
  var saveKey: js.UndefOr[
    js.Function2[
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[ErrnoException | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    clientKey: String = null,
    keyFile: String = null,
    reconnect: js.UndefOr[Double] = js.undefined,
    saveKey: (/* key */ String, /* callback */ js.Function1[/* error */ js.UndefOr[ErrnoException | Null], Unit]) => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.get.asInstanceOf[js.Any])
    if (saveKey != null) __obj.updateDynamic("saveKey")(js.Any.fromFunction2(saveKey))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

