package typings.libnpmsearch.mod

import typings.libnpmsearch.anon.Maintenance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Score extends js.Object {
  var detail: Maintenance = js.native
  var `final`: Double = js.native
}

object Score {
  @scala.inline
  def apply(detail: Maintenance, `final`: Double): Score = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
  @scala.inline
  implicit class ScoreOps[Self <: Score] (val x: Self) extends AnyVal {
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
    def setDetail(value: Maintenance): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinal(value: Double): Self = this.set("final", value.asInstanceOf[js.Any])
  }
  
}

