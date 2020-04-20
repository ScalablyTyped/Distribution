package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragChangedData extends js.Object {
  var frag: Fragment
  var id: String
}

object fragChangedData {
  @scala.inline
  def apply(frag: Fragment, id: String): fragChangedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragChangedData]
  }
}

