package typings.googleapis.v32Mod.dfareportingV32

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
  def apply(
    contentCategories: js.Array[SchemaContentCategory] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaContentCategoriesListResponse = {
    val __obj = js.Dynamic.literal()
    if (contentCategories != null) __obj.updateDynamic("contentCategories")(contentCategories.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContentCategoriesListResponse]
  }
}

