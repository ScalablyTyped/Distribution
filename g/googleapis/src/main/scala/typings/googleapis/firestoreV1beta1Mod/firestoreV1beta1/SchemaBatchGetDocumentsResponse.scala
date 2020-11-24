package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaBatchGetDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetDocumentsResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchGetDocumentsResponseOps[Self <: SchemaBatchGetDocumentsResponse] (val x: Self) extends AnyVal {
    
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
    def setFound(value: SchemaDocument): Self = this.set("found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFound: Self = this.set("found", js.undefined)
    
    @scala.inline
    def setMissing(value: String): Self = this.set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
