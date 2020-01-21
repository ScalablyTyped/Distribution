package typings.hibp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var breaches: js.Array[Breach_] | Null
  var pastes: js.Array[Paste] | Null
}

object SearchResults {
  @scala.inline
  def apply(breaches: js.Array[Breach_] = null, pastes: js.Array[Paste] = null): SearchResults = {
    val __obj = js.Dynamic.literal()
    if (breaches != null) __obj.updateDynamic("breaches")(breaches.asInstanceOf[js.Any])
    if (pastes != null) __obj.updateDynamic("pastes")(pastes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults]
  }
}

