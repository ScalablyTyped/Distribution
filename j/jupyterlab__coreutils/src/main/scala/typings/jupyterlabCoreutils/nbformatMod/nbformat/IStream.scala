package typings.jupyterlabCoreutils.nbformatMod.nbformat

import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stream output from a code cell.
  */
trait IStream
  extends IBaseOutput
     with _IOutput {
  /**
    * The name of the stream.
    */
  var name: StreamType
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IStream: stream
  /**
    * The stream's text output.
    */
  var text: MultilineString
}

object IStream {
  @scala.inline
  def apply(name: StreamType, output_type: stream, text: MultilineString): IStream = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStream]
  }
}

