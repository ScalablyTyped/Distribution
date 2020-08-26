package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Field Value List Response
  */
@js.native
trait SchemaCreativeFieldValuesListResponse extends js.Object {
  /**
    * Creative field value collection.
    */
  var creativeFieldValues: js.UndefOr[js.Array[SchemaCreativeFieldValue]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeFieldValuesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCreativeFieldValuesListResponse {
  @scala.inline
  def apply(): SchemaCreativeFieldValuesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeFieldValuesListResponse]
  }
  @scala.inline
  implicit class SchemaCreativeFieldValuesListResponseOps[Self <: SchemaCreativeFieldValuesListResponse] (val x: Self) extends AnyVal {
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
    def setCreativeFieldValuesVarargs(value: SchemaCreativeFieldValue*): Self = this.set("creativeFieldValues", js.Array(value :_*))
    @scala.inline
    def setCreativeFieldValues(value: js.Array[SchemaCreativeFieldValue]): Self = this.set("creativeFieldValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeFieldValues: Self = this.set("creativeFieldValues", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

