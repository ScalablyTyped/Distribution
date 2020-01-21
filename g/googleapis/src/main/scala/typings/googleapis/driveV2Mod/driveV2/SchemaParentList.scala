package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of a file&#39;s parents.
  */
@js.native
trait SchemaParentList extends js.Object {
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The list of parents.
    */
  var items: js.UndefOr[js.Array[SchemaParentReference]] = js.native
  /**
    * This is always drive#parentList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaParentList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaParentReference] = null,
    kind: String = null,
    selfLink: String = null
  ): SchemaParentList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParentList]
  }
}

