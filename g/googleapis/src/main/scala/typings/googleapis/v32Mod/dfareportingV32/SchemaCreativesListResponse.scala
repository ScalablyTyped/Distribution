package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative List Response
  */
@js.native
trait SchemaCreativesListResponse extends js.Object {
  /**
    * Creative collection.
    */
  var creatives: js.UndefOr[js.Array[SchemaCreative]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCreativesListResponse {
  @scala.inline
  def apply(): SchemaCreativesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativesListResponse]
  }
  @scala.inline
  implicit class SchemaCreativesListResponseOps[Self <: SchemaCreativesListResponse] (val x: Self) extends AnyVal {
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
    def setCreativesVarargs(value: SchemaCreative*): Self = this.set("creatives", js.Array(value :_*))
    @scala.inline
    def setCreatives(value: js.Array[SchemaCreative]): Self = this.set("creatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatives: Self = this.set("creatives", js.undefined)
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

