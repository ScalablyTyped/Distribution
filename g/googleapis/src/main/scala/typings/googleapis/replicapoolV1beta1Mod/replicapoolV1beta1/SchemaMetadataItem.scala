package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine metadata item, defined as a key:value pair. Identical to
  * the metadata on the corresponding Compute Engine resource.
  */
@js.native
trait SchemaMetadataItem extends js.Object {
  /**
    * A metadata key.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * A metadata value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaMetadataItem {
  @scala.inline
  def apply(key: String = null, value: String = null): SchemaMetadataItem = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadataItem]
  }
}

