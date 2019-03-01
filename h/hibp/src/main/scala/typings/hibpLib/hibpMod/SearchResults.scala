package typings
package hibpLib.hibpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var breaches: js.Array[Breach] | scala.Null
  var pastes: js.Array[Paste] | scala.Null
}

object SearchResults {
  @scala.inline
  def apply(breaches: js.Array[Breach] = null, pastes: js.Array[Paste] = null): SearchResults = {
    val __obj = js.Dynamic.literal()
    if (breaches != null) __obj.updateDynamic("breaches")(breaches)
    if (pastes != null) __obj.updateDynamic("pastes")(pastes)
    __obj.asInstanceOf[SearchResults]
  }
}

