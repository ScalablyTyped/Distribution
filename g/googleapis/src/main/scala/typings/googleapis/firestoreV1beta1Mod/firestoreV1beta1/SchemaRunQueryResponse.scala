package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.RunQuery.
  */
@js.native
trait SchemaRunQueryResponse extends js.Object {
  /**
    * A query result. Not set when reporting partial progress.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
  /**
    * The time at which the document was read. This may be monotonically
    * increasing; in this case, the previous documents in the result stream are
    * guaranteed not to have changed between their `read_time` and this one. If
    * the query returns no results, a response with `read_time` and no
    * `document` will be sent, and this represents the time at which the query
    * was run.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * The number of results that have been skipped due to an offset between the
    * last response and the current response.
    */
  var skippedResults: js.UndefOr[Double] = js.native
  /**
    * The transaction that was started as part of this request. Can only be set
    * in the first response, and only if RunQueryRequest.new_transaction was
    * set in the request. If set, no other fields will be set in this response.
    */
  var transaction: js.UndefOr[String] = js.native
}

object SchemaRunQueryResponse {
  @scala.inline
  def apply(): SchemaRunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryResponse]
  }
  @scala.inline
  implicit class SchemaRunQueryResponseOps[Self <: SchemaRunQueryResponse] (val x: Self) extends AnyVal {
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
    def setDocument(value: SchemaDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    @scala.inline
    def setSkippedResults(value: Double): Self = this.set("skippedResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkippedResults: Self = this.set("skippedResults", js.undefined)
    @scala.inline
    def setTransaction(value: String): Self = this.set("transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
  
}

