package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKernelspecMetadata extends PartialJSONObject {
  var display_name: String
  var name: String
}

object IKernelspecMetadata {
  @scala.inline
  def apply(display_name: String, name: String): IKernelspecMetadata = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKernelspecMetadata]
  }
}

