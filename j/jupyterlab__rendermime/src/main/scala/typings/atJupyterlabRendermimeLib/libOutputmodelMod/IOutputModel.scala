package typings
package atJupyterlabRendermimeLib.libOutputmodelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutputModel
  extends atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModel {
  /**
    * A signal emitted when the output model changes.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit]
  /**
    * The execution count of the model.
    */
  val executionCount: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ExecutionCount
  /**
    * The output type.
    */
  val `type`: java.lang.String
  /**
    * Dispose of the resources used by the output model.
    */
  def dispose(): scala.Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput
}

object IOutputModel {
  @scala.inline
  def apply(
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IOutputModel, scala.Unit],
    data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    dispose: () => scala.Unit,
    executionCount: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ExecutionCount,
    metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    setData: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions => scala.Unit,
    toJSON: () => atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput,
    trusted: scala.Boolean,
    `type`: java.lang.String
  ): IOutputModel = {
    val __obj = js.Dynamic.literal(changed = changed, data = data, dispose = js.Any.fromFunction0(dispose), executionCount = executionCount.asInstanceOf[js.Any], metadata = metadata, setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IOutputModel]
  }
}

