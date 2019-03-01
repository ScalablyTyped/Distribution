package typings
package koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaSessionNs.Session | scala.Null
  var sessionSave: scala.Boolean | scala.Null
  def regenerateSession(): stdLib.Generator
}

object Context {
  @scala.inline
  def apply(
    regenerateSession: js.Function0[stdLib.Generator],
    session: koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaSessionNs.Session = null,
    sessionSave: js.UndefOr[scala.Boolean] = js.undefined
  ): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("regenerateSession")(regenerateSession)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(sessionSave)) __obj.updateDynamic("sessionSave")(sessionSave)
    __obj.asInstanceOf[Context]
  }
}

