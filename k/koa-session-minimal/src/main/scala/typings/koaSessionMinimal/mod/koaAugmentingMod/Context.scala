package typings.koaSessionMinimal.mod.koaAugmentingMod

import typings.koaSessionMinimal.AnonRegenerateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: js.Any
  var sessionHandler: AnonRegenerateId
}

object Context {
  @scala.inline
  def apply(session: js.Any, sessionHandler: AnonRegenerateId): Context = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionHandler = sessionHandler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

