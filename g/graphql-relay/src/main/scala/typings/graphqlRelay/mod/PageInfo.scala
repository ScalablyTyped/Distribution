package typings.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInfo extends js.Object {
  var endCursor: js.UndefOr[ConnectionCursor | Null] = js.native
  var hasNextPage: js.UndefOr[Boolean | Null] = js.native
  var hasPreviousPage: js.UndefOr[Boolean | Null] = js.native
  var startCursor: js.UndefOr[ConnectionCursor | Null] = js.native
}

object PageInfo {
  @scala.inline
  def apply(): PageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInfo]
  }
  @scala.inline
  implicit class PageInfoOps[Self <: PageInfo] (val x: Self) extends AnyVal {
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
    def setEndCursor(value: ConnectionCursor): Self = this.set("endCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndCursor: Self = this.set("endCursor", js.undefined)
    @scala.inline
    def setEndCursorNull: Self = this.set("endCursor", null)
    @scala.inline
    def setHasNextPage(value: Boolean): Self = this.set("hasNextPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasNextPage: Self = this.set("hasNextPage", js.undefined)
    @scala.inline
    def setHasNextPageNull: Self = this.set("hasNextPage", null)
    @scala.inline
    def setHasPreviousPage(value: Boolean): Self = this.set("hasPreviousPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasPreviousPage: Self = this.set("hasPreviousPage", js.undefined)
    @scala.inline
    def setHasPreviousPageNull: Self = this.set("hasPreviousPage", null)
    @scala.inline
    def setStartCursor(value: ConnectionCursor): Self = this.set("startCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCursor: Self = this.set("startCursor", js.undefined)
    @scala.inline
    def setStartCursorNull: Self = this.set("startCursor", null)
  }
  
}

