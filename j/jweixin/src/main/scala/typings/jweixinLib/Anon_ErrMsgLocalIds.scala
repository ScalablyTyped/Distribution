package typings
package jweixinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsgLocalIds extends js.Object {
  var errMsg: java.lang.String
  	// weixin album camera
  var localIds: js.Array[java.lang.String]
  var sourceType: java.lang.String
}

object Anon_ErrMsgLocalIds {
  @scala.inline
  def apply(errMsg: java.lang.String, localIds: js.Array[java.lang.String], sourceType: java.lang.String): Anon_ErrMsgLocalIds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.updateDynamic("localIds")(localIds)
    __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[Anon_ErrMsgLocalIds]
  }
}

