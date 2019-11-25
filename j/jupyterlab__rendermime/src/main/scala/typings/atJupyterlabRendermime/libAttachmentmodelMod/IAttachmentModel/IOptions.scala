package typings.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IMimeBundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a notebook attachment model.
  */
trait IOptions extends js.Object {
  /**
    * The raw attachment value.
    */
  var value: IMimeBundle
}

object IOptions {
  @scala.inline
  def apply(value: IMimeBundle): IOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

