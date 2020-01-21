package typings.jupyterlabLogconsole.loggerMod

import typings.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typings.phosphorSignaling.mod.ISignal
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
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), level = level.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), timestamp = timestamp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (executionCount != null) __obj.updateDynamic("executionCount")(executionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogOutputModel]
  }
}

