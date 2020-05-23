package typings.jupyterlabRendermime.outputmodelMod

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutputModel_ extends IMimeModel {
  /**
    * A signal emitted when the output model changes.
    */
  val changed: ISignal[this.type, Unit]
  /**
    * The execution count of the model.
    */
  val executionCount: ExecutionCount
  /**
    * The output type.
    */
  val `type`: String
  /**
    * Dispose of the resources used by the output model.
    */
  def dispose(): Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IOutput
}

object IOutputModel_ {
  @scala.inline
  def apply(
    changed: ISignal[IOutputModel_, Unit],
    data: ReadonlyPartialJSONObject,
    dispose: () => Unit,
    metadata: ReadonlyPartialJSONObject,
    setData: ISetDataOptions => Unit,
    toJSON: () => IOutput,
    trusted: Boolean,
    `type`: String,
    executionCount: ExecutionCount = null.asInstanceOf[ExecutionCount]
  ): IOutputModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], executionCount = executionCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutputModel_]
  }
}

