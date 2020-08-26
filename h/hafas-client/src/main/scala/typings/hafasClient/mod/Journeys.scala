package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Journeys extends js.Object {
  var earlierRef: js.UndefOr[String] = js.native
  var journeys: js.Array[Journey] = js.native
  var laterRef: js.UndefOr[String] = js.native
}

object Journeys {
  @scala.inline
  def apply(journeys: js.Array[Journey]): Journeys = {
    val __obj = js.Dynamic.literal(journeys = journeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Journeys]
  }
  @scala.inline
  implicit class JourneysOps[Self <: Journeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJourneysVarargs(value: Journey*): Self = this.set("journeys", js.Array(value :_*))
    @scala.inline
    def setJourneys(value: js.Array[Journey]): Self = this.set("journeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setEarlierRef(value: String): Self = this.set("earlierRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEarlierRef: Self = this.set("earlierRef", js.undefined)
    @scala.inline
    def setLaterRef(value: String): Self = this.set("laterRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaterRef: Self = this.set("laterRef", js.undefined)
  }
  
}

