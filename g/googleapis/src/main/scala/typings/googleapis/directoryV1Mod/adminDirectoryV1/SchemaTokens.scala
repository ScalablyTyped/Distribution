package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List tokens operation in Directory API.
  */
@js.native
trait SchemaTokens extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * A list of Token resources.
    */
  var items: js.UndefOr[js.Array[SchemaToken]] = js.native
  /**
    * The type of the API resource. This is always admin#directory#tokenList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTokens {
  @scala.inline
  def apply(etag: String = null, items: js.Array[SchemaToken] = null, kind: String = null): SchemaTokens = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTokens]
  }
}

