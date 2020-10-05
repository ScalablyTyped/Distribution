package typings.history.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationDescriptorObject[S] extends js.Object {
  var hash: js.UndefOr[Hash] = js.native
  var key: js.UndefOr[LocationKey] = js.native
  var pathname: js.UndefOr[Pathname] = js.native
  var search: js.UndefOr[Search] = js.native
  var state: js.UndefOr[S] = js.native
}

object LocationDescriptorObject {
  @scala.inline
  def apply[S](): LocationDescriptorObject[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationDescriptorObject[S]]
  }
  @scala.inline
  implicit class LocationDescriptorObjectOps[Self <: LocationDescriptorObject[_], S] (val x: Self with LocationDescriptorObject[S]) extends AnyVal {
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
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setKey(value: LocationKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPathname(value: Pathname): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    @scala.inline
    def setSearch(value: Search): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setState(value: S): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

