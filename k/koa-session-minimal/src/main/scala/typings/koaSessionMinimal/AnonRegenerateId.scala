package typings.koaSessionMinimal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegenerateId extends js.Object {
  def regenerateId(): Unit
}

object AnonRegenerateId {
  @scala.inline
  def apply(regenerateId: () => Unit): AnonRegenerateId = {
    val __obj = js.Dynamic.literal(regenerateId = js.Any.fromFunction0(regenerateId))
    __obj.asInstanceOf[AnonRegenerateId]
  }
}

