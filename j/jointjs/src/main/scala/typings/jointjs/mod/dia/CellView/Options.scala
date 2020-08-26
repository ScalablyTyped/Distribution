package typings.jointjs.mod.dia.CellView

import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.mvc.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T /* <: Cell */] extends ViewOptions[T]

object Options {
  @scala.inline
  def apply[/* <: typings.jointjs.mod.dia.Cell */ T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
}

