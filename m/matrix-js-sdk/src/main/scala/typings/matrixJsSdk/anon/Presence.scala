package typings.matrixJsSdk.anon

import typings.matrixJsSdk.mod.MatrixEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presence extends js.Object {
  var presence: MatrixEvent
}

object Presence {
  @scala.inline
  def apply(presence: MatrixEvent): Presence = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presence]
  }
}

