package typings.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionArguments extends js.Object {
  var after: js.UndefOr[ConnectionCursor | Null] = js.native
  var before: js.UndefOr[ConnectionCursor | Null] = js.native
  var first: js.UndefOr[Double | Null] = js.native
  var last: js.UndefOr[Double | Null] = js.native
}

object ConnectionArguments {
  @scala.inline
  def apply(): ConnectionArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionArguments]
  }
  @scala.inline
  implicit class ConnectionArgumentsOps[Self <: ConnectionArguments] (val x: Self) extends AnyVal {
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
    def setAfter(value: ConnectionCursor): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAfterNull: Self = this.set("after", null)
    @scala.inline
    def setBefore(value: ConnectionCursor): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBeforeNull: Self = this.set("before", null)
    @scala.inline
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setFirstNull: Self = this.set("first", null)
    @scala.inline
    def setLast(value: Double): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setLastNull: Self = this.set("last", null)
  }
  
}

