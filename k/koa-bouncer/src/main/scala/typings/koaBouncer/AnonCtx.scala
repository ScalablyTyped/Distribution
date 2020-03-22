package typings.koaBouncer

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCtx extends js.Object {
  var ctx: Context
  var key: String
  var vals: js.Any
}

object AnonCtx {
  @scala.inline
  def apply(ctx: Context, key: String, vals: js.Any): AnonCtx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCtx]
  }
}

