package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content Category List Response
  */
@js.native
trait SchemaContentCategoriesListResponse extends js.Object {
  /**
    * Content category collection.
    */
  var contentCategories: js.UndefOr[js.Array[SchemaContentCategory]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#contentCategoriesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaContentCategoriesListResponse {
  @scala.inline
  def apply(): SchemaContentCategoriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentCategoriesListResponse]
  }
  @scala.inline
  implicit class SchemaContentCategoriesListResponseOps[Self <: SchemaContentCategoriesListResponse] (val x: Self) extends AnyVal {
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
    def setContentCategoriesVarargs(value: SchemaContentCategory*): Self = this.set("contentCategories", js.Array(value :_*))
    @scala.inline
    def setContentCategories(value: js.Array[SchemaContentCategory]): Self = this.set("contentCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentCategories: Self = this.set("contentCategories", js.undefined)
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

