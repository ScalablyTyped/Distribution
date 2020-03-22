package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHistoryRequestTail extends js.Object {
  var hist_access_type: tail
  var n: Double
  var output: Boolean
  var raw: Boolean
}

object IHistoryRequestTail {
  @scala.inline
  def apply(hist_access_type: tail, n: Double, output: Boolean, raw: Boolean): IHistoryRequestTail = {
    val __obj = js.Dynamic.literal(hist_access_type = hist_access_type.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHistoryRequestTail]
  }
}

