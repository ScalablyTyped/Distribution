package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a service configuration with its name and id.
  */
@js.native
trait SchemaConfigRef extends js.Object {
  /**
    * Resource name of a service config. It must have the following format:
    * &quot;services/{service name}/configs/{config id}&quot;.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaConfigRef {
  @scala.inline
  def apply(name: String = null): SchemaConfigRef = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConfigRef]
  }
}

