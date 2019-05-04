package typings
package atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModelNs

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
  var trusted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The raw output value.
    */
  var value: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput
}

object IOptions {
  @scala.inline
  def apply(
    value: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput,
    trusted: js.UndefOr[scala.Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted)
    __obj.asInstanceOf[IOptions]
  }
}

