package typings.jupyterlabOutputarea.modelMod

import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.ChangedArgs
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IContentFactory
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOutputAreaModel_ extends IDisposable {
  /**
    * A signal emitted when the model changes.
    */
  val changed: ISignal[IOutputAreaModel, ChangedArgs] = js.native
  /**
    * The output content factory used by the model.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * The length of the items in the model.
    */
  val length: Double = js.native
  /**
    * A signal emitted when the model state changes.
    */
  val stateChanged: ISignal[IOutputAreaModel, Unit] = js.native
  /**
    * Whether the output area is trusted.
    */
  var trusted: Boolean = js.native
  /**
    * Add an output, which may be combined with previous output.
    *
    * @returns The total number of outputs.
    *
    * #### Notes
    * The output bundle is copied.
    * Contiguous stream outputs of the same `name` are combined.
    */
  def add(output: IOutput): Double = js.native
  /**
    * Clear all of the output.
    *
    * @param wait - Delay clearing the output until the next message is added.
    */
  def clear(): Unit = js.native
  def clear(wait: Boolean): Unit = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * This will clear any existing data.
    */
  def fromJSON(values: js.Array[IOutput]): Unit = js.native
  /**
    * Get an item at the specified index.
    */
  def get(index: Double): IOutputModel = js.native
  /**
    * Set the value at the specified index.
    */
  def set(index: Double, output: IOutput): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): js.Array[IOutput] = js.native
}

