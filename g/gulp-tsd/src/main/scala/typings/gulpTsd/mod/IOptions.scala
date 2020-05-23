package typings.gulpTsd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var command: js.UndefOr[String] = js.undefined
  var config: js.UndefOr[String] = js.undefined
  var latest: js.UndefOr[Boolean] = js.undefined
  var opts: js.UndefOr[js.Object] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    command: String = null,
    config: String = null,
    latest: js.UndefOr[Boolean] = js.undefined,
    opts: js.Object = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest.get.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

