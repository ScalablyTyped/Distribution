package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocalIds extends js.Object {
  var errMsg: String
  	// weixin album camera
  var localIds: js.Array[String]
  var sourceType: String
}

object AnonLocalIds {
  @scala.inline
  def apply(errMsg: String, localIds: js.Array[String], sourceType: String): AnonLocalIds = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], localIds = localIds.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocalIds]
  }
}

