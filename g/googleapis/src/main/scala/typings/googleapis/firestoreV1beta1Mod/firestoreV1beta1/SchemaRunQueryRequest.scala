package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.RunQuery.
  */
@js.native
trait SchemaRunQueryRequest extends js.Object {
  /**
    * Starts a new transaction and reads the documents. Defaults to a read-only
    * transaction. The new transaction ID will be returned as the first
    * response in the stream.
    */
  var newTransaction: js.UndefOr[SchemaTransactionOptions] = js.native
  /**
    * Reads documents as they were at the given time. This may not be older
    * than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * A structured query.
    */
  var structuredQuery: js.UndefOr[SchemaStructuredQuery] = js.native
  /**
    * Reads documents in a transaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object SchemaRunQueryRequest {
  @scala.inline
  def apply(
    newTransaction: SchemaTransactionOptions = null,
    readTime: String = null,
    structuredQuery: SchemaStructuredQuery = null,
    transaction: String = null
  ): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (newTransaction != null) __obj.updateDynamic("newTransaction")(newTransaction.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (structuredQuery != null) __obj.updateDynamic("structuredQuery")(structuredQuery.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
}

