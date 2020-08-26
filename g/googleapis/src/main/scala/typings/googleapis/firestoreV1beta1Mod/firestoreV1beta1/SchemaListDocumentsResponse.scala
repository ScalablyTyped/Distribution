package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.ListDocuments.
  */
@js.native
trait SchemaListDocumentsResponse extends js.Object {
  /**
    * The Documents found.
    */
  var documents: js.UndefOr[js.Array[SchemaDocument]] = js.native
  /**
    * The next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDocumentsResponse {
  @scala.inline
  def apply(): SchemaListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDocumentsResponse]
  }
  @scala.inline
  implicit class SchemaListDocumentsResponseOps[Self <: SchemaListDocumentsResponse] (val x: Self) extends AnyVal {
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
    def setDocumentsVarargs(value: SchemaDocument*): Self = this.set("documents", js.Array(value :_*))
    @scala.inline
    def setDocuments(value: js.Array[SchemaDocument]): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocuments: Self = this.set("documents", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

