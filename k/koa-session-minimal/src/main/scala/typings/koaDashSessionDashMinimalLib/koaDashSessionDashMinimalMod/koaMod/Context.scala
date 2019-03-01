package typings
package koaDashSessionDashMinimalLib.koaDashSessionDashMinimalMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: js.Any
  var sessionHandler: koaDashSessionDashMinimalLib.Anon_RegenerateId
}

object Context {
  @scala.inline
  def apply(session: js.Any, sessionHandler: koaDashSessionDashMinimalLib.Anon_RegenerateId): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("session")(session)
    __obj.updateDynamic("sessionHandler")(sessionHandler)
    __obj.asInstanceOf[Context]
  }
}

