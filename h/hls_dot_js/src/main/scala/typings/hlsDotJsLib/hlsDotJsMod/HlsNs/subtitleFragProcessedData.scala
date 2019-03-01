package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subtitleFragProcessedData extends js.Object {
  var frag: Fragment
  var success: scala.Boolean
}

object subtitleFragProcessedData {
  @scala.inline
  def apply(frag: Fragment, success: scala.Boolean): subtitleFragProcessedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frag")(frag)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[subtitleFragProcessedData]
  }
}

