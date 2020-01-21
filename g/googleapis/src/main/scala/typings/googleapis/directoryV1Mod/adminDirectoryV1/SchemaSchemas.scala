package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List Schema operation in Directory API.
  */
@js.native
trait SchemaSchemas extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of UserSchema objects.
    */
  var schemas: js.UndefOr[js.Array[SchemaSchema]] = js.native
}

object SchemaSchemas {
  @scala.inline
  def apply(etag: String = null, kind: String = null, schemas: js.Array[SchemaSchema] = null): SchemaSchemas = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSchemas]
  }
}

