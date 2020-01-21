package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about amount of some resource in the cluster. For
  * memory, value should be in GB.
  */
@js.native
trait SchemaResourceLimit extends js.Object {
  /**
    * Maximum amount of the resource in the cluster.
    */
  var maximum: js.UndefOr[String] = js.native
  /**
    * Minimum amount of the resource in the cluster.
    */
  var minimum: js.UndefOr[String] = js.native
  /**
    * Resource name &quot;cpu&quot;, &quot;memory&quot; or gpu-specific string.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object SchemaResourceLimit {
  @scala.inline
  def apply(maximum: String = null, minimum: String = null, resourceType: String = null): SchemaResourceLimit = {
    val __obj = js.Dynamic.literal()
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceLimit]
  }
}

