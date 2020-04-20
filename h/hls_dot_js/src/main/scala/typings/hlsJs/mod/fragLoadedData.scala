package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragLoadedData extends js.Object {
  var frag: Fragment
  var payload: js.Any
}

object fragLoadedData {
  @scala.inline
  def apply(frag: Fragment, payload: js.Any): fragLoadedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragLoadedData]
  }
}

