package typings.gridfsDashStream.gridfsDashStreamMod.GridFSStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var endPos: Double
  var startPos: Double
}

object Range {
  @scala.inline
  def apply(endPos: Double, startPos: Double): Range = {
    val __obj = js.Dynamic.literal(endPos = endPos, startPos = startPos)
  
    __obj.asInstanceOf[Range]
  }
}

