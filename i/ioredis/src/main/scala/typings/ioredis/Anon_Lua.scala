package typings.ioredis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lua extends js.Object {
  var lua: js.UndefOr[String] = js.undefined
  var numberOfKeys: js.UndefOr[Double] = js.undefined
}

object Anon_Lua {
  @scala.inline
  def apply(lua: String = null, numberOfKeys: Int | Double = null): Anon_Lua = {
    val __obj = js.Dynamic.literal()
    if (lua != null) __obj.updateDynamic("lua")(lua.asInstanceOf[js.Any])
    if (numberOfKeys != null) __obj.updateDynamic("numberOfKeys")(numberOfKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Lua]
  }
}

