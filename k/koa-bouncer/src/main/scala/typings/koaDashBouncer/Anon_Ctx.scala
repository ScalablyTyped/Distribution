package typings.koaDashBouncer

import typings.koaDashBouncer.koaDashBouncerMod.koaMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctx extends js.Object {
  var ctx: Context
  var key: String
  var vals: js.Any
}

object Anon_Ctx {
  @scala.inline
  def apply(ctx: Context, key: String, vals: js.Any): Anon_Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ctx]
  }
}

