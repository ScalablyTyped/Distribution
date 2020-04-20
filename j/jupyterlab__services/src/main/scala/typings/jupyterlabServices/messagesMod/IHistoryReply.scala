package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHistoryReply extends IReplyOkContent {
  var history: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]]
}

object IHistoryReply {
  @scala.inline
  def apply(history: js.Array[js.Tuple3[Double, Double, String | (js.Tuple2[String, String])]], status: ok): IHistoryReply = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryReply]
  }
}

