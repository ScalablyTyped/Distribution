package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for creating an operation
  */
@js.native
trait SchemaCreateOperationRequest extends js.Object {
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  /**
    * The ID to use for this operation.
    */
  var operationId: js.UndefOr[String] = js.native
}

object SchemaCreateOperationRequest {
  @scala.inline
  def apply(): SchemaCreateOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateOperationRequest]
  }
  @scala.inline
  implicit class SchemaCreateOperationRequestOps[Self <: SchemaCreateOperationRequest] (val x: Self) extends AnyVal {
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
    def setOperation(value: SchemaOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
  }
  
}

