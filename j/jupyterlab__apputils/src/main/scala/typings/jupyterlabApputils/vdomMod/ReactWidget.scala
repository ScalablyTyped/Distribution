package typings.jupyterlabApputils.vdomMod

import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils/lib/vdom", "ReactWidget")
@js.native
abstract class ReactWidget () extends Widget {
  
  /**
    * Render the content of this widget using the virtual DOM.
    *
    * This method will be called anytime the widget needs to be rendered, which
    * includes layout triggered rendering.
    *
    * Subclasses should define this method and return the root React nodes here.
    */
  /* protected */ def render(): ReactRenderElement | Null = js.native
  
  /**
    * Render the React nodes to the DOM.
    *
    * @returns a promise that resolves when the rendering is done.
    */
  var renderDOM: js.Any = js.native
  
  var renderPromise: js.UndefOr[js.Promise[Unit]] = js.native
}
/* static members */
@JSImport("@jupyterlab/apputils/lib/vdom", "ReactWidget")
@js.native
object ReactWidget extends js.Object {
  
  /**
    * Creates a new `ReactWidget` that renders a constant element.
    * @param element React element to render.
    */
  def create(element: ReactRenderElement): ReactWidget = js.native
}
