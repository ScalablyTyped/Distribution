package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var shortUrl: String
  var url: String
}

object AnonId {
  @scala.inline
  def apply(id: String, shortUrl: String, url: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], shortUrl = shortUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

