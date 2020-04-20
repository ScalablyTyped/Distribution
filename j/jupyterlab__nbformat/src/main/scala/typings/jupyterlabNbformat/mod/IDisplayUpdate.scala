package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.update_display_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayUpdate extends IBaseOutput {
  /**
    * A mime-type keyed dictionary of data.
    */
  var data: IMimeBundle
  /**
    * Cell output metadata.
    */
  var metadata: OutputMetadata
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IDisplayUpdate: update_display_data
}

object IDisplayUpdate {
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata, output_type: update_display_data): IDisplayUpdate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayUpdate]
  }
}

