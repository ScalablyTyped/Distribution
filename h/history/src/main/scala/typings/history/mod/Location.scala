package typings.history.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location[S] extends js.Object {
  var hash: Hash = js.native
  var key: js.UndefOr[LocationKey] = js.native
  var pathname: Pathname = js.native
  var search: Search = js.native
  var state: S = js.native
}

object Location {
  @scala.inline
  def apply[S](hash: Hash, pathname: Pathname, search: Search, state: S): Location[S] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location[S]]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location[_], S] (val x: Self with Location[S]) extends AnyVal {
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
    def setHash(value: Hash): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: Pathname): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: Search): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: S): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: LocationKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

