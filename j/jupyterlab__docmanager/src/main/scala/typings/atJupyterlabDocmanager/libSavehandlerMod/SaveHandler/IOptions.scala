package typings.atJupyterlabDocmanager.libSavehandlerMod.SaveHandler

import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
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
  def apply(context: Context, saveInterval: Int | Double = null): IOptions = {
    val __obj = js.Dynamic.literal(context = context)
    if (saveInterval != null) __obj.updateDynamic("saveInterval")(saveInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

