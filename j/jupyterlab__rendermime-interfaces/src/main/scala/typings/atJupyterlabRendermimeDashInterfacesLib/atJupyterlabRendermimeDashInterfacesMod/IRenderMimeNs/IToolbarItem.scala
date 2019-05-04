package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A toolbar item.
  */
trait IToolbarItem extends js.Object {
  var name: java.lang.String
  var widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget
}

object IToolbarItem {
  @scala.inline
  def apply(name: java.lang.String, widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): IToolbarItem = {
    val __obj = js.Dynamic.literal(name = name, widget = widget)
  
    __obj.asInstanceOf[IToolbarItem]
  }
}

