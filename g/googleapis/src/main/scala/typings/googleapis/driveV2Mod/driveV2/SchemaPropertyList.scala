package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of properties, key-value pairs that are either public or
  * private to an application.
  */
@js.native
trait SchemaPropertyList extends js.Object {
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The list of properties.
    */
  var items: js.UndefOr[js.Array[SchemaProperty]] = js.native
  /**
    * This is always drive#propertyList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaPropertyList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaProperty] = null,
    kind: String = null,
    selfLink: String = null
  ): SchemaPropertyList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPropertyList]
  }
}

