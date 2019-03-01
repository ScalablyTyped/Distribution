package typings
package koaDashSessionLib.koaDashSessionMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: koaDashSessionLib.koaDashSessionMod.sessionNs.Session | scala.Null
  val sessionOptions: js.UndefOr[koaDashSessionLib.koaDashSessionMod.sessionNs.opts]
}

object Context {
  @scala.inline
  def apply(
    session: koaDashSessionLib.koaDashSessionMod.sessionNs.Session = null,
    sessionOptions: koaDashSessionLib.koaDashSessionMod.sessionNs.opts = null
  ): Context = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionOptions != null) __obj.updateDynamic("sessionOptions")(sessionOptions)
    __obj.asInstanceOf[Context]
  }
}

