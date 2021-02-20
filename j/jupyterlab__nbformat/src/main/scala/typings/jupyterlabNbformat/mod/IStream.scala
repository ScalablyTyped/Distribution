package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IStreamMutableBuilder[Self <: IStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: StreamType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_type(value: stream): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: MultilineString): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
