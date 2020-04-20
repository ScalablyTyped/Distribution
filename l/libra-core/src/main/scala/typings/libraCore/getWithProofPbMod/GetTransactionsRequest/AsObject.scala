package typings.libraCore.getWithProofPbMod.GetTransactionsRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var fetchEvents: Boolean
  var limit: String
  var startVersion: String
}

object AsObject {
  @scala.inline
  def apply(fetchEvents: Boolean, limit: String, startVersion: String): AsObject = {
    val __obj = js.Dynamic.literal(fetchEvents = fetchEvents.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], startVersion = startVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

