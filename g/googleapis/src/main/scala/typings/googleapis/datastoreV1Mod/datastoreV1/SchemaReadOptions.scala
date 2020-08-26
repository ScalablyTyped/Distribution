package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options shared by read requests.
  */
@js.native
trait SchemaReadOptions extends js.Object {
  /**
    * The non-transactional read consistency to use. Cannot be set to `STRONG`
    * for global queries.
    */
  var readConsistency: js.UndefOr[String] = js.native
  /**
    * The identifier of the transaction in which to read. A transaction
    * identifier is returned by a call to Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object SchemaReadOptions {
  @scala.inline
  def apply(): SchemaReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadOptions]
  }
  @scala.inline
  implicit class SchemaReadOptionsOps[Self <: SchemaReadOptions] (val x: Self) extends AnyVal {
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
    def setReadConsistency(value: String): Self = this.set("readConsistency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadConsistency: Self = this.set("readConsistency", js.undefined)
    @scala.inline
    def setTransaction(value: String): Self = this.set("transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
  
}

