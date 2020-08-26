package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a transaction that can be used to read and write documents.
  */
@js.native
trait SchemaReadWrite extends js.Object {
  /**
    * An optional transaction to retry.
    */
  var retryTransaction: js.UndefOr[String] = js.native
}

object SchemaReadWrite {
  @scala.inline
  def apply(): SchemaReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadWrite]
  }
  @scala.inline
  implicit class SchemaReadWriteOps[Self <: SchemaReadWrite] (val x: Self) extends AnyVal {
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
    def setRetryTransaction(value: String): Self = this.set("retryTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryTransaction: Self = this.set("retryTransaction", js.undefined)
  }
  
}

