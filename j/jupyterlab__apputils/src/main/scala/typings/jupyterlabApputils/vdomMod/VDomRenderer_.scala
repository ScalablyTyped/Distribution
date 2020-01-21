package typings.jupyterlabApputils.vdomMod

import typings.jupyterlabApputils.vdomMod.VDomRenderer.IModel
import typings.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/vdom", "VDomRenderer")
@js.native
abstract class VDomRenderer_[T /* <: IModel | Null */] () extends ReactWidget {
  var _model: js.Any = js.native
  var _modelChanged: js.Any = js.native
  /**
    * Set the model and fire changed signals.
    */
  /**
    * Get the current model.
    */
  var model: T | Null = js.native
  /**
    * A signal emitted when the model changes.
    */
  val modelChanged: ISignal[this.type, Unit] = js.native
}

