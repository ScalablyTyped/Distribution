package typings.jupyterlabApputils.dialogMod.Dialog

import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
