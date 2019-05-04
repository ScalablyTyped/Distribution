package typings
package atJupyterlabOutputareaLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOutputAreaModel
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * A signal emitted when the model changes.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    IOutputAreaModel, 
    atJupyterlabOutputareaLib.libModelMod.IOutputAreaModelNs.ChangedArgs
  ] = js.native
  /**
    * The output content factory used by the model.
    */
  val contentFactory: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModelNs.IContentFactory = js.native
  /**
    * The length of the items in the model.
    */
  val length: scala.Double = js.native
  /**
    * A signal emitted when the model state changes.
    */
  val stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IOutputAreaModel, scala.Unit] = js.native
  /**
    * Whether the output area is trusted.
    */
  var trusted: scala.Boolean = js.native
  /**
    * Add an output, which may be combined with previous output.
    *
    * #### Notes
    * The output bundle is copied.
    * Contiguous stream outputs of the same `name` are combined.
    */
  def add(output: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput): scala.Double = js.native
  /**
    * Clear all of the output.
    *
    * @param wait - Delay clearing the output until the next message is added.
    */
  def clear(): scala.Unit = js.native
  def clear(wait: scala.Boolean): scala.Unit = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * This will clear any existing data.
    */
  def fromJSON(values: js.Array[atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput]): scala.Unit = js.native
  /**
    * Get an item at the specified index.
    */
  def get(index: scala.Double): atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModel = js.native
  /**
    * Set the value at the specified index.
    */
  def set(index: scala.Double, output: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput): scala.Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): js.Array[atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput] = js.native
}

