package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstFrameParam extends js.Object {
  var loadTime: scala.Double
  var viewable: jwplayerLib.jwplayerLibNumbers.`0` | jwplayerLib.jwplayerLibNumbers.`1`
}

object FirstFrameParam {
  @scala.inline
  def apply(
    loadTime: scala.Double,
    viewable: jwplayerLib.jwplayerLibNumbers.`0` | jwplayerLib.jwplayerLibNumbers.`1`
  ): FirstFrameParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadTime")(loadTime)
    __obj.updateDynamic("viewable")(viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstFrameParam]
  }
}

