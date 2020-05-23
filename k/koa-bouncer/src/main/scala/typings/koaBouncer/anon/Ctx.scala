package typings.koaBouncer.anon

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ctx extends js.Object {
  var ctx: Context
  var key: String
  var vals: js.Any
}

object Ctx {
  @scala.inline
  def apply(ctx: Context, key: String, vals: js.Any): Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
}

