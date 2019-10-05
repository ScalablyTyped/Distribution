package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The kernelspec metadata.
  */
trait IKernelspecMetadata extends JSONObject {
  var display_name: String
  var name: String
}

object IKernelspecMetadata {
  @scala.inline
  def apply(display_name: String, name: String): IKernelspecMetadata = {
    val __obj = js.Dynamic.literal(display_name = display_name, name = name)
  
    __obj.asInstanceOf[IKernelspecMetadata]
  }
}

