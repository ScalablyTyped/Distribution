package typings.jupyterlabApputils.vdomMod

import typings.jupyterlabApputils.vdomMod.VDomRenderer.IModel
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/vdom", "VDomRenderer")
@js.native
abstract class VDomRenderer_[T /* <: IModel | Null */] protected () extends ReactWidget {
  /**
    * Create a new VDomRenderer
    */
  def this(model: T | Unit) = this()
  var _model: js.Any = js.native
  var _modelChanged: js.Any = js.native
  /**
    * Get the current model.
    */
  def model: T = js.native
  /**
    * Set the model and fire changed signals.
    */
  def model(newValue: T): js.Any = js.native
  /**
    * A signal emitted when the model changes.
    */
  def modelChanged: ISignal[this.type, Unit] = js.native
}

