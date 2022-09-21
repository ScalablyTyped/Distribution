package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStream
  extends StObject
     with IBaseOutput
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
  
  inline def apply(name: StreamType, text: MultilineString): IStream = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = "stream", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStream]
  }
  
  extension [Self <: IStream](x: Self) {
    
    inline def setName(value: StreamType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput_type(value: stream): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
    
    inline def setText(value: MultilineString): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
