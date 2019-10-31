package typings.atJupyterlabLogconsole.libLoggerMod

import typings.atJupyterlabLogconsole.libLoggerMod.LoggerOutputAreaModel.IOptions
import typings.atJupyterlabOutputarea.atJupyterlabOutputareaMod.OutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable because Already inherited
- typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModel because Already inherited
- typings.atJupyterlabLogconsole.libTokensMod.ILoggerOutputAreaModel because var conflicts: trusted. Inlined maxLength */ @JSImport("@jupyterlab/logconsole/lib/logger", "LoggerOutputAreaModel")
@js.native
class LoggerOutputAreaModel_ protected () extends OutputAreaModel {
  def this(hasMaxLengthOptions: IOptions) = this()
  /**
    * Manually apply length limit.
    */
  var _applyMaxLength: js.Any = js.native
  var _maxLength: js.Any = js.native
  /**
    * Maximum number of outputs to store in the model.
    */
  var maxLength: Double = js.native
}

