package typings
package ioredisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lua extends js.Object {
  var lua: js.UndefOr[java.lang.String] = js.undefined
  var numberOfKeys: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Lua {
  @scala.inline
  def apply(lua: java.lang.String = null, numberOfKeys: scala.Int | scala.Double = null): Anon_Lua = {
    val __obj = js.Dynamic.literal()
    if (lua != null) __obj.updateDynamic("lua")(lua)
    if (numberOfKeys != null) __obj.updateDynamic("numberOfKeys")(numberOfKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Lua]
  }
}

