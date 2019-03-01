package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeekParam extends js.Object {
  var offset: scala.Double
  var position: scala.Double
}

object SeekParam {
  @scala.inline
  def apply(offset: scala.Double, position: scala.Double): SeekParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[SeekParam]
  }
}

