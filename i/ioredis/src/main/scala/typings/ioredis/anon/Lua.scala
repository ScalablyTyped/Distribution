package typings.ioredis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lua extends js.Object {
  var lua: js.UndefOr[String] = js.undefined
  var numberOfKeys: js.UndefOr[Double] = js.undefined
}

object Lua {
  @scala.inline
  def apply(lua: String = null, numberOfKeys: js.UndefOr[Double] = js.undefined): Lua = {
    val __obj = js.Dynamic.literal()
    if (lua != null) __obj.updateDynamic("lua")(lua.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfKeys)) __obj.updateDynamic("numberOfKeys")(numberOfKeys.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lua]
  }
}

