package typings.atJupyterlabLogconsole.libLoggerMod.LoggerOutputAreaModel

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IOutput
import typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModel.IContentFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModel.IOptions {
  /**
    * The maximum number of messages stored.
    */
  var maxLength: Double
}

object IOptions {
  @scala.inline
  def apply(
    maxLength: Double,
    contentFactory: IContentFactory = null,
    trusted: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[IOutput] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(maxLength = maxLength)
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[IOptions]
  }
}

