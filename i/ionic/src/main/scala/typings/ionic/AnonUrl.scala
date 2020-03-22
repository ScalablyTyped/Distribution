package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends js.Object {
  var id: String
  var url: String
}

object AnonUrl {
  @scala.inline
  def apply(id: String, url: String): AnonUrl = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUrl]
  }
}

