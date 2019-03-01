package typings
package koaDashBouncerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctx extends js.Object {
  var ctx: koaLib.koaMod.ApplicationNs.Context
  var key: java.lang.String
  var vals: js.Any
}

object Anon_Ctx {
  @scala.inline
  def apply(ctx: koaLib.koaMod.ApplicationNs.Context, key: java.lang.String, vals: js.Any): Anon_Ctx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctx")(ctx)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("vals")(vals)
    __obj.asInstanceOf[Anon_Ctx]
  }
}

