package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine metadata entry. Identical to the metadata on the
  * corresponding Compute Engine resource.
  */
@js.native
trait SchemaMetadata extends js.Object {
  /**
    * The fingerprint of the metadata. Required for updating the metadata
    * entries for this instance.
    */
  var fingerPrint: js.UndefOr[String] = js.native
  /**
    * A list of metadata items.
    */
  var items: js.UndefOr[js.Array[SchemaMetadataItem]] = js.native
}

object SchemaMetadata {
  @scala.inline
  def apply(fingerPrint: String = null, items: js.Array[SchemaMetadataItem] = null): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    if (fingerPrint != null) __obj.updateDynamic("fingerPrint")(fingerPrint.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadata]
  }
}

