package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a new transaction.
  */
@js.native
trait SchemaTransactionOptions extends js.Object {
  /**
    * The transaction can only be used for read operations.
    */
  var readOnly: js.UndefOr[SchemaReadOnly] = js.native
  /**
    * The transaction can be used for both read and write operations.
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

