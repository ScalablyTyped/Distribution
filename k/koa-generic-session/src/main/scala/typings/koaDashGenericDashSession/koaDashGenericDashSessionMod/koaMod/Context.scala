package typings.koaDashGenericDashSession.koaDashGenericDashSessionMod.koaMod

import typings.koaDashGenericDashSession.koaDashGenericDashSessionMod.Session
import typings.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: Session | Null
  var sessionSave: Boolean | Null
  def regenerateSession(): Generator[_, _, _]
}

object Context {
  @scala.inline
  def apply(
    regenerateSession: () => Generator[_, _, _],
    session: Session = null,
    sessionSave: js.UndefOr[Boolean] = js.undefined
  ): Context = {
    val __obj = js.Dynamic.literal(regenerateSession = js.Any.fromFunction0(regenerateSession))
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(sessionSave)) __obj.updateDynamic("sessionSave")(sessionSave)
    __obj.asInstanceOf[Context]
  }
}

