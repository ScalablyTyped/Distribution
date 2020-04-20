package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseHashtagFollow extends js.Object {
  var follow_status: Double
  var id: String
  var name: String
}

object NewsRepositoryInboxResponseHashtagFollow {
  @scala.inline
  def apply(follow_status: Double, id: String, name: String): NewsRepositoryInboxResponseHashtagFollow = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseHashtagFollow]
  }
}

