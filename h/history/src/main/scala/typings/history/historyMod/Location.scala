package typings.history.historyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location[S] extends js.Object {
  var hash: Hash
  var key: js.UndefOr[LocationKey] = js.undefined
  var pathname: Pathname
  var search: Search
  var state: S
}

object Location {
  @scala.inline
  def apply[S](hash: Hash, pathname: Pathname, search: Search, state: S, key: LocationKey = null): Location[S] = {
    val __obj = js.Dynamic.literal(hash = hash, pathname = pathname, search = search, state = state.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Location[S]]
  }
}

