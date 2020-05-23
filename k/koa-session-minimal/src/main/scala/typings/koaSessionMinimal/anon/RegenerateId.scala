package typings.koaSessionMinimal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegenerateId extends js.Object {
  def regenerateId(): Unit
}

object RegenerateId {
  @scala.inline
  def apply(regenerateId: () => Unit): RegenerateId = {
    val __obj = js.Dynamic.literal(regenerateId = js.Any.fromFunction0(regenerateId))
    __obj.asInstanceOf[RegenerateId]
  }
}

