package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.display_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data displayed as a result of code cell execution.
  */
trait IDisplayData
  extends IBaseOutput
     with _IOutput {
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
  var output_type_IDisplayData: display_data
}

object IDisplayData {
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata, output_type: display_data): IDisplayData = {
    val __obj = js.Dynamic.literal(data = data, metadata = metadata, output_type = output_type)
  
    __obj.asInstanceOf[IDisplayData]
  }
}

