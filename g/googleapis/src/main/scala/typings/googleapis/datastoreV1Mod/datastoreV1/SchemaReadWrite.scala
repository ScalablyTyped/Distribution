package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options specific to read / write transactions.
  */
@js.native
trait SchemaReadWrite extends js.Object {
  /**
    * The transaction identifier of the transaction being retried.
    */
  var previousTransaction: js.UndefOr[String] = js.native
}

object SchemaReadWrite {
  @scala.inline
  def apply(previousTransaction: String = null): SchemaReadWrite = {
    val __obj = js.Dynamic.literal()
    if (previousTransaction != null) __obj.updateDynamic("previousTransaction")(previousTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReadWrite]
  }
}

