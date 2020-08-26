package typings.koaCookie.mod.koaAugmentingMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseContext extends js.Object {
  var cookie: Record[String, _] = js.native
}

object BaseContext {
  @scala.inline
  def apply(cookie: Record[String, _]): BaseContext = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseContext]
  }
  @scala.inline
  implicit class BaseContextOps[Self <: BaseContext] (val x: Self) extends AnyVal {
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
    def setCookie(value: Record[String, _]): Self = this.set("cookie", value.asInstanceOf[js.Any])
  }
  
}

