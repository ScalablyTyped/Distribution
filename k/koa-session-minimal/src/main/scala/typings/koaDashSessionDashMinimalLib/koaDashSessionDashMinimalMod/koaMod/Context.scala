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
    val __obj = js.Dynamic.literal(session = session, sessionHandler = sessionHandler)
  
    __obj.asInstanceOf[Context]
  }
}

