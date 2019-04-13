package typings
package koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.Session | scala.Null
  var sessionSave: scala.Boolean | scala.Null
  def regenerateSession(): stdLib.Generator
}

object Context {
  @scala.inline
  def apply(
    regenerateSession: () => stdLib.Generator,
    session: koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.Session = null,
    sessionSave: js.UndefOr[scala.Boolean] = js.undefined
  ): Context = {
    val __obj = js.Dynamic.literal(regenerateSession = js.Any.fromFunction0(regenerateSession))
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(sessionSave)) __obj.updateDynamic("sessionSave")(sessionSave)
    __obj.asInstanceOf[Context]
  }
}

