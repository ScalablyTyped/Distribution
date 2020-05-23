package typings.luminoWidgets.focustrackerMod.FocusTracker

import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the changed signals.
  */
trait IChangedArgs[T /* <: Widget */] extends js.Object {
  /**
    * The new value for the widget.
    */
  var newValue: T | Null
  /**
    * The old value for the widget.
    */
  var oldValue: T | Null
}

object IChangedArgs {
  @scala.inline
  def apply[T](newValue: T = null, oldValue: T = null): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs[T]]
  }
}

