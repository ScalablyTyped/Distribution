package typings.atJupyterlabApputils.libDialogMod.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a dialog.
  */
trait IResult[T] extends js.Object {
  /**
    * The button that was pressed.
    */
  var button: IButton
  /**
    * The value retrieved from `.getValue()` if given on the widget.
    */
  var value: T | Null
}

object IResult {
  @scala.inline
  def apply[T](button: IButton, value: T = null): IResult[T] = {
    val __obj = js.Dynamic.literal(button = button)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult[T]]
  }
}

