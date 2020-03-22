package typings.jupyterlabInspector.tokensMod.IInspector

import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An update value for code inspectors.
  */
trait IInspectorUpdate extends js.Object {
  /**
    * The content being sent to the inspector for display.
    */
  var content: Widget | Null
}

object IInspectorUpdate {
  @scala.inline
  def apply(content: Widget = null): IInspectorUpdate = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectorUpdate]
  }
}

