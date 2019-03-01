package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeParam extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object ResizeParam {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): ResizeParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ResizeParam]
  }
}

