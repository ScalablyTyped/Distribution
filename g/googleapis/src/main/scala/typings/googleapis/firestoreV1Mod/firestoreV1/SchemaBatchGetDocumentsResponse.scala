package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The streamed response for Firestore.BatchGetDocuments.
  */
@js.native
trait SchemaBatchGetDocumentsResponse extends js.Object {
  /**
    * A document that was requested.
    */
  var found: js.UndefOr[SchemaDocument] = js.native
  /**
    * A document name that was requested but does not exist. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var missing: js.UndefOr[String] = js.native
  /**
    * The time at which the document was read. This may be monotically
    * increasing, in this case the previous documents in the result stream are
    * guaranteed not to have changed between their read_time and this one.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * The transaction that was started as part of this request. Will only be
    * set in the first response, and only if
    * BatchGetDocumentsRequest.new_transaction was set in the request.
    */
  var transaction: js.UndefOr[String] = js.native
}

object SchemaBatchGetDocumentsResponse {
  @scala.inline
  def apply(
    found: SchemaDocument = null,
    missing: String = null,
    readTime: String = null,
    transaction: String = null
  ): SchemaBatchGetDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (found != null) __obj.updateDynamic("found")(found.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchGetDocumentsResponse]
  }
}

