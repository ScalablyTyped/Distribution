package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.display_data
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.error
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.execute_result
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _IOutput extends StObject
object _IOutput {
  
  @scala.inline
  def IDisplayData(data: IMimeBundle, metadata: OutputMetadata, output_type: display_data): typings.jupyterlabNbformat.mod.IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IDisplayData]
  }
  
  @scala.inline
  def IError(ename: String, evalue: String, output_type: error, traceback: js.Array[String]): typings.jupyterlabNbformat.mod.IError = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IError]
  }
  
  @scala.inline
  def IExecuteResult(data: IMimeBundle, metadata: OutputMetadata, output_type: execute_result): typings.jupyterlabNbformat.mod.IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IExecuteResult]
  }
  
  @scala.inline
  def IStream(name: StreamType, output_type: stream, text: MultilineString): typings.jupyterlabNbformat.mod.IStream = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IStream]
  }
}
