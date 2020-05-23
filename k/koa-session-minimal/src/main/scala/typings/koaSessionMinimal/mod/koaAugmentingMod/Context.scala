package typings.koaSessionMinimal.mod.koaAugmentingMod

import typings.koaSessionMinimal.anon.RegenerateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: js.Any
  var sessionHandler: RegenerateId
}

object Context {
  @scala.inline
  def apply(session: js.Any, sessionHandler: RegenerateId): Context = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionHandler = sessionHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

