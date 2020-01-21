package typings.history.mod

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
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location[S]]
  }
}

