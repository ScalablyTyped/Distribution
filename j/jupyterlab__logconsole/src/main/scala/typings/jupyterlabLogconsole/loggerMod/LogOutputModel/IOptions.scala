package typings.jupyterlabLogconsole.loggerMod.LogOutputModel

import typings.jupyterlabNbformat.mod.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions

object IOptions {
  @scala.inline
  def apply(value: IOutput, trusted: js.UndefOr[Boolean] = js.undefined): IOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

