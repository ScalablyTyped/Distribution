package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Journeys extends js.Object {
  var journeys: js.Array[Journey]
}

object Journeys {
  @scala.inline
  def apply(journeys: js.Array[Journey]): Journeys = {
    val __obj = js.Dynamic.literal(journeys = journeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Journeys]
  }
}

