package typings
package koaDashSessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CtxKey extends js.Object {
  var ctx: koaDashSessionLib.koaDashSessionMod.koaMod.Context
  var key: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[stdLib.Partial[koaDashSessionLib.koaDashSessionMod.sessionNs.Session]] = js.undefined
}

object Anon_CtxKey {
  @scala.inline
  def apply(
    ctx: koaDashSessionLib.koaDashSessionMod.koaMod.Context,
    key: java.lang.String = null,
    value: stdLib.Partial[koaDashSessionLib.koaDashSessionMod.sessionNs.Session] = null
  ): Anon_CtxKey = {
    val __obj = js.Dynamic.literal(ctx = ctx)
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_CtxKey]
  }
}

