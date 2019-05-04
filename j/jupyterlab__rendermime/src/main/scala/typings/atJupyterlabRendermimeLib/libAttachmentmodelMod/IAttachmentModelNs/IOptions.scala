package typings
package atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModelNs

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
  var value: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IMimeBundle
}

object IOptions {
  @scala.inline
  def apply(value: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IMimeBundle): IOptions = {
    val __obj = js.Dynamic.literal(value = value)
  
    __obj.asInstanceOf[IOptions]
  }
}

