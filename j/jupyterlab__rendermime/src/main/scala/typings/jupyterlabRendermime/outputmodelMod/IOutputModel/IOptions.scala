package typings.jupyterlabRendermime.outputmodelMod.IOutputModel

import typings.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a notebook output model.
  */
trait IOptions extends js.Object {
  /**
    * Whether the output is trusted.  The default is false.
    */
  var trusted: js.UndefOr[Boolean] = js.undefined
  /**
    * The raw output value.
    */
  var value: IOutput
}

object IOptions {
  @scala.inline
  def apply(value: IOutput, trusted: js.UndefOr[Boolean] = js.undefined): IOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

