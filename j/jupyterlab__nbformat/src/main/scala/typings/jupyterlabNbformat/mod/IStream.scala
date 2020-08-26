package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStream
  extends IBaseOutput
     with _IOutput {
  /**
    * The name of the stream.
    */
  var name: StreamType = js.native
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IStream: stream = js.native
  /**
    * The stream's text output.
    */
  var text: MultilineString = js.native
}

object IStream {
  @scala.inline
  def apply(name: StreamType, output_type: stream, text: MultilineString): IStream = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStream]
  }
  @scala.inline
  implicit class IStreamOps[Self <: IStream] (val x: Self) extends AnyVal {
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
    def setName(value: StreamType): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput_type(value: stream): Self = this.set("output_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: MultilineString): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

