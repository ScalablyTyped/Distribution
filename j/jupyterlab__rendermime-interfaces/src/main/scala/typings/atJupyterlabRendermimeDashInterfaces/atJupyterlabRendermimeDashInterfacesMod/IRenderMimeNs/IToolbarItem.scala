package typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A toolbar item.
  */
trait IToolbarItem extends js.Object {
  var name: String
  var widget: Widget
}

object IToolbarItem {
  @scala.inline
  def apply(name: String, widget: Widget): IToolbarItem = {
    val __obj = js.Dynamic.literal(name = name, widget = widget)
  
    __obj.asInstanceOf[IToolbarItem]
  }
}

