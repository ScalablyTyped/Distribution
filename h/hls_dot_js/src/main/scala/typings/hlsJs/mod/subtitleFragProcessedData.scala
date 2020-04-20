package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subtitleFragProcessedData extends js.Object {
  var frag: Fragment
  var success: Boolean
}

object subtitleFragProcessedData {
  @scala.inline
  def apply(frag: Fragment, success: Boolean): subtitleFragProcessedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitleFragProcessedData]
  }
}

