package typings
package atJupyterlabInspectorLib.libInspectorMod.IInspectorNs

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
  var content: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget | scala.Null
  /**
    * The type of the inspector being updated.
    */
  var `type`: java.lang.String
}

object IInspectorUpdate {
  @scala.inline
  def apply(`type`: java.lang.String, content: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = null): IInspectorUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[IInspectorUpdate]
  }
}

