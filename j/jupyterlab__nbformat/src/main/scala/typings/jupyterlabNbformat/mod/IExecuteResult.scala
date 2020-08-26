package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.execute_result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IExecuteResultOps[Self <: IExecuteResult] (val x: Self) extends AnyVal {
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
    def setOutput_type(value: execute_result): Self = this.set("output_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecution_count(value: ExecutionCount): Self = this.set("execution_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecution_countNull: Self = this.set("execution_count", null)
  }
  
}

