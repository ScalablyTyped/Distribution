package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalIds extends js.Object {
  var errMsg: String
      // weixin album camera
  var localIds: js.Array[String]
  var sourceType: String
}

object LocalIds {
  @scala.inline
  def apply(errMsg: String, localIds: js.Array[String], sourceType: String): LocalIds = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], localIds = localIds.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalIds]
  }
}

