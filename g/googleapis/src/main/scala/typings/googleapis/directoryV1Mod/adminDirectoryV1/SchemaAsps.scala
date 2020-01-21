package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAsps extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * A list of ASP resources.
    */
  var items: js.UndefOr[js.Array[SchemaAsp]] = js.native
  /**
    * The type of the API resource. This is always admin#directory#aspList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAsps {
  @scala.inline
  def apply(etag: String = null, items: js.Array[SchemaAsp] = null, kind: String = null): SchemaAsps = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsps]
  }
}

