package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPointCallback extends js.Object {
  def foundPossibleResultPoint(point: FinderPattern): Unit
}

object ResultPointCallback {
  @scala.inline
  def apply(foundPossibleResultPoint: FinderPattern => Unit): ResultPointCallback = {
    val __obj = js.Dynamic.literal(foundPossibleResultPoint = js.Any.fromFunction1(foundPossibleResultPoint))
    __obj.asInstanceOf[ResultPointCallback]
  }
}

