package typings.atJupyterlabRendermime.libOutputmodelMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ExecutionCount
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IOutput
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IMimeModel
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IMimeModel.ISetDataOptions
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IOutputModel")
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
    data: ReadonlyJSONObject,
    dispose: () => Unit,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    toJSON: () => IOutput,
    trusted: Boolean,
    `type`: String,
    executionCount: Int | Double = null
  ): IOutputModel_ = {
    val __obj = js.Dynamic.literal(changed = changed, data = data, dispose = js.Any.fromFunction0(dispose), metadata = metadata, setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    if (executionCount != null) __obj.updateDynamic("executionCount")(executionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutputModel_]
  }
}

