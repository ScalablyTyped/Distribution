package typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget

import typings.jupyterlabApputils.toolbarMod.Toolbar
import typings.luminoWidgets.mod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a main area widget.
  */
trait IOptions[T /* <: Widget */]
  extends typings.luminoWidgets.widgetMod.Widget.IOptions {
  /**
    * The child widget to wrap.
    */
  var content: T
  /**
    * An optional promise for when the content is ready to be revealed.
    */
  var reveal: js.UndefOr[js.Promise[_]] = js.undefined
  /**
    * The toolbar to use for the widget.  Defaults to an empty toolbar.
    */
  var toolbar: js.UndefOr[Toolbar[Widget]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[/* <: typings.luminoWidgets.mod.Widget */ T](
    content: T,
    node: HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: Toolbar[Widget] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (reveal != null) __obj.updateDynamic("reveal")(reveal.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

