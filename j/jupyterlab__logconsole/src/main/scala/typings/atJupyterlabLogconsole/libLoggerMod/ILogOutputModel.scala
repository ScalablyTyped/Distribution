package typings.atJupyterlabLogconsole.libLoggerMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IOutput
import typings.atJupyterlabRendermime.libOutputmodelMod.IOutputModel
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IMimeModel.ISetDataOptions
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogOutputModel extends IOutputModel {
  /**
    * Log level
    */
  val level: FullLogLevel
  /**
    * Date & time when output is logged.
    */
  val timestamp: Date
}

object ILogOutputModel {
  @scala.inline
  def apply(
    changed: ISignal[ILogOutputModel, Unit],
    data: ReadonlyJSONObject,
    dispose: () => Unit,
    level: FullLogLevel,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    timestamp: Date,
    toJSON: () => IOutput,
    trusted: Boolean,
    `type`: String,
    executionCount: Int | Double = null
  ): ILogOutputModel = {
    val __obj = js.Dynamic.literal(changed = changed, data = data, dispose = js.Any.fromFunction0(dispose), level = level, metadata = metadata, setData = js.Any.fromFunction1(setData), timestamp = timestamp, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    if (executionCount != null) __obj.updateDynamic("executionCount")(executionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogOutputModel]
  }
}

