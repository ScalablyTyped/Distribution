package typings.googleapis.storageV1beta1Mod.storageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An access-control list.
  */
@js.native
trait SchemaBucketAccessControls extends js.Object {
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaBucketAccessControl]] = js.native
  /**
    * The kind of item this is. For lists of bucket access control entries,
    * this is always storage#bucketAccessControls.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBucketAccessControls {
  @scala.inline
  def apply(items: js.Array[SchemaBucketAccessControl] = null, kind: String = null): SchemaBucketAccessControls = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucketAccessControls]
  }
}

