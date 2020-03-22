package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseOutput extends PartialJSONObject {
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

