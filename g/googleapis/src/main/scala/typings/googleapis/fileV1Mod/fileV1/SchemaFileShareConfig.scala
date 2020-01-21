package typings.googleapis.fileV1Mod.fileV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * File share configuration for the instance.
  */
@js.native
trait SchemaFileShareConfig extends js.Object {
  /**
    * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as
    * 1024^3 bytes.
    */
  var capacityGb: js.UndefOr[String] = js.native
  /**
    * The name of the file share (must be 16 characters or less).
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaFileShareConfig {
  @scala.inline
  def apply(capacityGb: String = null, name: String = null): SchemaFileShareConfig = {
    val __obj = js.Dynamic.literal()
    if (capacityGb != null) __obj.updateDynamic("capacityGb")(capacityGb.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFileShareConfig]
  }
}

