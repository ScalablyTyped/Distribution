package typings.matrixJsSdk

import typings.matrixJsSdk.mod.MatrixEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPresence extends js.Object {
  var presence: MatrixEvent
}

object AnonPresence {
  @scala.inline
  def apply(presence: MatrixEvent): AnonPresence = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPresence]
  }
}

