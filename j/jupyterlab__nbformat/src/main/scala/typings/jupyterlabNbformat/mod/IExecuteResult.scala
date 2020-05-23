package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.execute_result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteResult
  extends IBaseOutput
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
  @scala.inline
  def apply(
    data: IMimeBundle,
    metadata: OutputMetadata,
    output_type: execute_result,
    execution_count: ExecutionCount = null.asInstanceOf[ExecutionCount]
  ): IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResult]
  }
}

