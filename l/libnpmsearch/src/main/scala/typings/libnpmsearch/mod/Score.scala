package typings.libnpmsearch.mod

import typings.libnpmsearch.anon.Maintenance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  var detail: Maintenance
  var `final`: Double
}

object Score {
  @scala.inline
  def apply(detail: Maintenance, `final`: Double): Score = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
}

