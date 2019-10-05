package typings.atJupyterlabApputils.libDialogMod.Dialog

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget used as a dialog body.
  */
@js.native
trait IBodyWidget[T] extends Widget {
  /**
    * Get the serialized value of the widget.
    */
  var getValue: js.UndefOr[js.Function0[T]] = js.native
}

