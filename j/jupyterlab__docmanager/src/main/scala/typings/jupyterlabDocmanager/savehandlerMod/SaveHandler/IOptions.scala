package typings.jupyterlabDocmanager.savehandlerMod.SaveHandler

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a save handler.
  */
trait IOptions extends js.Object {
  /**
    * The context asssociated with the file.
    */
  var context: Context
  /**
    * The minimum save interval in seconds (default is two minutes).
    */
  var saveInterval: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(context: Context, saveInterval: js.UndefOr[Double] = js.undefined): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (!js.isUndefined(saveInterval)) __obj.updateDynamic("saveInterval")(saveInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

