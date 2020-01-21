package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for beginning a new transaction.  Transactions can be created
  * explicitly with calls to Datastore.BeginTransaction or implicitly by
  * setting ReadOptions.new_transaction in read requests.
  */
@js.native
trait SchemaTransactionOptions extends js.Object {
  /**
    * The transaction should only allow reads.
    */
  var readOnly: js.UndefOr[SchemaReadOnly] = js.native
  /**
    * The transaction should allow both reads and writes.
    */
  var readWrite: js.UndefOr[SchemaReadWrite] = js.native
}

object SchemaTransactionOptions {
  @scala.inline
  def apply(readOnly: SchemaReadOnly = null, readWrite: SchemaReadWrite = null): SchemaTransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (readWrite != null) __obj.updateDynamic("readWrite")(readWrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransactionOptions]
  }
}

