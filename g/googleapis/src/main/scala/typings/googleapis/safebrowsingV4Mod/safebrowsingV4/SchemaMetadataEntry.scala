package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single metadata entry.
  */
@js.native
trait SchemaMetadataEntry extends js.Object {
  /**
    * The metadata entry key. For JSON requests, the key is base64-encoded.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The metadata entry value. For JSON requests, the value is base64-encoded.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaMetadataEntry {
  @scala.inline
  def apply(key: String = null, value: String = null): SchemaMetadataEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadataEntry]
  }
}

