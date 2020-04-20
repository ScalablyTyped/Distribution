package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.luminoWidgets.mod.Widget
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToolbarItem]
  }
}

