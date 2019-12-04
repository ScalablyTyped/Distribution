package typings.atJupyterlabLogconsole.libLoggerMod.LogOutputModel

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends typings.atJupyterlabRendermime.libOutputmodelMod.IOutputModel.IOptions

object IOptions {
  @scala.inline
  def apply(value: IOutput, trusted: js.UndefOr[Boolean] = js.undefined): IOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

