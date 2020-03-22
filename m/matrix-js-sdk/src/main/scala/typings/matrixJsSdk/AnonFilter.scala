package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  //  Token to paginate from
  var filter: AnonGenericsearchterm
  //  The remote server to query for the room list. Optional. If unspecified, get the local home server's public room list.
  var limit: Double
  var server: String
  //  Maximum number of entries to return
  var since: String
}

object AnonFilter {
  @scala.inline
  def apply(filter: AnonGenericsearchterm, limit: Double, server: String, since: String): AnonFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilter]
  }
}

