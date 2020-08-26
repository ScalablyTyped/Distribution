package typings.ioredis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lua extends js.Object {
  var lua: js.UndefOr[String] = js.native
  var numberOfKeys: js.UndefOr[Double] = js.native
}

object Lua {
  @scala.inline
  def apply(): Lua = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lua]
  }
  @scala.inline
  implicit class LuaOps[Self <: Lua] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLua(value: String): Self = this.set("lua", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLua: Self = this.set("lua", js.undefined)
    @scala.inline
    def setNumberOfKeys(value: Double): Self = this.set("numberOfKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfKeys: Self = this.set("numberOfKeys", js.undefined)
  }
  
}

