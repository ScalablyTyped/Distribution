package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base output type.
  */
trait IBaseOutput extends JSONObject {
  /**
    * Type of cell output.
    */
  var output_type: String
}

object IBaseOutput {
  @scala.inline
  def apply(output_type: String): IBaseOutput = {
    val __obj = js.Dynamic.literal(output_type = output_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBaseOutput]
  }
}

