package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  //  Token to paginate from
  var filter: Genericsearchterm = js.native
  //  The remote server to query for the room list. Optional. If unspecified, get the local home server's public room list.
  var limit: Double = js.native
  var server: String = js.native
  //  Maximum number of entries to return
  var since: String = js.native
}

object Filter {
  @scala.inline
  def apply(filter: Genericsearchterm, limit: Double, server: String, since: String): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def setFilter(value: Genericsearchterm): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
  }
  
}

