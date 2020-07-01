package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Journeys extends js.Object {
  var earlierRef: js.UndefOr[String] = js.undefined
  var journeys: js.Array[Journey]
  var laterRef: js.UndefOr[String] = js.undefined
}

object Journeys {
  @scala.inline
  def apply(journeys: js.Array[Journey], earlierRef: String = null, laterRef: String = null): Journeys = {
    val __obj = js.Dynamic.literal(journeys = journeys.asInstanceOf[js.Any])
    if (earlierRef != null) __obj.updateDynamic("earlierRef")(earlierRef.asInstanceOf[js.Any])
    if (laterRef != null) __obj.updateDynamic("laterRef")(laterRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Journeys]
  }
}

