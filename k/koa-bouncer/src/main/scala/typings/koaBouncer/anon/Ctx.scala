package typings.koaBouncer.anon

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ctx extends js.Object {
  var ctx: Context = js.native
  var key: String = js.native
  var vals: js.Any = js.native
}

object Ctx {
  @scala.inline
  def apply(ctx: Context, key: String, vals: js.Any): Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
  @scala.inline
  implicit class CtxOps[Self <: Ctx] (val x: Self) extends AnyVal {
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
    def setCtx(value: Context): Self = this.set("ctx", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setVals(value: js.Any): Self = this.set("vals", value.asInstanceOf[js.Any])
  }
  
}

