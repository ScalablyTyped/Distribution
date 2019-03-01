package typings
package gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var endPos: scala.Double
  var startPos: scala.Double
}

object Range {
  @scala.inline
  def apply(endPos: scala.Double, startPos: scala.Double): Range = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endPos")(endPos)
    __obj.updateDynamic("startPos")(startPos)
    __obj.asInstanceOf[Range]
  }
}

