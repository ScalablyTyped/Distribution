package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.execute_result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteResult
  extends IBaseOutput
     with _IOutput {
  
  /**
    * A mime-type keyed dictionary of data.
    */
  var data: IMimeBundle = js.native
  
  /**
    * A result's prompt number.
    */
  var execution_count: ExecutionCount = js.native
  
  /**
    * Cell output metadata.
    */
  var metadata: OutputMetadata = js.native
  
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IExecuteResult: execute_result = js.native
}
object IExecuteResult {
  
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata, output_type: execute_result): IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResult]
  }
  
  @scala.inline
  implicit class IExecuteResultMutableBuilder[Self <: IExecuteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IMimeBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
    
    @scala.inline
    def setMetadata(value: OutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_type(value: execute_result): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
