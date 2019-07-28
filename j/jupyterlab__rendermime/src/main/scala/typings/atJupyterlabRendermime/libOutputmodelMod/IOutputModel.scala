package typings.atJupyterlabRendermime.libOutputmodelMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ExecutionCount
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IOutput
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModel
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutputModel extends IMimeModel {
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

object IOutputModel {
  @scala.inline
  def apply(
    changed: ISignal[IOutputModel, Unit],
    data: ReadonlyJSONObject,
    dispose: () => Unit,
    executionCount: ExecutionCount,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    toJSON: () => IOutput,
    trusted: Boolean,
    `type`: String
  ): IOutputModel = {
    val __obj = js.Dynamic.literal(changed = changed, data = data, dispose = js.Any.fromFunction0(dispose), executionCount = executionCount.asInstanceOf[js.Any], metadata = metadata, setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IOutputModel]
  }
}

