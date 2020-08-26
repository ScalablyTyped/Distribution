package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.BeginTransaction.
  */
@js.native
trait SchemaBeginTransactionRequest extends js.Object {
  /**
    * Options for a new transaction.
    */
  var transactionOptions: js.UndefOr[SchemaTransactionOptions] = js.native
}

object SchemaBeginTransactionRequest {
  @scala.inline
  def apply(): SchemaBeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeginTransactionRequest]
  }
  @scala.inline
  implicit class SchemaBeginTransactionRequestOps[Self <: SchemaBeginTransactionRequest] (val x: Self) extends AnyVal {
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
    def setTransactionOptions(value: SchemaTransactionOptions): Self = this.set("transactionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionOptions: Self = this.set("transactionOptions", js.undefined)
  }
  
}

