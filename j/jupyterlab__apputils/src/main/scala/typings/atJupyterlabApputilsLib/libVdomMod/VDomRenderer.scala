package typings
package atJupyterlabApputilsLib.libVdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/vdom", "VDomRenderer")
@js.native
abstract class VDomRenderer[T /* <: atJupyterlabApputilsLib.libVdomMod.VDomRendererNs.IModel | scala.Null */] ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  var _model: js.Any = js.native
  var _modelChanged: js.Any = js.native
  /**
    * Set the model and fire changed signals.
    */
  /**
    * Get the current model.
    */
  var model: T | scala.Null = js.native
  /**
    * A signal emitted when the model changes.
    */
  val modelChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * Render the content of this widget using the virtual DOM.
    *
    * This method will be called anytime the widget needs to be rendered,
    * which includes layout triggered rendering and all model changes.
    *
    * Subclasses should define this method and use the current model state
    * to create a virtual node or nodes to render.
    */
  /* protected */ def render(): js.Array[reactLib.reactMod.ReactElement] | reactLib.reactMod.ReactElement | scala.Null = js.native
}

