package typings
package atJupyterlabApputilsLib.libMainareawidgetMod.MainAreaWidgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for main area widget subclasses providing their own
  * default content.
  *
  * #### Notes
  * This makes it easier to have a subclass that provides its own default
  * content. This can go away once we upgrade to TypeScript 2.8 and have an
  * easy way to make a single property optional, ala
  * https://stackoverflow.com/a/46941824
  */
trait IOptionsOptionalContent[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atPhosphorWidgetsLib.libWidgetMod.WidgetNs.IOptions {
  /**
    * The child widget to wrap.
    */
  var content: js.UndefOr[T] = js.undefined
  /**
    * An optional promise for when the content is ready to be revealed.
    */
  var reveal: js.UndefOr[js.Promise[_]] = js.undefined
  /**
    * The toolbar to use for the widget.  Defaults to an empty toolbar.
    */
  var toolbar: js.UndefOr[
    atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.undefined
}

object IOptionsOptionalContent {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    content: T = null,
    node: stdLib.HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = null
  ): IOptionsOptionalContent[T] = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[IOptionsOptionalContent[T]]
  }
}

