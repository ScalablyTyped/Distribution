package typings.koaDashSessionDashMinimal.koaDashSessionDashMinimalMod.koaMod

import typings.koaDashSessionDashMinimal.Anon_RegenerateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: js.Any
  var sessionHandler: Anon_RegenerateId
}

object Context {
  @scala.inline
  def apply(session: js.Any, sessionHandler: Anon_RegenerateId): Context = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionHandler = sessionHandler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

