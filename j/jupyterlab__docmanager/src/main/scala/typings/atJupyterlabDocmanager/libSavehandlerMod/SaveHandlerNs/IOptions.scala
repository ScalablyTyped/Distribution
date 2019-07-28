package typings.atJupyterlabDocmanager.libSavehandlerMod.SaveHandlerNs

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
  var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any
  /**
    * The minimum save interval in seconds (default is two minutes).
    */
  var saveInterval: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any,
    saveInterval: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context)
    if (saveInterval != null) __obj.updateDynamic("saveInterval")(saveInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

