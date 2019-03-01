package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPointCallback extends js.Object {
  def foundPossibleResultPoint(point: FinderPattern): scala.Unit
}

object ResultPointCallback {
  @scala.inline
  def apply(foundPossibleResultPoint: js.Function1[FinderPattern, scala.Unit]): ResultPointCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("foundPossibleResultPoint")(foundPossibleResultPoint)
    __obj.asInstanceOf[ResultPointCallback]
  }
}

