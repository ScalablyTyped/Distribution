package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.execute_result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteResult
  extends StObject
     with IBaseOutput
     with _IOutput {
  
  /**
    * A mime-type keyed dictionary of data.
    */
  var data: IMimeBundle
  
  /**
    * A result's prompt number.
    */
  var execution_count: ExecutionCount
  
  /**
    * Cell output metadata.
    */
  var metadata: OutputMetadata
  
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IExecuteResult: execute_result
}
object IExecuteResult {
  
  inline def apply(data: IMimeBundle, metadata: OutputMetadata): IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = "execute_result", execution_count = null)
    __obj.asInstanceOf[IExecuteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExecuteResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: IMimeBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
    
    inline def setMetadata(value: OutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOutput_type(value: execute_result): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
