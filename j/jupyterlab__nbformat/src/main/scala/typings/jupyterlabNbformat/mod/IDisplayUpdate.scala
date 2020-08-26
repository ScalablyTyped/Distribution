package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.update_display_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisplayUpdate extends IBaseOutput {
  /**
    * A mime-type keyed dictionary of data.
    */
  var data: IMimeBundle = js.native
  /**
    * Cell output metadata.
    */
  var metadata: OutputMetadata = js.native
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IDisplayUpdate: update_display_data = js.native
}

object IDisplayUpdate {
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata, output_type: update_display_data): IDisplayUpdate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayUpdate]
  }
  @scala.inline
  implicit class IDisplayUpdateOps[Self <: IDisplayUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: IMimeBundle): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: OutputMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput_type(value: update_display_data): Self = this.set("output_type", value.asInstanceOf[js.Any])
  }
  
}

